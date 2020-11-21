package com.compartamos.bim.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class ReversalRequest {
	
	public ReversalRequest(String transaccionId) {
		this.transaction_id = transaccionId;
	}
	
    private String transaction_id;

	public String getTransaction_id() {
		return transaction_id;
	}
	@JsonSetter("transaction_id")
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

}
