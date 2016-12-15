package com.looksok.tdd.greeting;

import com.looksok.tdd.reporting.GreetingReporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingReporter reporter;

    @Autowired
    public GreetingController(GreetingReporter reporter) {
        this.reporter = reporter;
    }

    @RequestMapping("/api/greeting")
    public ResponseEntity greet(){
        reporter.reportGreeting();
        return ResponseEntity.ok("Hello");
    }
}
