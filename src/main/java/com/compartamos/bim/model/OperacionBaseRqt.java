package com.compartamos.bim.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonSetter;

public class OperacionBaseRqt {

	private BigDecimal monto;
	private String moneda;
	private String codigoCliente;
	private String codigoTransaccion;
	private String codigoOficina;
	private String codigoUsuario;
	private String idSession;
	private String usuarioPassword;
	
	public BigDecimal getMonto() {
		return monto;
	}
	
	@JsonSetter("Monto")
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getMoneda() {
		return moneda;
	}
	
	@JsonSetter("Moneda")
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getCodigoCliente() {
		return codigoCliente;
	}
	
	@JsonSetter("CodigoCliente")
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getCodigoTransaccion() {
		return codigoTransaccion;
	}
	
	@JsonSetter("CodigoTransaccion")
	public void setCodigoTransaccion(String codigoTransaccion) {
		this.codigoTransaccion = codigoTransaccion;
	}
	public String getCodigoOficina() {
		return codigoOficina;
	}
	
	@JsonSetter("CodigoOficina")
	public void setCodigoOficina(String codigoOficina) {
		this.codigoOficina = codigoOficina;
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	
	@JsonSetter("CodigoUsuario")
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getIdSession() {
		return idSession;
	}
	
	@JsonSetter("IdSession")
	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}
	public String getUsuarioPassword() {
		return usuarioPassword;
	}
	
	@JsonSetter("UsuarioPassword")
	public void setUsuarioPassword(String usuarioPassword) {
		this.usuarioPassword = usuarioPassword;
	}

}
