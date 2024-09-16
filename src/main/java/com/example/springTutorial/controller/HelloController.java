package com.example.springTutorial.controller;

import com.example.springTutorial.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final GreetingService greetingService;
    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String hello() {
        return greetingService.getGreeting();
    }
}
