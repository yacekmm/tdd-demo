package com.looksok.tdd.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {

    private final GreetingReporter greetingReporter;

    @Autowired
    public GreetingController(GreetingReporter greetingReporter) {
        this.greetingReporter = greetingReporter;
    }

    @RequestMapping(value = "/api/greeting", method = GET)
    public ResponseEntity getGreeting(){
        greetingReporter.registerGreeting();
        return ResponseEntity.ok("Hello");
    }
}
