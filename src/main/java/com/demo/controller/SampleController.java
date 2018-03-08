package com.demo.controller;

import com.demo.config.HomeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class SampleController {

    @Autowired
    HomeProperties homeProperties;
//    @RequestMapping("/")
//    @ResponseBody
    String home() {

        return homeProperties.toString();
    }

}