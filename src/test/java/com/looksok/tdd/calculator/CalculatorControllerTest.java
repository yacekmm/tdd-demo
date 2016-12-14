package com.looksok.tdd.calculator;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = NONE)
public class CalculatorControllerTest {

    private CalculatorController calculatorController;

    @Before
    public void setUp() throws Exception {
        calculatorController = new CalculatorController();

        RestAssuredMockMvc.standaloneSetup(calculatorController);
    }

    @Test
    public void respondsWith200OK() throws Exception {
        given()
            .when()
                .get("/api/greeting")
            .then()
                .statusCode(HttpStatus.SC_OK)
                .body(equalTo("Hello"));
    }
}
