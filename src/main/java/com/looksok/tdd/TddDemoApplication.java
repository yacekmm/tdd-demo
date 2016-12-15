package com.looksok.tdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.invoke.MethodHandles;

@SpringBootApplication
public class TddDemoApplication {

    private static Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {

	    SpringApplication.run(TddDemoApplication.class, args);
	    log.info("Greeting API available on: http://localhost:8080/api/greeting");
	}
}
