package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTest {

    @Test
    void testProbablyIWillThrowException() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 1));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2));
    }
}
