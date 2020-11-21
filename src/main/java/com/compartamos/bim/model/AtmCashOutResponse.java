package com.compartamos.bim.model;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.math.BigDecimal;

public class AtmCashOutResponse {
	private String status;
	private BigDecimal fee;
	private String transaction_id;
	private String external_transaction_id;
	
	public String getStatus() {
		return status;
	}
	@JsonSetter("status")
	public void setStatus(String status) {
		this.status = status;
	}
	public BigDecimal getFee() {
		return fee;
	}
	@JsonSetter("fee")
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	@JsonSetter("transaction_id")
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}	
	public String getExternal_transaction_id() {
		return external_transaction_id;
	}
	@JsonSetter("external_transaction_id")
	public void setExternal_transaction_id(String external_transaction_id) {
		this.external_transaction_id = external_transaction_id;
	}
	

}
