package com.looksok.tdd.greeting;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = NONE)
public class GreetingControllerTest {

    private GreetingController greetingController;
    private GreetingRegistry greetingRegistry;

    @Before
    public void setUp() throws Exception {
        greetingRegistry = mock(GreetingRegistry.class);
        greetingController = new GreetingController(greetingRegistry);

        RestAssuredMockMvc.standaloneSetup(greetingController);
    }

    @Test
    public void respondsWith200OK_andGreets() throws Exception {
        given()
            .when()
                .get("/api/greeting")
            .then()
                .statusCode(HttpStatus.SC_OK)
                .body(equalTo("Hello"));

        verify(greetingRegistry).registerNewGreeting();
    }
}
