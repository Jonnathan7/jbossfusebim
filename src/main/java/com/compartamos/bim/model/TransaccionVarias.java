package com.compartamos.bim.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonSetter;

public class TransaccionVarias {
	private String codigoTransaccion;
	private String transaccionId;
	private String codigoCliente;
	private String numeroCelular;
	private String moneda;
	private BigDecimal monto;
	private BigDecimal montoComision;
	private String estado;
	private String codigoOficina;
	private String codigoUsuario;
	private String idSession;
	private int identificadorMet; //Referencias candmet
	
	public String getCodigoTransaccion() {
		return codigoTransaccion;
	}
	@JsonSetter("CodigoTransaccion")
	public void setCodigoTransaccion(String codigoTransaccion) {
		this.codigoTransaccion = codigoTransaccion;
	}
	
	public String getTransaccionId() {
		return transaccionId;
	}
	@JsonSetter("TransaccionId")
	public void setTransaccionId(String transaccionId) {
		this.transaccionId = transaccionId;
	}
	
	public String getCodigoCliente() {
		return codigoCliente;
	}
	@JsonSetter("CodigoCliente")
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public String getNumeroCelular() {
		return numeroCelular;
	}
	@JsonSetter("NumeroCelular")
	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	
	public String getMoneda() {
		return moneda;
	}
	@JsonSetter("Moneda")
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	public BigDecimal getMonto() {
		return monto;
	}
	@JsonSetter("Monto")
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	public BigDecimal getMontoComision() {
		return montoComision;
	}
	@JsonSetter("MontoComision")
	public void setMontoComision(BigDecimal montoComision) {
		this.montoComision = montoComision;
	}
	
	public String getEstado() {
		return estado;
	}
	@JsonSetter("Estado")
	public void setEstado(String estado) {
		this.estado = estado;
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

	public int getIdentificadorMet() {
		return identificadorMet;
	}
	@JsonSetter("identificadorMet")
	public void setIdentificadorMet(int identificadorMet) {
		this.identificadorMet = identificadorMet;
	}
	
}
