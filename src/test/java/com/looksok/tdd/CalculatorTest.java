package com.looksok.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void addsTwoNumbers() throws Exception {
        Calculator calc = new Calculator();

        assertThat(calc.add(1, 2)).isEqualTo(3);
        assertThat(calc.add(1, 22)).isEqualTo(23);
        assertThat(calc.add(1, -22)).isEqualTo(-21);
    }
}
