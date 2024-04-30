// CollectionTestSuite.java
package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTestSuite {

    private OddNumbersExterminator exterminator;

    @BeforeEach
    public void setUp() {
        exterminator = new OddNumbersExterminator();
        System.out.println("Test Case: Start");
    }

    @AfterEach
    public void tearDown() {
        exterminator = null;
        System.out.println("Test Case: End");
    }

    @Test
    @DisplayName("Testing exterminate() method with an empty list")
    public void testOddNumbersExterminatorEmptyList() {
        // Given
        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> result = exterminator.exterminate(emptyList);

        // Then
        assertEquals(0, result.size());
    }

    @Test
    @DisplayName("Testing exterminate() method with a list containing even and odd numbers")
    public void testOddNumbersExterminatorNormalList() {
        // Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);  // odd
        numbers.add(2);  // even
        numbers.add(3);  // odd
        numbers.add(4);  // even

        // When
        List<Integer> result = exterminator.exterminate(numbers);

        // Then
        assertEquals(2, result.size());
        assertEquals(2, result.get(0));
        assertEquals(4, result.get(1));
    }
}
