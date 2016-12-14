package com.looksok.tdd.greeting;

import org.junit.Before;
import org.junit.Test;

public class GreetingRegistryTest {

    private GreetingRegistry greetingRegistry;

    @Before
    public void setUp() throws Exception {
        greetingRegistry = new GreetingRegistry();
    }

    @Test
    public void registerNewGreeting_doesNotThrowExceptions() throws Exception {
        greetingRegistry.registerNewGreeting();
    }

    @Test
    public void storesGreetingInDb() throws Exception {
        //...
    }
}