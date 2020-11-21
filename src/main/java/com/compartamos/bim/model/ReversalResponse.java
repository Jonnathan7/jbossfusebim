package com.compartamos.bim.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class ReversalResponse {

	private String status;
	private String transaction_id;
	
	public String getStatus() {
		return status;
	}
	@JsonSetter("status")
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	@JsonSetter("transaction_id")
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	} 
	
}
