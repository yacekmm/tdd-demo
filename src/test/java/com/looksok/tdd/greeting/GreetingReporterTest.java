package com.looksok.tdd.greeting;

import org.junit.Test;

public class GreetingReporterTest {

    @Test
    public void registerGreeting_doesNotThrowException() throws Exception {
        new GreetingReporter().registerGreeting();
    }

}