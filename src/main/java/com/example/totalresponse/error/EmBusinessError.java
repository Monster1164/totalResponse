package com.example.totalresponse.error;

import com.example.totalresponse.response.CommonReturnType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public enum EmBusinessError implements CommonError{
    //参数错误
    VAR_PARAM(2000,"参数错误"),

    //登录错误
    USER_NOT_LOGIN(1000,"用户未登录")

    ;
    private int errorCode;

    private String errorMsg;

    private EmBusinessError() {
    }

    private EmBusinessError(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errorMsg;
    }

    @Override
    public CommonError setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
}
