package com.compartamos.bim.model;

import com.compartamos.bim.util.Constantes;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TransaccionResponseDto {
	private TransaccionResponse data;
	private boolean isSuccess;
	private boolean isWarning;
	private String message;
	private String codigoError;
	private String trama;

	public TransaccionResponseDto() {}

	public TransaccionResponseDto(boolean isSuccess, String message)
	{
		this.isSuccess = isSuccess;
		this.message = message;		
		this.codigoError = Constantes.EMPTY_STRING;
		this.trama = Constantes.EMPTY_STRING;
	}
	
	public TransaccionResponse getData() {
		return data;
	}

	@JsonSetter("Data")
	public void setData(TransaccionResponse data) {
		this.data = data;
	}

	public boolean getIsSuccess() {
		return isSuccess;
	}

	@JsonSetter("IsSuccess")
	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public boolean getIsWarning() {
		return isWarning;
	}

	@JsonSetter("IsWarning")
	public void setIsWarning(boolean isWarning) {
		this.isWarning = isWarning;
	}

	public String getMessage() {
		return message;
	}

	@JsonSetter("Message")
	public void setMessage(String message) {
		this.message = message;
	}

	public String getCodigoError() {
		return codigoError;
	}

	@JsonSetter("CodigoError")
	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getTrama() {
		return trama;
	}

	@JsonSetter("Trama")
	public void setTrama(String trama) {
		this.trama = trama;
	}
}
