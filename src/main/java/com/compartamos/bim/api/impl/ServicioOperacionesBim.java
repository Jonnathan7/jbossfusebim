package com.compartamos.bim.api.impl;

import java.io.IOException;
import java.math.BigDecimal;

import javax.xml.ws.Holder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.compartamos.bim.api.IServicioOperacionesBim;
import com.compartamos.bim.model.OperacionRpt;
import com.compartamos.bim.model.PonerPlataRqt;
import com.compartamos.bim.model.ReversalRequest;
import com.compartamos.bim.model.SacarPlataRqt;
import com.compartamos.bim.model.TransaccionVarias;
import com.compartamos.bim.model.AtmCashOutRequest;
import com.compartamos.bim.model.CashInRequest;
import com.compartamos.bim.util.Constantes;
import com.compartamos.bim.util.Funciones;
import com.compartamos.bim.util.Mensajes;
import com.compartamos.bim.util.ResponseDto;

import pe.com.creararequipa.webservices.WSMiddleWare;
import pe.com.creararequipa.webservices.WSMiddleWareSoap;
import pe.com.creararequipa.webservices.ClEntidadDeNegocioTransaccionResponseType;

import com.compartamos.bim.repositorio.RepositorioOperacionesBim;
import com.compartamos.bim.util.Base;
import com.fasterxml.jackson.core.JsonProcessingException;

public class ServicioOperacionesBim extends Base implements IServicioOperacionesBim {

	WSMiddleWare servicio =  getSOAPService();
	WSMiddleWareSoap cliente = servicio.getWSMiddleWareSoap();

	private static final Logger LOG = LoggerFactory.getLogger(ServicioOperacionesBim.class);

	public ServicioOperacionesBim() throws IOException { super(); }

	private TransaccionVarias transaccionBasePonerPlata(PonerPlataRqt peticion) {
		TransaccionVarias opeBase = new TransaccionVarias();
		opeBase.setCodigoTransaccion(peticion.getCodigoTransaccion());
		opeBase.setTransaccionId(Constantes.EMPTY_STRING);
		opeBase.setCodigoCliente(peticion.getCodigoCliente());
		opeBase.setNumeroCelular(peticion.getCelularRecibe());
		opeBase.setMoneda(peticion.getMoneda());
		opeBase.setMonto(peticion.getMonto());
		opeBase.setCodigoOficina(peticion.getCodigoOficina());
		opeBase.setCodigoUsuario(peticion.getCodigoUsuario());
		opeBase.setIdSession(peticion.getIdSession());
		opeBase.setEstado(Constantes.Pendiente_279);
		return opeBase;		
	}
	
	private CashInRequest solicitudPDPCashin(PonerPlataRqt peticion) {
		CashInRequest solicitudPdp = new CashInRequest();
		solicitudPdp.setReceivingfri(Funciones.celularFormatoPdp(peticion.getCelularRecibe()));
		solicitudPdp.setSendingfri(peticion.getAgenteEnvia());
		solicitudPdp.setAmount(peticion.getMonto().toString());
		return solicitudPdp;
	}
	
	private void actualizaCandmet(TransaccionVarias opeBase) throws JsonProcessingException{
		String urlActualizaCandmet = propiedades.getProperty(Constantes.URL_REST_BIM).trim() + Constantes.actualizaTransaccionBim;
		RepositorioOperacionesBim repositorioOperaciones = new RepositorioOperacionesBim();
		ResponseDto<String> opeLinea = repositorioOperaciones.actualizarTransaccionLineaCfis(opeBase, urlActualizaCandmet);
		if(!opeLinea.getIsSuccess() || opeLinea.getIsWarning()) {
			registrarLogServicio(Funciones.obtenerEntidadLog(Constantes.Todos_774, Funciones.objectToJson(opeBase), opeLinea.getTrama(), opeBase.getCodigoUsuario(), opeBase.getCodigoOficina()));
		}
	}
	
	public ResponseDto<OperacionRpt> ponerPlata(String token, PonerPlataRqt peticion) {
		ResponseDto<OperacionRpt> ponerPlata = new ResponseDto<>(true,Constantes.EMPTY_STRING);
		String jsonSolicitudPdp = Constantes.EMPTY_STRING;
		RepositorioOperacionesBim repositorioOperaciones = new RepositorioOperacionesBim();
		String urlPonerPlataPDP = propiedades.getProperty(Constantes.URL_REST_PDP_PONER_PLATA).trim() + Constantes.context_fcompartamos + Constantes.cashInPdp;
		String urlRegistroCandmet = propiedades.getProperty(Constantes.URL_REST_BIM).trim() + Constantes.transaccionesBim;
		Holder<String> error = new Holder<String>();
		error.value  = Constantes.EMPTY_STRING;
		
        try {
        	//Validar parámetros de entrada
			if( Funciones.isNullOrEmpty(peticion.getAgenteEnvia())     
				|| Funciones.isNullOrEmpty(peticion.getCelularRecibe())   
				|| peticion.getMonto() == null || peticion.getMonto() == BigDecimal.ZERO
			) {
				ponerPlata.setIsSuccess(false);
				ponerPlata.setIsWarning(true);
				ponerPlata.setMessage(Mensajes._M_ERROR_PARAMETROS_INCOMPLETOS);
				return ponerPlata;
			}

			//Asignar datos Cash In Compartamos y PDP
			TransaccionVarias opeBase = transaccionBasePonerPlata(peticion); 
			CashInRequest solicitudPdp = solicitudPDPCashin(peticion);
			jsonSolicitudPdp = Funciones.objectToJson(solicitudPdp);
			
			//Registrar Candmet
			ResponseDto<String> opeLinea = repositorioOperaciones.transaccionLineaCfis(opeBase, urlRegistroCandmet);
			if(!opeLinea.getIsSuccess() || opeLinea.getIsWarning()){
				ponerPlata.setIsSuccess(false);
				ponerPlata.setIsWarning(true);
				ponerPlata.setMessage(Mensajes._M_ERROR_OPERACION_INTENTE_NUEVAMENTE);
				ponerPlata.setCodigoError(Constantes.ERROR_REGRISTRAR_TRAMAS_777);
				//0*
				registrarLogServicio(Funciones.obtenerEntidadLog(Constantes.Todos_774, Funciones.objectToJson(opeBase), opeLinea.getTrama(), peticion.getCodigoUsuario(), peticion.getCodigoOficina()));
				return ponerPlata;
			}else {
				opeBase.setIdentificadorMet(Integer.valueOf(opeLinea.getData()));
			}
			
			//Realizar Cash In en PDP.
			String encoding = Funciones.usuarioToBase64(peticion.getUsuarioPassword());			
			ponerPlata = repositorioOperaciones.operacionPonerPlata(solicitudPdp, encoding, urlPonerPlataPDP);
			
			//1*
			registrarLogServicio(Funciones.obtenerEntidadLog(Constantes.Poner_Plata_774, jsonSolicitudPdp, ponerPlata.getTrama(), peticion.getCodigoUsuario(), peticion.getCodigoOficina()));
			if(!ponerPlata.getIsSuccess()) {
				opeBase.setEstado(Constantes.Completado_279);
				actualizaCandmet(opeBase);
				return ponerPlata;
			}else {
				opeBase.setTransaccionId(ponerPlata.getData().getTransaccionId());
				opeBase.setMontoComision(ponerPlata.getData().getMontoComision());
				actualizaCandmet(opeBase);
			}
			
			//Realizar Cash In en Compartamos
			ClEntidadDeNegocioTransaccionResponseType operacionCfis = transaccionVarias(opeBase, error);
			
			//Error Cash In Compartamos
			if(operacionCfis == null || error.value.length() > 0){
				ponerPlata.setIsSuccess(false);
				ponerPlata.setIsWarning(true);
				ponerPlata.setCodigoError(Constantes.ERROR_ABRIR_FORMULARIO_999);
				ponerPlata.setMessage(Constantes.RECIBIR + Constantes.UN_ESPACIO_STRING + Mensajes._M_DINERO_CLIENTE_CONTINUAR);
				//3*
				registrarLogServicio(Funciones.obtenerEntidadLog(Constantes.Todos_774, Funciones.objectToJson(opeBase), error.value, peticion.getCodigoUsuario(), peticion.getCodigoOficina()));
				return ponerPlata;
			}else {
				opeBase.setEstado(Constantes.Completado_279);
				actualizaCandmet(opeBase);
			}
			
			//Asignar datos operación exitosa
			OperacionRpt ponerPlataCfis = new OperacionRpt();
			ponerPlataCfis = ponerPlata.getData();
			ponerPlataCfis.setNumeroDocumento(operacionCfis.getPcNroDoc());
			ponerPlataCfis.setFechaModificacion(operacionCfis.getPcFecMod());
			ponerPlata.setIsSuccess(true);
			ponerPlata.setIsWarning(false);
			ponerPlata.setData(ponerPlataCfis);
		
		} catch (Exception e) {		
			LOG.error(e.getMessage());
			ponerPlata.setCodigoError(Constantes.Error_critico);
			ponerPlata.setIsSuccess(false);
			ponerPlata.setIsWarning(true);
			ponerPlata.setMessage(e.getMessage());
			//4*
			registrarLogServicio(Funciones.obtenerEntidadLog(Constantes.Todos_774, jsonSolicitudPdp, e.getMessage(), peticion.getCodigoUsuario(), peticion.getCodigoOficina()));			
		}

		return ponerPlata;
	}

	public ResponseDto<OperacionRpt> sacarPlata(String token, SacarPlataRqt peticion) {
		ResponseDto<OperacionRpt> sacarPlata = new ResponseDto<>(true,Constantes.EMPTY_STRING);		
		String jsonSolicitudPdp = Constantes.EMPTY_STRING;
		
        try {
        	
			if(     
				Funciones.isNullOrEmpty(peticion.getCelularOrigen())   
				|| peticion.getMonto() == null || peticion.getMonto() == BigDecimal.ZERO
			) {
				sacarPlata.setIsSuccess(false);
				sacarPlata.setIsWarning(true);
				sacarPlata.setMessage(Mensajes._M_ERROR_PARAMETROS_INCOMPLETOS);
				return sacarPlata;
			}			
			
			String encoding = Funciones.usuarioToBase64(peticion.getUsuarioPassword());		
					
			String urlSacarPlata = propiedades.getProperty(Constantes.URL_REST_PDP_SACAR_PLATA).trim() + Constantes.context_fcompartamos + Constantes.cashOutPdp;
			
			AtmCashOutRequest solicitudPdp = new AtmCashOutRequest();			
			solicitudPdp.setExternal_transaction_id(peticion.getIdExternoTransaccion());	
			solicitudPdp.setMsisdn(Constantes.PREFIJO_TEL_PERU + peticion.getCelularOrigen());	
			solicitudPdp.setOtp(peticion.getCodigoOtp());
			solicitudPdp.setAmount(peticion.getMonto().toString());		
			
			RepositorioOperacionesBim repositorioOperaciones = new RepositorioOperacionesBim();
			sacarPlata = repositorioOperaciones.operacionSacarPlata(solicitudPdp, encoding, urlSacarPlata);
			jsonSolicitudPdp = Funciones.objectToJson(solicitudPdp);
			//1*
			registrarLogServicio(Funciones.obtenerEntidadLog(Constantes.Sacar_Plata_774, jsonSolicitudPdp, sacarPlata.getTrama(), peticion.getCodigoUsuario(), peticion.getCodigoOficina()));
			
			if(!sacarPlata.getIsSuccess()) {
				return sacarPlata;					
			}
					
			Holder<String> error = new Holder<String>();
			error.value  = Constantes.EMPTY_STRING;			
		
			TransaccionVarias opeBase = new TransaccionVarias();
			opeBase.setCodigoTransaccion(peticion.getCodigoTransaccion());
			opeBase.setTransaccionId(sacarPlata.getData().getTransaccionId());
			opeBase.setCodigoCliente(peticion.getCodigoCliente());
			opeBase.setNumeroCelular(peticion.getCelularOrigen());
			opeBase.setMoneda(peticion.getMoneda());
			opeBase.setMonto(peticion.getMonto());
			opeBase.setMontoComision(sacarPlata.getData().getMontoComision());		
			opeBase.setCodigoOficina(peticion.getCodigoOficina());
			opeBase.setCodigoUsuario(peticion.getCodigoUsuario());
			opeBase.setIdSession(peticion.getIdSession());			
			opeBase.setEstado(Constantes.Completado_279);
			
			boolean seHisoExtorno = false;
			ClEntidadDeNegocioTransaccionResponseType operacionCfis = transaccionVarias(opeBase, error);						
			if(operacionCfis == null || error.value.length() > 0) {				
			
				//2*
				String jsonTransaccionesVarias = Funciones.objectToJson(opeBase);
				registrarLogServicio(Funciones.obtenerEntidadLog(Constantes.Todos_774, jsonTransaccionesVarias, error.value, peticion.getCodigoUsuario(), peticion.getCodigoOficina()));

				String urlReversal = propiedades.getProperty(Constantes.URL_REST_PDP_REVERSAL_SACAR_PLATA).trim() + Constantes.context_fcompartamos + Constantes.reversalPdp;
				
				ReversalRequest solicitudReversalPdp = new ReversalRequest(sacarPlata.getData().getTransaccionId());	
				String jsonSolicitudReversalPdp = Funciones.objectToJson(solicitudReversalPdp);
				ResponseDto<String> reversal = repositorioOperaciones.operacionReversaSacarPlata(solicitudReversalPdp, encoding, urlReversal);
				//3*
				registrarLogServicio(Funciones.obtenerEntidadLog(Constantes.Reversal_774, jsonSolicitudReversalPdp, reversal.getTrama(), peticion.getCodigoUsuario(), peticion.getCodigoOficina()));

				sacarPlata.setIsSuccess(false);
				sacarPlata.setIsWarning(true);				
				sacarPlata.setCodigoError(reversal.getCodigoError());
				
				if(!reversal.getIsSuccess()) { //si fallo el extorno
					opeBase.setEstado(Constantes.Pendiente_279);
					sacarPlata.setMessage(reversal.getMessage());
				}else {
					seHisoExtorno = true;
				}
							
			}
			
			//guardamos la trama en linea candmet			
			String url_apiTransacciones = propiedades.getProperty(Constantes.URL_REST_BIM).trim() + Constantes.transaccionesBim;
			ResponseDto<String> opeLinea = repositorioOperaciones.transaccionLineaCfis(opeBase, url_apiTransacciones);
			if( //si fallo todos los servicios de FCOMP
					( !opeLinea.getIsSuccess() || opeLinea.getIsWarning() ) &&  
					( operacionCfis == null || error.value.length() > 0 ) &&
					( opeBase.getEstado().equals(Constantes.Pendiente_279) )
							
			   ) {
				sacarPlata.setIsSuccess(opeLinea.getIsSuccess());
				sacarPlata.setIsWarning(opeLinea.getIsWarning());
				sacarPlata.setMessage(Constantes.ENTREGAR + Constantes.UN_ESPACIO_STRING +Mensajes._M_CONTACTECE_CON_INFORMATICA);
				sacarPlata.setCodigoError(Constantes.ERROR_REGRISTRAR_TRAMAS_777);
				//4*
				registrarLogServicio(Funciones.obtenerEntidadLog(Constantes.Todos_774, Funciones.objectToJson(opeBase), opeLinea.getTrama(), peticion.getCodigoUsuario(), peticion.getCodigoOficina()));
				return sacarPlata;
			}
			
			//si registro la trama abrimos el formulario para regularizar
			if( 
					(operacionCfis == null || error.value.length() > 0) && 
					( opeBase.getEstado().equals(Constantes.Pendiente_279)) && 
					opeLinea.getIsSuccess()
			  ) {
				sacarPlata.setCodigoError(Constantes.ERROR_ABRIR_FORMULARIO_999);
				sacarPlata.setMessage(Constantes.ENTREGAR + Constantes.UN_ESPACIO_STRING + Mensajes._M_DINERO_CLIENTE_CONTINUAR);
				return sacarPlata;
			}
			
			//si no fallo al hacer el reversal cortamos el flujo
			if(opeBase.getEstado().equals(Constantes.Completado_279) && seHisoExtorno) {				
				sacarPlata.setIsSuccess(false);
				sacarPlata.setIsWarning(true);	
				sacarPlata.setMessage(Mensajes._M_SE_REVIRTIO_SACAR_PLATA);
				return sacarPlata;
			}
			
			OperacionRpt sacarPlataCfis = new OperacionRpt();				
		
			sacarPlataCfis = sacarPlata.getData();
			sacarPlataCfis.setNumeroDocumento(operacionCfis.getPcNroDoc());
			sacarPlataCfis.setFechaModificacion(operacionCfis.getPcFecMod());			
		
			sacarPlata.setIsSuccess(true);
			sacarPlata.setIsWarning(false);
			sacarPlata.setData(sacarPlataCfis);
	
		} catch (Exception e) {	
			LOG.error(e.getMessage());
			sacarPlata.setCodigoError(Constantes.Error_critico);
			sacarPlata.setIsSuccess(false);
			sacarPlata.setIsWarning(true);
			sacarPlata.setMessage(e.getMessage());
			//5*
			registrarLogServicio(Funciones.obtenerEntidadLog(Constantes.Todos_774, jsonSolicitudPdp, e.getMessage(), peticion.getCodigoUsuario(), peticion.getCodigoOficina()));
		}

		return sacarPlata;
	}
	
	private ClEntidadDeNegocioTransaccionResponseType transaccionVarias(TransaccionVarias peticion, Holder<String> error) {
		
		ClEntidadDeNegocioTransaccionResponseType respuesta;
		try {
			Holder<ClEntidadDeNegocioTransaccionResponseType> transaccion = new Holder<ClEntidadDeNegocioTransaccionResponseType>();

		    cliente.wmTransaccionVarias(peticion.getCodigoTransaccion(), peticion.getTransaccionId(), peticion.getNumeroCelular(), peticion.getMonto(), peticion.getMoneda(), 
		    		peticion.getIdSession(), peticion.getCodigoCliente(), peticion.getCodigoOficina(), error, transaccion);
		    LOG.info("LOG RESPONSE wmTransaccionVarias: " + transaccion);
		    
		    respuesta = transaccion.value;
	    }catch(Exception e) {
	    	String.format("wmTransaccionesVarias Exception Message:  %s",  e.getMessage());	
	    	LOG.error(e.getMessage());
	    	error.value = e.getMessage();
	    	respuesta = null;
	    }
    	  
		return respuesta;
    }

}
