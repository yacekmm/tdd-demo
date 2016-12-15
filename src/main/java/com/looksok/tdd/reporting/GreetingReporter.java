package com.looksok.tdd.reporting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;

@Component
public class GreetingReporter {

    private Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public void reportGreeting() {
        log.info("Greeting was reported!");
    }
}
