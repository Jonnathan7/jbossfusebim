package com.compartamos.bim.api.impl;

import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.compartamos.bim.api.IServicioGiroSinTarjetaATM;
import com.compartamos.bim.model.DemoPersona;
import com.compartamos.bim.model.GiroSinTarjetaATMRpt;
import com.compartamos.bim.model.GiroSinTarjetaATMRqt;
import com.compartamos.bim.model.Student;
import com.compartamos.bim.model.TransaccionVarias;
import com.compartamos.bim.util.Constantes;
import com.compartamos.bim.util.Funciones;
import com.compartamos.bim.util.Mensajes;
import com.compartamos.bim.util.ResponseDto;
import com.compartamos.bim.util.Util;

import java.util.ArrayList;
import java.util.List;

import pe.com.creararequipa.wcfnovatronic.ArrayOfParametrosUBA;
import pe.com.creararequipa.wcfnovatronic.CanalesUBAWCF;
import pe.com.creararequipa.wcfnovatronic.ICanalesUBAWCF;
import pe.com.creararequipa.wcfnovatronic.ParametrosUBA;
import pe.com.creararequipa.wcfnovatronic.ServicioCanalesRPTRQT;

public class ServicioGiroSinTarjetaATM implements IServicioGiroSinTarjetaATM {
	
	CanalesUBAWCF servicio =  getWCFService();
	ICanalesUBAWCF cliente = servicio.getBasicHttpBindingICanalesUBAWCF();	
		
	private static String URL_WCF_NOVATRONIC;	
	private static final Logger LOG = LoggerFactory.getLogger(ServicioGiroSinTarjetaATM.class);

	public ResponseDto<GiroSinTarjetaATMRpt> wmGiroSinTarjetaATM(GiroSinTarjetaATMRqt peticion) {
				
		ResponseDto<GiroSinTarjetaATMRpt> giroSinTarjetaATM = new ResponseDto<>(true, Constantes.EMPTY_STRING);
		
		//String jsonSolicitudSwitch = Constantes.EMPTY_STRING;		
	
		if( Funciones.isNullOrEmpty(peticion.getPcTelPar())     
			|| Funciones.isNullOrEmpty(peticion.getPcNumTar())   
			|| Funciones.isNullOrEmpty(peticion.getPcSalDis())
		) {
			giroSinTarjetaATM.setIsSuccess(false);
			giroSinTarjetaATM.setIsWarning(true);
			giroSinTarjetaATM.setMessage(Mensajes._M_ERROR_PARAMETROS_INCOMPLETOS);
			return giroSinTarjetaATM;
		}
		
		try
		{
			//jsonSolicitudSwitch = Funciones.objectToJson(peticion);
			
			//Interactuar con el Servicio de Novatronic	
			ServicioCanalesRPTRQT respuesta = enviarSwitch(peticion);			
			
			//Asignar datos operación exitosa
			GiroSinTarjetaATMRpt giroSinTarjetaRpt = new GiroSinTarjetaATMRpt();
			//giroSinTarjetaRpt = giroSinTarjetaATM.getData();
			//simulando resultados
			giroSinTarjetaRpt.setPcCoEnAd(peticion.getPcCoEnAd());
			giroSinTarjetaRpt.setPcCoEnEm("4049");
			giroSinTarjetaRpt.setPcCaInGe("XXXXXXXXXXWYZ");
			giroSinTarjetaRpt.setPcCodErr("00007");
			giroSinTarjetaRpt.setPcCodCta("291807010108");
			giroSinTarjetaRpt.setPcTelPar(peticion.getPcTelPar());
			giroSinTarjetaRpt.setPcNumTar(peticion.getPcNumTar());			
			giroSinTarjetaRpt.setPcCoMoAl("604");			
			giroSinTarjetaRpt.setPcCoMoBa(peticion.getPcCoMoBa());
			giroSinTarjetaRpt.setPcNomArc(peticion.getPcNomArc());	
			giroSinTarjetaRpt.setPcIdTiMe(peticion.getPcIdTiMe());
			giroSinTarjetaRpt.setPcNroAud(peticion.getPcNroAud());
			giroSinTarjetaRpt.setPcFecIng("2020-11-18");
			giroSinTarjetaRpt.setPcSalDis(peticion.getPcSalDis());	
			giroSinTarjetaRpt.setPcFecTra(peticion.getPcFecTra());	
			giroSinTarjetaATM.setIsSuccess(true);
			giroSinTarjetaATM.setIsWarning(false);
			giroSinTarjetaATM.setData(giroSinTarjetaRpt);			
		}
		catch (Exception e) {		
			//LOG.error(e.getMessage());
			giroSinTarjetaATM.setCodigoError(Constantes.Error_critico);
			giroSinTarjetaATM.setIsSuccess(false);
			giroSinTarjetaATM.setIsWarning(true);
			giroSinTarjetaATM.setMessage(e.getMessage());						
		}
		
		return giroSinTarjetaATM;		
	}		

	public ResponseDto<GiroSinTarjetaATMRpt> wmGiroSinTarjetaATMSimulation(GiroSinTarjetaATMRqt peticion)
	{
		ResponseDto<GiroSinTarjetaATMRpt> giroSinTarjetaATM = new ResponseDto<>(true, Constantes.EMPTY_STRING);
		
		if( Funciones.isNullOrEmpty(peticion.getPcTelPar())     
				|| Funciones.isNullOrEmpty(peticion.getPcNumTar())   
				|| Funciones.isNullOrEmpty(peticion.getPcSalDis())
			) {
				giroSinTarjetaATM.setIsSuccess(false);
				giroSinTarjetaATM.setIsWarning(true);
				giroSinTarjetaATM.setMessage(Mensajes._M_ERROR_PARAMETROS_INCOMPLETOS);
				return giroSinTarjetaATM;
			}
		
		GiroSinTarjetaATMRpt giroSinTarjetaRpt = new GiroSinTarjetaATMRpt();
		//simulando resultados
		giroSinTarjetaRpt.setPcCoEnAd(peticion.getPcCoEnAd());
		giroSinTarjetaRpt.setPcCoEnEm("4049");
		giroSinTarjetaRpt.setPcCaInGe("XXXXXXXXXXWYZ");
		giroSinTarjetaRpt.setPcCodErr("00007");
		giroSinTarjetaRpt.setPcCodCta("291807010108");
		giroSinTarjetaRpt.setPcTelPar(peticion.getPcTelPar());
		giroSinTarjetaRpt.setPcNumTar(peticion.getPcNumTar());			
		giroSinTarjetaRpt.setPcCoMoAl("604");			
		giroSinTarjetaRpt.setPcCoMoBa(peticion.getPcCoMoBa());
		giroSinTarjetaRpt.setPcNomArc(peticion.getPcNomArc());	
		giroSinTarjetaRpt.setPcIdTiMe(peticion.getPcIdTiMe());
		giroSinTarjetaRpt.setPcNroAud(peticion.getPcNroAud());
		giroSinTarjetaRpt.setPcFecIng("2020-11-18");
		giroSinTarjetaRpt.setPcSalDis(peticion.getPcSalDis());	
		giroSinTarjetaRpt.setPcFecTra(peticion.getPcFecTra());
		
		giroSinTarjetaATM.setIsSuccess(true);
		giroSinTarjetaATM.setIsWarning(false);
		giroSinTarjetaATM.setData(giroSinTarjetaRpt);
		
		/*return giroSinTarjetaRpt.getPcBinAdq() + " - " + giroSinTarjetaRpt.getPcDetalle() 
			+ " - " + giroSinTarjetaRpt.getPcNumTar(); */
		
		return giroSinTarjetaATM;
	}
	
	public ServicioCanalesRPTRQT wmGetServicioCanalesRPTRQT(GiroSinTarjetaATMRqt peticion)
	{
		 ServicioCanalesRPTRQT respuesta = enviarSwitch(peticion);
		 return respuesta;
	}
	
	private ServicioCanalesRPTRQT enviarSwitch(GiroSinTarjetaATMRqt peticion)
	{
		ServicioCanalesRPTRQT loServiciosCanales = new ServicioCanalesRPTRQT();		
		ArrayOfParametrosUBA array = new ArrayOfParametrosUBA();
		
		try
		{			
			List<ParametrosUBA> laLstParametros =  llenarParametrosUba(peticion);
			for (ParametrosUBA parametrosUBA : laLstParametros) {
				array.getParametrosUBA().add(parametrosUBA);
			}
			
			JAXBElement<ArrayOfParametrosUBA> jaxbArrayElement = new JAXBElement( 
			         new QName(ArrayOfParametrosUBA.class.getSimpleName()), ArrayOfParametrosUBA.class, null);
			
			jaxbArrayElement.setValue(array);			
			loServiciosCanales.setPaLstParametrosUBA(jaxbArrayElement);
			
			loServiciosCanales = procesarTramaUBA(loServiciosCanales);			
		}
		catch(Exception e) {
	    	String.format("enviarSwitch Exception Message:  %s",  e.getMessage());	
	    	LOG.error(e.getMessage());	    	
	    	loServiciosCanales = null;
	    }
    	  
		return loServiciosCanales;
	}
	
	private ServicioCanalesRPTRQT procesarTramaUBA(ServicioCanalesRPTRQT peticion) {
		
		ServicioCanalesRPTRQT respuesta = null;		
		
		try {
			
			respuesta = cliente.wmProcesarTramaUBA(peticion);
		    LOG.info("LOG RESPONSE wmProcesarTramaUBA: " + respuesta);
		    
	    }catch(Exception e) {
	    	String.format("ProcesarTramaUBA Exception Message:  %s",  e.getMessage());	
	    	LOG.error(e.getMessage());	    	
	    	respuesta = null;
	    }
    	  
		return respuesta;
    }
	
	private List<ParametrosUBA> llenarParametrosUba(GiroSinTarjetaATMRqt peticion) {
		
		List<ParametrosUBA> laLstParametros = new ArrayList<ParametrosUBA>();		
		ParametrosUBA loParametros = null;
		Field field = null;
		Object fieldValue = null;
		Field[] getfields = peticion.getClass().getDeclaredFields();
		
		 try {
			 
			 for(int i = 0; i < getfields.length; i++) {
		        	loParametros = new ParametrosUBA();        	
		        	field = peticion.getClass().getDeclaredField(getfields[i].getName());    
		        	field.setAccessible(true);
		        	fieldValue = field.get(peticion);
		        	
		        	// if (getfields[i].getName().startsWith("pc")) { }
		        	loParametros.setPcPropiedad(new JAXBElement(new QName(field.getName()), String.class, field.getName()));
		        	loParametros.setPcValor(new JAXBElement(new QName(fieldValue.toString()), String.class, fieldValue.toString())); 
		        	laLstParametros.add(loParametros);
		        }	
		 }
		 catch(Exception e) {
			 LOG.error("llenarParametrosUba", e);
			 return null;
		 }       
		
		 return laLstParametros;
	}

	public CanalesUBAWCF getWCFService() {
		URL url;      
		try {
			URL_WCF_NOVATRONIC = Util.cargarPropiedades().getProperty(Constantes.url_switch_api_novatronic);
			url = new URL(URL_WCF_NOVATRONIC + Constantes.WSDL_SWITCH_NOVATRONIC);
			LOG.info("CONNECTED TO ENDPOINT Novatronic: " + url.toString());
			
		} catch (MalformedURLException e1) {
			LOG.error("MalformedURLException", e1);
			url = null;
		} 		
		return new CanalesUBAWCF(url);
	}
	
	public String wmGetDemo() {
		
		 Student student = new Student();

	      //fill details of the student
	      student.setName("Jonnathan");
	      student.setId(1);
	      student.setAge(27);
	      
	      //create JAXBElement of type Student
	      //Pass it a null object
	      JAXBElement<Student> jaxbElement =  new JAXBElement( 
	         new QName(Student.class.getSimpleName()), Student.class, null);

	      Student retrivedStudent;

	      //check if content model not null
	      if(!jaxbElement.isNil()){
	         //get the content values as Student object
	         retrivedStudent = jaxbElement.getValue();
	         //print the result
	         //System.out.println("Student #1: "+retrivedStudent.toString());  
	      } else {
	    	  student.setName("Justin");
		      student.setId(2);
		      student.setAge(19);
	    	  
	         jaxbElement.setValue(student);   		  
	      }

	      //get the content values as Student object
	      retrivedStudent = jaxbElement.getValue();
	      
	      return retrivedStudent.toString();
	}
	
	public String wmGetDataATM(DemoPersona persona) {
		
		return "My name is: " + persona.getNombre() + " " + persona.getApellido() + ",  I'm from " + persona.getPais();
	}
}
