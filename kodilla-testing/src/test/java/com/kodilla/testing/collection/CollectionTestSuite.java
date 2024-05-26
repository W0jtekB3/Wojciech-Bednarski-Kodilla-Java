package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for OddNumbersExterminator class")
class CollectionTestSuite {

    @BeforeEach
    void before() {
        System.out.println("Starting test...");
    }

    @AfterEach
    void after() {
        System.out.println("Test completed.");
    }

    @Test
    @DisplayName("Test whether the class behaves correctly when the list is empty")
    void testOddNumbersExterminatorEmptyList() {
        // Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> result = exterminator.exterminate(emptyList);

        // Then
        assertEquals(0, result.size());
    }

    @Test
    @DisplayName("Test whether the class behaves correctly when the list contains even and odd numbers")
    void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);

        // When
        List<Integer> result = exterminator.exterminate(numbers);

        // Then
        assertEquals(expected, result);
    }
}
