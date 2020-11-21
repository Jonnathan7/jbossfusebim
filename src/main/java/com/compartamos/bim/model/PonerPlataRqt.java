package com.compartamos.bim.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class PonerPlataRqt extends OperacionBaseRqt {

	private String agenteEnvia;
	private String celularRecibe;
	
	public String getAgenteEnvia() {
		return agenteEnvia;
	}
	
	@JsonSetter("AgenteEnvia")
	public void setAgenteEnvia(String agenteEnvia) {
		this.agenteEnvia = agenteEnvia;
	}
	
	public String getCelularRecibe() {
		return celularRecibe;
	}
	
	@JsonSetter("CelularRecibe")
	public void setCelularRecibe(String celularRecibe) {
		this.celularRecibe = celularRecibe;
	}

}
