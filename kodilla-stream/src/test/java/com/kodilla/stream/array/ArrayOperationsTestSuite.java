package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for ArrayOperations class")
public class ArrayOperationsTestSuite {

    @Test
    @DisplayName("Test getAverage method")
    void testGetAverage() {
        int[] numbers = {1, 2, 3, 4, 5};

        double average = ArrayOperations.getAverage(numbers);

        Assertions.assertEquals(3.0, average);
    }
}
