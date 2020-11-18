package com.byz.sboot.controller;


import com.byz.sboot.model.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private AcmeProperties acmeProperties;

    @RequestMapping("hello")
    public String hello(){

        return "spring-config";
    }

    @RequestMapping("testProFile")
    public String testProFile(){
        System.out.println(acmeProperties);
        return "testProFile";
    }


}
