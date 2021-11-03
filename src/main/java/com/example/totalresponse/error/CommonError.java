package com.example.totalresponse.error;

import com.example.totalresponse.response.CommonReturnType;

public interface CommonError {

    int getErrorCode();

    String getErrorMsg();

    CommonError setErrorMsg(String errorMsg);
}
