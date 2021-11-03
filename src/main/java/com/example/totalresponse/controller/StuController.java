package com.example.totalresponse.controller;

import com.example.totalresponse.pojo.Stu;
import com.example.totalresponse.response.CommonReturnType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
public class StuController {

    @GetMapping("/name")
    public CommonReturnType getStu(){
        Stu stu = new Stu();
        stu.setId(2);
        stu.setName("张三");

        return CommonReturnType.create(stu);
    }
}
