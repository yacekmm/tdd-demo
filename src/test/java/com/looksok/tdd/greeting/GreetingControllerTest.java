package com.looksok.tdd.greeting;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = NONE)
public class GreetingControllerTest {

    private GreetingController greetingController;
    private GreetingReporter greetingReporter;

    @Before
    public void setUp() throws Exception {
        greetingReporter = mock(GreetingReporter.class);
        greetingController = new GreetingController(greetingReporter);

        RestAssuredMockMvc.standaloneSetup(greetingController);
    }

    @Test
    public void returnsGreeting() throws Exception {
        RestAssuredMockMvc.given()
            .when()
                .get("/api/greeting")
            .then()
                .statusCode(HttpStatus.SC_OK)
                .body(Matchers.equalTo("Hello"));

        verify(greetingReporter).registerGreeting();
    }
}
