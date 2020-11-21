package com.compartamos.bim.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.compartamos.bim.api.impl.ServicioOperacionesBim;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.google.common.net.HttpHeaders;

public class Util {
    
    private Util() {
        throw new IllegalStateException("Class Utility");
     }
	
	private static final Logger LOG = LoggerFactory.getLogger(ServicioOperacionesBim.class); 
    /**
     * Devuelve un mensaje de error como una respuesta tipada en formato JSON.
     * protocolo http 500
     * @param msjError el mensaje de error a mostrar
     * @return respuesta JAX-RS
     */
	public static javax.ws.rs.core.Response crearRespuestaErrorJson(String msjError)
	{
		return Response.serverError().type(MediaType.APPLICATION_JSON).entity(msjError).build(); 
	}

	/**
	 * Envuelve una cadena que representa a un JSON en un objeto
	 * protocolo http 200
	 * javax.ws.rs.core.Response.
	 */

    public static javax.ws.rs.core.Response crearRespuestaJson(String json)
    {
        return Response.ok().type(MediaType.APPLICATION_JSON).entity(json).build();
    }
    
	/**
	 * Envuelve una cadena que representa a un JSON en un objeto
	 * protocolo http 401
	 * javax.ws.rs.core.Response.
	 */
    public static javax.ws.rs.core.Response crearRespuestaNoAutorizadoJson(String json)
    {       
        return Response.status(Response.Status.UNAUTHORIZED).type(MediaType.APPLICATION_JSON).entity(json).build();
    }
        
    
    public static void cambiarTimeout(WebClient cliente, long timeout)
    {
        ClientConfiguration config = WebClient.getConfig(cliente);
        HTTPConduit http = (HTTPConduit)config.getConduit();
        HTTPClientPolicy policy = new HTTPClientPolicy();
        policy.setReceiveTimeout(timeout);
        http.setClient(policy);
    }
    
    public static Properties cargarPropiedades() {
    	Properties propiedades = new Properties();

		try (InputStream inputStream =
				Util.class.getClassLoader()
					.getResourceAsStream("app.properties")) {

			propiedades.load(inputStream);
		}
		catch (IOException e) {
			LOG.error("Cargar Propiedades IOException : ", e);
		}

		return propiedades;
	}
    
   /* public static Properties cargarPropiedades() {
		Properties propiedades = new Properties();
		InputStream inputStream = Util.class.getClassLoader().getResourceAsStream("app.properties");
		try {
			propiedades.load(inputStream);
		} catch (IOException e) {
			LOG.error("Cargar Propiedades IOException : ", e);
		}finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					LOG.error("IOException", e);
				}
			}
		}	
		return propiedades;
	}*/
    
    public static String consumoApiRest(String rutaApi, Object parametros)
	{		
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());
		WebClient client = WebClient.create(rutaApi, providers);
		client = client.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON);
		Response respuesta = client.post(parametros);	
		return respuesta.readEntity(String.class);
	}
    
	public static Response consumoApiRest(String rutaApi, Object parametros, String token) {
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());
		Response respuesta = consumirPOST(rutaApi, parametros, token, providers);	
		return respuesta;
	}
	
	public static Response consumirPOST(String URI, Object request, String token, List<?> providers) {
		WebClient cliente = WebClient.create(URI, providers);
        //la mitad del timeout por defecto (30000ms)
        cambiarTimeout(cliente, 120000);       
		cliente.header(HttpHeaders.AUTHORIZATION, token)
		.header("Accept", "application/json")
		.header("Cache-Control","no-cache");
				
		return cliente.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).post(request);
	}

}
    