package com.looksok.tdd.greeting;

import com.looksok.tdd.reporting.GreetingReporter;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = NONE)
public class GreetingControllerTest {

    private GreetingController controller;
    private GreetingReporter reporter;

    @Before
    public void setUp() throws Exception {
        reporter = Mockito.mock(GreetingReporter.class);

        controller = new GreetingController(reporter);

        RestAssuredMockMvc.standaloneSetup(controller);
    }

    @Test
    public void greetsUser() throws Exception {

        RestAssuredMockMvc
            .when()
                .get("/api/greeting")
            .then()
                .statusCode(200)
                .body(equalTo("Hello"));

        verify(reporter).reportGreeting();
    }
}
