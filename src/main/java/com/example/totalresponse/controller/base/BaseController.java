package com.example.totalresponse.controller.base;

import com.example.totalresponse.error.BusinessException;
import com.example.totalresponse.error.EmBusinessError;
import com.example.totalresponse.response.CommonReturnType;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


public class BaseController {

    @ExceptionHandler
    public Object handerException(HttpServletRequest request,Exception ex){
        Map<String, Object> map = new HashMap<>();
        if (ex instanceof BusinessException){
            BusinessException ex1 = (BusinessException) ex;
            map.put("errCode",(ex1.getErrorCode()));
            map.put("errMsg",( ex1.getErrorMsg()));
        }else {

            map.put("errCode", EmBusinessError.VAR_PARAM.getErrorCode());
            map.put("errMsg", EmBusinessError.VAR_PARAM.getErrorMsg());
        }
        return CommonReturnType.create("fail",map);
    }
}
