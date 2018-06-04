package com.olympus.aptx4869.form;

import com.olympus.aptx4869.common.beanvalidation.Number;

public class GraphForm {

    @Number
    private String year;

    @Number
    private String month;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }


}
