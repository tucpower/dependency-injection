package com.jrt.controllers;

import com.jrt.services.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Value("${nikos.test}")
    private String nikosText;

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!! " + nikosText);

        return greetingService.sayGreeting();
    }
}
