package com.example.totalresponse.error;



public class BusinessException extends Exception implements CommonError{


    private CommonError commonError;

    private BusinessException(CommonError commonError){
        this.commonError = commonError;
    }

    private BusinessException(CommonError commonError ,String errmsg){
        this.commonError = commonError;
        this.commonError.setErrorMsg(errmsg);
    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrorMsg() {
        return this.commonError.getErrorMsg();
    }

    @Override
    public CommonError setErrorMsg(String errorMsg) {
         this.commonError.setErrorMsg(errorMsg);
         return this;
    }
}
