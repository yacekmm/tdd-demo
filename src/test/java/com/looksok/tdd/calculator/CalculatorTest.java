package com.looksok.tdd.calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void addsIntegers() throws Exception {
        Calculator calculator = new Calculator();

        assertThat(calculator.add(1, 2)).isEqualTo(3);
        assertThat(calculator.add(1, 22)).isEqualTo(23);
        assertThat(calculator.add(-1, 22)).isEqualTo(21);
    }

}
