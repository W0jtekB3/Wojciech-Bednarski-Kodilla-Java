package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for OddNumbersExterminator")
class CollectionTestSuite {

    private OddNumbersExterminator exterminator;

    @BeforeEach
    void setUp() {
        exterminator = new OddNumbersExterminator();
        System.out.println("Preparing to execute test...");
    }

    @AfterEach
    void tearDown() {
        exterminator = null;
        System.out.println("Test completed.");
    }

    @Test
    @DisplayName("Test for empty list")
    void testOddNumbersExterminatorEmptyList() {
        // Given
        List<Integer> emptyList = new ArrayList<>();
        // When
        List<Integer> result = exterminator.exterminate(emptyList);
        // Then
        assertEquals(0, result.size(), "The result should be an empty list");
    }

    @Test
    @DisplayName("Test for normal list")
    void testOddNumbersExterminatorNormalList() {
        // Given
        List<Integer> normalList = List.of(1, 2, 3, 4, 5, 6);
        // When
        List<Integer> result = exterminator.exterminate(normalList);
        // Then
        assertEquals(List.of(2, 4, 6), result, "The result should contain only even numbers");
    }
}
