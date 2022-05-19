package com.example.jenkinstest.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String test(){
        return "좋습니다!!";
    }


}

