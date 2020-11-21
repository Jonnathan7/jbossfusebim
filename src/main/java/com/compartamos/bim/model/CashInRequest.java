package com.compartamos.bim.model;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CashInRequest {

	private String sendingfri;
	private String receivingfri;
	private String amount;
	
	public String getSendingfri() {
		return sendingfri;
	}
	@JsonSetter("sendingfri")
	public void setSendingfri(String sendingfri) {
		this.sendingfri = sendingfri;
	}
	public String getReceivingfri() {
		return receivingfri;
	}
	@JsonSetter("receivingfri")
	public void setReceivingfri(String receivingfri) {
		this.receivingfri = receivingfri;
	}
	public String getAmount() {
		return amount;
	}
	@JsonSetter("amount")
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
