package com.compartamos.bim.repositorio;

import com.compartamos.bim.model.*;
import com.compartamos.bim.util.ResponseDto;
import com.compartamos.bim.util.Constantes;
import com.compartamos.bim.util.Funciones;
import com.compartamos.bim.util.Util;
import com.compartamos.bim.util.Mensajes;
import javax.ws.rs.core.Response;
import javax.xml.ws.Holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RepositorioOperacionesBim {
			
	private static final Logger LOG = LoggerFactory.getLogger(RepositorioOperacionesBim.class); 
	
	public ResponseDto<OperacionRpt> operacionPonerPlata(CashInRequest solicitudPdp, String encoding, String urlCanshIn)
	{			
		ResponseDto<OperacionRpt> respuesta = new ResponseDto<>(true,Constantes.EMPTY_STRING);	
		
		try {
            Response executeRequest = null;
            Holder<String> error = new Holder<String>();
            error.value  = Constantes.EMPTY_STRING;        
            executeRequest = consumirApiExterno(urlCanshIn, solicitudPdp, encoding, error);
            if(executeRequest == null || error.value.length() > 0) {
            	respuesta.setTrama(error.value);              
                respuesta.setCodigoError(Constantes.CODIGO_ESTADO_HTTP_500);
                respuesta.setIsSuccess(false);        
                respuesta.setIsWarning(true);
                respuesta.setMessage(Mensajes._M_SERVICIO_NO_DISPONIBLE);    
                return respuesta;
            }
           
            String jsonRespuestaPdp = executeRequest.readEntity(String.class);
            respuesta.setTrama(jsonRespuestaPdp);  
			if(executeRequest.getStatus() == Response.Status.OK.getStatusCode()) //200
			{
				CashInResponse respuestaPdpOk = new CashInResponse();
				respuestaPdpOk = Funciones.jsonToObject(jsonRespuestaPdp, CashInResponse.class);						
				
				OperacionRpt ponerPlata = new OperacionRpt();
				ponerPlata.setTransaccionId(respuestaPdpOk.getTransaction_id());
				ponerPlata.setMontoComision(respuestaPdpOk.getFee());
				
				respuesta.setIsSuccess(true);
				respuesta.setIsWarning(false);
				respuesta.setMessage(Constantes.PDP_OK);
				respuesta.setData(ponerPlata);				
				return respuesta;
			}
			
			respuesta.setCodigoError(String.valueOf(executeRequest.getStatus()));
			respuesta.setIsSuccess(false);
			respuesta.setIsWarning(true);
						
			if(executeRequest.getStatus() == Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()) //500
			{
				ErrorInternoResponse respuestaErrorPdp = new ErrorInternoResponse();				
				respuestaErrorPdp =  Funciones.jsonToObject(jsonRespuestaPdp, ErrorInternoResponse.class);							
				respuesta.setMessage(respuestaErrorPdp.getErrorcode());						
				return respuesta;
			}
							
			respuesta.setMessage(Constantes.ERROR_COMUNICACION_HTTP);					
			return respuesta;

		}catch (Exception ex) {
			LOG.error(ex.getMessage());		
			respuesta.setCodigoError(Constantes.Error_critico);
			respuesta.setIsSuccess(false);		
			respuesta.setIsWarning(true);
			respuesta.setMessage(ex.getMessage());		
			respuesta.setTrama(ex.getMessage());
			
			return respuesta;
		}		
	}
	
	public ResponseDto<OperacionRpt> operacionSacarPlata(AtmCashOutRequest solicitudPdp, String encoding, String urlCanshOut)
	{			
		ResponseDto<OperacionRpt> respuesta = new ResponseDto<>(true,Constantes.EMPTY_STRING);	

		try {
           
            Response executeRequest = null;
            Holder<String> error = new Holder<String>();
            error.value  = Constantes.EMPTY_STRING;        
            executeRequest = consumirApiExterno(urlCanshOut, solicitudPdp, encoding, error);
            if(executeRequest == null || error.value.length() > 0) {
            	respuesta.setTrama(error.value); 
                respuesta.setCodigoError(Constantes.CODIGO_ESTADO_HTTP_500);
                respuesta.setIsSuccess(false);        
                respuesta.setIsWarning(true);
                respuesta.setMessage(Mensajes._M_SERVICIO_NO_DISPONIBLE);    
                return respuesta;
            }
            
            String jsonRespuestaPdp = executeRequest.readEntity(String.class);
            respuesta.setTrama(jsonRespuestaPdp);  
	
			if(executeRequest.getStatus() == Response.Status.OK.getStatusCode()) //200
			{
				AtmCashOutResponse respuestaPdpOk = new AtmCashOutResponse();
				respuestaPdpOk = Funciones.jsonToObject(jsonRespuestaPdp, AtmCashOutResponse.class);
								
				if(!respuestaPdpOk.getExternal_transaction_id().trim().equals(solicitudPdp.getExternal_transaction_id().trim())) {
					respuesta.setIsSuccess(false);
					respuesta.setIsWarning(true);
					respuesta.setMessage(Constantes.ERROR_COINCIDENCIA_IDE_INTERNO);	
					return respuesta;
				}
						
				OperacionRpt sacarPlata = new OperacionRpt();
				sacarPlata.setTransaccionId(respuestaPdpOk.getTransaction_id());
				sacarPlata.setMontoComision(respuestaPdpOk.getFee());
				
				respuesta.setIsSuccess(true);
				respuesta.setIsWarning(false);
				respuesta.setMessage(Constantes.PDP_OK);
				respuesta.setData(sacarPlata);
				
				return respuesta;
			}

			respuesta.setCodigoError(String.valueOf(executeRequest.getStatus()));
			respuesta.setIsSuccess(false);
			respuesta.setIsWarning(true);

			if(executeRequest.getStatus() == Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()) //500
			{
				ErrorInternoResponse respuestaErrorPdp = new ErrorInternoResponse();
				respuestaErrorPdp =  Funciones.jsonToObject(jsonRespuestaPdp, ErrorInternoResponse.class);				
				respuesta.setMessage(respuestaErrorPdp.getErrorcode());				
				return respuesta;		
			}
							
			respuesta.setMessage(Constantes.ERROR_COMUNICACION_HTTP);					
			return respuesta;
			
		}catch (Exception ex) {
			LOG.error(ex.getMessage());
			respuesta.setCodigoError(Constantes.Error_critico);
			respuesta.setIsSuccess(false);		
			respuesta.setMessage(ex.getMessage());
			respuesta.setTrama(ex.getMessage());
			return respuesta;
		}
	}
	
	public ResponseDto<String> operacionReversaSacarPlata(ReversalRequest solicitudPdp, String encoding, String urlReversal)
	{				
		ResponseDto<String> respuesta = new ResponseDto<>(true,Constantes.EMPTY_STRING);	
		
		try {
            Response executeRequest = null;
            Holder<String> error = new Holder<String>();
            error.value  = Constantes.EMPTY_STRING;        
            executeRequest = consumirApiExterno(urlReversal, solicitudPdp, encoding, error);
            if(executeRequest == null || error.value.length() > 0) {
            	respuesta.setTrama(error.value); 
                respuesta.setCodigoError(Constantes.CODIGO_ESTADO_HTTP_500);
                respuesta.setIsSuccess(false);        
                respuesta.setIsWarning(true);
                respuesta.setMessage(Mensajes._M_SERVICIO_NO_DISPONIBLE);    
                return respuesta;
            }

			String jsonRespuestaPdp = executeRequest.readEntity(String.class);
			respuesta.setTrama(jsonRespuestaPdp); 		
			
			if(executeRequest.getStatus() == Response.Status.OK.getStatusCode()) { //200
				respuesta.setIsSuccess(true);
				respuesta.setIsWarning(false);
				respuesta.setMessage(Constantes.PDP_OK);	
				return respuesta;				
			}

			respuesta.setCodigoError(String.valueOf(executeRequest.getStatus()));
			respuesta.setIsSuccess(false);
			respuesta.setIsWarning(true);				
			
			if(executeRequest.getStatus() == Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()) //500
			{
				ErrorInternoResponse respuestaErrorPdp = new ErrorInternoResponse();
				respuestaErrorPdp =  Funciones.jsonToObject(jsonRespuestaPdp, ErrorInternoResponse.class);							
				respuesta.setMessage(respuestaErrorPdp.getErrorcode());				
				return respuesta;		
			}
							
			respuesta.setMessage(Constantes.ERROR_COMUNICACION_HTTP + executeRequest.getStatus());					
			return respuesta;
		
		}catch (Exception ex) {
			LOG.error(ex.getMessage());	
			respuesta.setCodigoError(Constantes.Error_critico);
			respuesta.setIsSuccess(false);		
			respuesta.setMessage(ex.getMessage());
			respuesta.setTrama(ex.getMessage());
			return respuesta;
		}	
	}
	
	public ResponseDto<String> transaccionLineaCfis(TransaccionVarias solicitud, String urlTransaccion)
	{				
		ResponseDto<String> respuesta = new ResponseDto<>(true,Constantes.EMPTY_STRING);	
		
		try {
            Response executeRequest = null;
            Holder<String> error = new Holder<String>();
            error.value  = Constantes.EMPTY_STRING;        
            executeRequest = consumirApiExterno(urlTransaccion, solicitud, Constantes.EMPTY_STRING, error);
            if(executeRequest == null || error.value.length() > 0) {
            	respuesta.setTrama(error.value);              
                respuesta.setIsSuccess(false);        
                respuesta.setIsWarning(true);
                respuesta.setMessage(Mensajes._M_ERROR_REGISTRAR_TRAMA_CFIS);    
                return respuesta;
            }

			String jsonRespuesta = executeRequest.readEntity(String.class);
			respuesta.setTrama(jsonRespuesta); 		
						
			if(executeRequest.getStatus() == Response.Status.OK.getStatusCode()) { //200
				TransaccionResponseDto transaccion = new TransaccionResponseDto();
				transaccion = Funciones.jsonToObject(jsonRespuesta, TransaccionResponseDto.class);	
				respuesta.setData(String.valueOf(transaccion.getData().getIdentificadorMet()));
				respuesta.setMessage(Constantes.PDP_OK);	
				return respuesta;				
			}

			respuesta.setCodigoError(String.valueOf(executeRequest.getStatus()));
			respuesta.setIsSuccess(false);
			respuesta.setIsWarning(true);	
			respuesta.setMessage(Mensajes._M_ERROR_REGISTRAR_TRAMA_CFIS);
			return respuesta;
		
		}catch (Exception ex) {
			LOG.error(ex.getMessage());	
			respuesta.setCodigoError(Constantes.Error_critico);
			respuesta.setIsSuccess(false);		
			respuesta.setMessage(Mensajes._M_ERROR_REGISTRAR_TRAMA_CFIS);
			respuesta.setTrama(ex.getMessage());
			return respuesta;
		}	
	}
	
	public ResponseDto<String> actualizarTransaccionLineaCfis(TransaccionVarias solicitud, String urlTransaccion)
	{				
		ResponseDto<String> respuesta = new ResponseDto<>(true,Constantes.EMPTY_STRING);	
		
		try {
            Response executeRequest = null;
            Holder<String> error = new Holder<String>();
            error.value  = Constantes.EMPTY_STRING;        
            executeRequest = consumirApiExterno(urlTransaccion, solicitud, Constantes.EMPTY_STRING, error);
            if(executeRequest == null || error.value.length() > 0) {
            	respuesta.setTrama(error.value);              
                respuesta.setIsSuccess(false);        
                respuesta.setIsWarning(true);
                respuesta.setMessage(Mensajes._M_ERROR_ACTUALIZAR_TRAMA_CFIS);    
                return respuesta;
            }

			String jsonRespuesta = executeRequest.readEntity(String.class);
			respuesta.setTrama(jsonRespuesta); 		
						
			if(executeRequest.getStatus() == Response.Status.OK.getStatusCode()) { //200
				respuesta.setIsSuccess(true);        
                respuesta.setIsWarning(false);
				respuesta.setMessage(Constantes.PDP_OK);	
				return respuesta;				
			}

			respuesta.setCodigoError(String.valueOf(executeRequest.getStatus()));
			respuesta.setIsSuccess(false);
			respuesta.setIsWarning(true);	
			respuesta.setMessage(Mensajes._M_ERROR_ACTUALIZAR_TRAMA_CFIS);
			return respuesta;
		
		}catch (Exception ex) {
			LOG.error(ex.getMessage());	
			respuesta.setCodigoError(Constantes.Error_critico);
			respuesta.setIsSuccess(false);		
			respuesta.setMessage(Mensajes._M_ERROR_ACTUALIZAR_TRAMA_CFIS);
			respuesta.setTrama(ex.getMessage());
			return respuesta;
		}	
	}
	
	private Response consumirApiExterno(String url_cashin, Object solicitudPdp, String token, Holder<String> error) {
        Response executeRequest = null;
        try {
            executeRequest = Util.consumoApiRest(url_cashin, solicitudPdp, token);            
                      
        }catch(Exception e) {      
            error.value = e.getMessage();
            LOG.error(e.getMessage());
        }
        return executeRequest;
    }

}
