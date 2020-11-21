package com.compartamos.bim.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class SacarPlataRqt extends OperacionBaseRqt{

	private String celularOrigen;
	private String codigoOtp;
	private String idExternoTransaccion;
	
	public String getCelularOrigen() {
		return celularOrigen;
	}
	
	@JsonSetter("CelularOrigen")
	public void setCelularOrigen(String celularOrigen) {
		this.celularOrigen = celularOrigen;
	}
	public String getCodigoOtp() {
		return codigoOtp;
	}
	
	@JsonSetter("CodigoOtp")
	public void setCodigoOtp(String codigoOtp) {
		this.codigoOtp = codigoOtp;
	}
	public String getIdExternoTransaccion() {
		return idExternoTransaccion;
	}
	
	@JsonSetter("IdExternoTransaccion")
	public void setIdExternoTransaccion(String idExternoTransaccion) {
		this.idExternoTransaccion = idExternoTransaccion;
	}

}
