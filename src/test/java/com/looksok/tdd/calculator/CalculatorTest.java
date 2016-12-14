package com.looksok.tdd.calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void addsTwoIntegers() throws Exception {
        //given
        Calculator calculator = new Calculator();

        //then
        assertThat(calculator.add(1, 2)).isEqualTo(3);
        assertThat(calculator.add(21, 2)).isEqualTo(23);
        assertThat(calculator.add(21, 0)).isEqualTo(21);
        assertThat(calculator.add(21, -10)).isEqualTo(11);
    }
}
