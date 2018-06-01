package com.olympus.aptx4869.dto.api;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class RestResultDto {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    private boolean successFlag;

    private List<ErrorInfo> errorInfo;

    public boolean isSuccessFlag() {
        return successFlag;
    }

    public void setSuccessFlag(boolean successFlag) {
        this.successFlag = successFlag;
    }

    public List<ErrorInfo> getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(List<ErrorInfo> errorInfo) {
        this.errorInfo = errorInfo;
    }

}
