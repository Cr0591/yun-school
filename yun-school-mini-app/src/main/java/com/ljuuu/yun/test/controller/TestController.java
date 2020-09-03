package com.ljuuu.yun.test.controller;

import com.ljuuu.yun.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public Object test(){
        return testService.quertAll();
    }



}
