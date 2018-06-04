package com.olympus.aptx4869.dto;

import java.util.List;

public class GraphDto {

    private int year;

    private int month;

    private int amountSummary;

    private List<AmountDto> amountDtoList;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getAmountSummary() {
        return amountSummary;
    }

    public void setAmountSummary(int amountSummary) {
        this.amountSummary = amountSummary;
    }

    public List<AmountDto> getAmountDtoList() {
        return amountDtoList;
    }

    public void setAmountDtoList(List<AmountDto> amountDtoList) {
        this.amountDtoList = amountDtoList;
    }

}
