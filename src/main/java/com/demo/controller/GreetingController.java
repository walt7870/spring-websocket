package com.demo.controller;

import com.demo.model.Greeting;
import com.demo.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting hello(HelloMessage helloMessage){
        return new Greeting("hello,"+helloMessage.getName());
    }
}
