package com.jrt.controllers;

import com.jrt.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
