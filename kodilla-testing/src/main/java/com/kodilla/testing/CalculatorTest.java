package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.add(5, 3);

        // Then
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.subtract(5, 3);

        // Then
        Assertions.assertEquals(2, result);
    }
}
