package com.compartamos.bim.util;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

import com.compartamos.bim.util.Constantes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.compartamos.bim.model.LogOperacionDto;

public class Funciones {
	
    private Funciones() {
        throw new IllegalStateException();
    }

	private static ObjectMapper mapper;
	
	public static boolean isNullOrEmpty(String cadena) { 		
		
	    return cadena == null || cadena.trim().length() == 0;
	}
	
	public static String celularFormatoPdp(String cadena) { 
		
	   if (cadena == null || cadena.trim().length() == 0)
		  return cadena;
		
       return Constantes.FRI + Constantes.PREFIJO_TEL_PERU + cadena + Constantes.BARRA+ Constantes.MSISDN;
	}

	public static String usuarioToBase64(String user_pass) throws UnsupportedEncodingException { 
		if(user_pass == null) {
			return Constantes.EMPTY_STRING;
		}
        String encoding = "Basic " + Base64.getEncoder().encodeToString((user_pass).getBytes("UTF-8"));		
	    return encoding;
	}

	 public static String objectToJson(Object objeto) throws JsonProcessingException {
        if (objeto == null) {
            return "";
        }
        mapper = new ObjectMapper();
		return mapper.writeValueAsString(objeto);	
	 }       

	@SuppressWarnings("unchecked")
	public static <T> T jsonToObject(String content, TypeReference<T> type) throws IOException {
        if (content.isEmpty()) {
            return (T) new Object();
        }

        mapper = new ObjectMapper();
        return mapper.readValue(content, type);
	 }
	
	@SuppressWarnings("unchecked")
	 public static <T> T jsonToObject(String content, Class<T> type) throws IOException {
        if (content.isEmpty()) {
            return (T) new Object();
        }

        mapper = new ObjectMapper();
        return mapper.readValue(content, type);
	 }

     public static LogOperacionDto obtenerEntidadLog(String codigoServicio, String solicitud, String respuesta, String codigoUsu, String codigoOfi){
    	
    	LogOperacionDto logDto = new LogOperacionDto();
    	logDto.setCodigoServicio(codigoServicio);
    	logDto.setSolicitud(solicitud);
    	logDto.setRespuesta(respuesta);
    	logDto.setCodigoUsu(codigoUsu);
    	logDto.setCodigoOfi(codigoOfi);
	    	
		return logDto;
     }
}
