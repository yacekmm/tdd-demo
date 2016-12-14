package com.looksok.tdd.greeting;

import org.springframework.stereotype.Component;

@Component
public class GreetingReporter {
    public void registerGreeting() {
        System.out.println("registering greeting");
    }
}
