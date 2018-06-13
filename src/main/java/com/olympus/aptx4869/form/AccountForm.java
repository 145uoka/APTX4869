package com.olympus.aptx4869.form;

import org.hibernate.validator.constraints.NotEmpty;

public class AccountForm {
	@NotEmpty
	public String clientId;
	public String settlementDate;
	public String budget;
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}

}
