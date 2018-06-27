package com.olympus.aptx4869.service;

public class AccountingDate {
	private String label;
	private int accountingDate;

	public AccountingDate() {

	}

	public AccountingDate(String label, int accountingDate) {
		this.label = label;
		this.accountingDate = accountingDate;
	}

	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getAccountingDate() {
		return accountingDate;
	}
	public void setAccountingDate(int settlementDate) {
		this.accountingDate = settlementDate;
	}
}
