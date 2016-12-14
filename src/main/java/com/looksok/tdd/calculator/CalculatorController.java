package com.looksok.tdd.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CalculatorController {

    @RequestMapping(value = "/api/greeting", method = GET)
    public ResponseEntity calculate(){
        return new ResponseEntity("Hello", HttpStatus.OK);
    }
}
