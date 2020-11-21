package com.compartamos.bim.model;

public class LogOperacionDto {

    private String codigoServicio;
    private String solicitud;
    private String respuesta;
    private String codigoUsu;
    private String codigoOfi;  
    
	public String getCodigoServicio() {
		return codigoServicio;
	}
	public void setCodigoServicio(String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}
	public String getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public String getCodigoOfi() {
		return codigoOfi;
	}
	public void setCodigoOfi(String codigoOfi) {
		this.codigoOfi = codigoOfi;
	}
	public String getCodigoUsu() {
		return codigoUsu;
	}
	public void setCodigoUsu(String codigoUsu) {
		this.codigoUsu = codigoUsu;
	}

}
