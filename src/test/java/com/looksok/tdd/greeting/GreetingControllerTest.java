package com.looksok.tdd.greeting;

import com.looksok.tdd.reporting.GreetingReporter;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = NONE)
public class GreetingControllerTest {

    GreetingController controller;
    GreetingReporter reporter;

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
                .body(Matchers.equalTo("Hello"))
                .statusCode(200);

        verify(reporter).reportGreeting();

    }
}
