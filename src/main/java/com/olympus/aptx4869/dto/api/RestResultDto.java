package com.olympus.aptx4869.dto.api;

import java.util.List;

public class RestResultDto {

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
