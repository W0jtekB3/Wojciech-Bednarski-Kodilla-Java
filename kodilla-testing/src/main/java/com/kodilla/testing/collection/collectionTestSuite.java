package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for OddNumbersExterminator class")
public class collectionTestSuite {

    public OddNumbersExterminator exterminator;

    @BeforeEach
    public void setUp() {
        exterminator = new OddNumbersExterminator();
        System.out.println("Preparing to execute test...");
    }

    @AfterEach
    public void tearDown() {
        exterminator = null;
        System.out.println("Test execution completed.");
    }

    @DisplayName("Test for empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        List<Integer> emptyList = new ArrayList<>();

        List<Integer> result = exterminator.exterminate(emptyList);

        assertEquals(0, result.size(), "List should be empty");
    }

    @DisplayName("Test for list with both even and odd numbers")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> result = exterminator.exterminate(numbers);

        assertEquals(2, result.size(), "List should contain only even numbers");
        for (Integer num : result) {
            assertEquals(0, num % 2, "All numbers should be even");
        }
    }
}
