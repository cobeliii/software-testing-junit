package com.cobeliii;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private Calculator underTest;

    @BeforeEach
    void setUp() {
        underTest = new Calculator();
    }

    @Test
    void itShouldAddTwoNumbers() {
        var actual = underTest.add(1,2);
        assertThat(actual).isEqualTo(3);
    }
}