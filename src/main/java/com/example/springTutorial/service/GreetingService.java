package com.example.springTutorial.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting(){
        return "Greetings from Spring Tutorial Greeting Controller";
    }
}
