package com.olympus.aptx4869.dto.api;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ErrorInfo {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    private String errorCode;

    private String property;

    private String description;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
