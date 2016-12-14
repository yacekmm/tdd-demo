package com.looksok.tdd.greeting;

import org.springframework.stereotype.Component;

@Component
public class GreetingRegistry {
    public void registerNewGreeting() {
        System.out.println("registered new greeting");
//        throw new RuntimeException("Not implemented yet");
    }
}
