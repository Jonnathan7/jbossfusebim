package com.compartamos.bim.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class ErrorInternoResponse {
    private String status;
    private String errorcode;

	public String getStatus() {
		return status;
	}
	@JsonSetter("status")
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorcode() {
		return errorcode;
	}
	@JsonSetter("errorcode")
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}


}



