package com.looksok.tdd.calc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void adds1and2() throws Exception {
        Calculator calc = new Calculator();

        assertThat(calc.add(1, 2)).isEqualTo(3);
        assertThat(calc.add(1, 22)).isEqualTo(23);
    }
}
