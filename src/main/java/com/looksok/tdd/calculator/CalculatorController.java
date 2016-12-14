package com.looksok.tdd.calculator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CalculatorController {

    @RequestMapping(value = "/api/greeting", method = GET)
    public ResponseEntity calculate(){
        System.out.println("calculating");
        return ResponseEntity
                .ok()
                .build();
    }
}
