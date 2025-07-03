package com.cobeliii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCostCalculatorTest {
    private final ShoppingCostCalculator underTest = new ShoppingCostCalculator();

    @Test
    void itShouldCharge5EurosForSmallPackage() {
        //when
        var actual = underTest.calculate(0.5, "Local", false);
        //Assert
        assertThat(actual).isEqualTo(5.00);
    }

    @Test
    void itShouldChargeTenEurosForLocalStandardShipping() {
        assertThat(underTest.calculate(2.0, "Local", false)).isEqualTo(10.00);
    }

    @Test
    void shouldChargeTwentyEurosForInternationalShipping() {
        assertThat(underTest.calculate(2.0, "International", false)).isEqualTo(20.00);
    }

    @Test
    void shouldAddExpressFee() {
        assertThat(underTest.calculate(0.5, "Local", true)).isEqualTo(20.00);
    }
}