package com.compartamos.bim.model;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonSetter;

public class CashInResponse {

	private String status;
    private BigDecimal fee;
    private String transaction_id;
    
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
	public String getStatus() {
		return status;
	}
	@JsonSetter("status")
	public void setStatus(String status) {
		this.status = status;
	}
}
