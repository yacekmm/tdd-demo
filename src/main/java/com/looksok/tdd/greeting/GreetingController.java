package com.looksok.tdd.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {

    private final GreetingRegistry greetingRegistry;

    @Autowired
    public GreetingController(GreetingRegistry greetingRegistry) {
        this.greetingRegistry = greetingRegistry;
    }

    @RequestMapping(value = "/api/greeting", method = GET)
    public ResponseEntity calculate(){
        greetingRegistry.registerNewGreeting();
        return new ResponseEntity("Hello", HttpStatus.OK);
    }
}
