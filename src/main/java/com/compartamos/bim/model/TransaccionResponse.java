package com.compartamos.bim.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransaccionResponse {

	private int identificadorMet;

	public int getIdentificadorMet() {
		return identificadorMet;
	}

	@JsonSetter("IdentificadorMet")
	public void setIdentificadorMet(int identificadorMet) {
		this.identificadorMet = identificadorMet;
	}
	
	
}
