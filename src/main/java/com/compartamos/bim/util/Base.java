package com.compartamos.bim.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.compartamos.bim.util.Constantes;
import com.compartamos.bim.util.Util;

import pe.com.creararequipa.webservices.WSMiddleWare;

import com.compartamos.bim.model.LogOperacionDto;

public abstract class Base{
	
	 private static final Logger LOG = LoggerFactory.getLogger(Base.class);
	
	 protected Properties propiedades = null;

	 public Base() throws IOException
	 {
		if (this.propiedades == null)
		{
			this.propiedades = Util.cargarPropiedades();
		}
	 }
	 
	public WSMiddleWare getSOAPService() {
		URL url;      
		try {			
			url = new URL(propiedades.getProperty(Constantes.URL_SOAP_MIDDLEWARE) + Constantes.WSDL_MIDDLEWARE);			
			
		} catch (MalformedURLException e1) {
			LOG.error("MalformedURLException", e1);
			url = null;
		} 		
		return new WSMiddleWare(url);
	}
	 
	 
	 protected void registrarLogServicio(final LogOperacionDto log) 
	 {
		try {			
							
			Thread hilo = new Thread(new Runnable() {
	            @Override
	            public void run() {
	            	String url_apiTransacciones = propiedades.getProperty(Constantes.URL_REST_BIM).trim() + Constantes.logOperacion;
	        		Util.consumoApiRest(url_apiTransacciones, log);        		
	            }
	        });
			hilo.start();			

		} catch(Exception ex) {
			LOG.error(ex.getMessage());			
	    }		
			
     }
}