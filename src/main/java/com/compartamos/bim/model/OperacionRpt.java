package com.compartamos.bim.model;

import java.math.BigDecimal;

import com.compartamos.bim.util.Constantes;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OperacionRpt{

	private BigDecimal montoComision;
	private String transaccionId;
	private String numeroDocumento;
	private String fechaModificacion;
	
	public OperacionRpt() {
		this.montoComision = BigDecimal.ZERO;
		this.transaccionId = Constantes.EMPTY_STRING;
		this.numeroDocumento = Constantes.EMPTY_STRING;
		this.fechaModificacion = Constantes.EMPTY_STRING;
	}

	public BigDecimal getMontoComision() {
		return montoComision;
	}

	@JsonSetter("MontoComision")
	public void setMontoComision(BigDecimal montoComision) {
		this.montoComision = montoComision;
	}

	public String getTransaccionId() {
		return transaccionId;
	}

	@JsonSetter("TransaccionId")
	public void setTransaccionId(String transaccionId) {
		this.transaccionId = transaccionId;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	@JsonSetter("NumeroDocumento")
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getFechaModificacion() {
		return fechaModificacion;
	}

	@JsonSetter("FechaModificacion")
	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}
