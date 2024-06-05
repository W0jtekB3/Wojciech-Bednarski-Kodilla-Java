package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for ArrayOperations class")
public class ArrayOperationsTestSuite {

    @Test
    @DisplayName("Test getAverage method")
    void testGetAverage() {
        // Given
        int[] numbers = {1, 2, 3, 4, 5};

        // When
        double average = ArrayOperations.getAverage(numbers);

        // Then
        Assertions.assertEquals(3.0, average);
    }
}
