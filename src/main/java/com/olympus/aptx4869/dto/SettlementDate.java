package com.olympus.aptx4869.dto;

public class SettlementDate {
	private String label;
	private int settlementDate;

	public SettlementDate() {

	}

	public SettlementDate(String label, int settlementDate) {
		this.label = label;
		this.settlementDate = settlementDate;
	}

	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(int settlementDate) {
		this.settlementDate = settlementDate;
	}
}
