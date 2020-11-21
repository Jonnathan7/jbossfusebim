package com.compartamos.bim.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class AtmCashOutRequest {

	private String msisdn;
	private String otp;
	private String amount;
	private String external_transaction_id;
	
	public String getMsisdn() {
		return msisdn;
	}
	@JsonSetter("msisdn")
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getOtp() {
		return otp;
	}
	@JsonSetter("otp")
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getAmount() {
		return amount;
	}
	@JsonSetter("amount")
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getExternal_transaction_id() {
		return external_transaction_id;
	}
	@JsonSetter("external_transaction_id")
	public void setExternal_transaction_id(String external_transaction_id) {
		this.external_transaction_id = external_transaction_id;
	}

  
}
