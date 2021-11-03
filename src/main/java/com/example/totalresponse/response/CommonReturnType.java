package com.example.totalresponse.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonReturnType {

    private String status;
    private Object object;

    public static CommonReturnType create(Object o){
        CommonReturnType type = new CommonReturnType("success",o);
        return type;
    }

    public static CommonReturnType create(String status,Object o){
        CommonReturnType type = new CommonReturnType(status,o);
        return type;
    }
}
