package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        // Given
        Logger logger = Logger.getInstance();
        logger.log("First log");
        logger.log("Second log");

        // When
        String lastLog = logger.getLastLog();

        // Then
        assertEquals("Second log", lastLog);
    }

    @Test
    void testSingletonLogger() {
        // Given
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // When
        logger1.log("Singleton test log");

        // Then
        assertEquals(logger1.getLastLog(), logger2.getLastLog());
        assertEquals("Singleton test log", logger1.getLastLog());
        assertEquals("Singleton test log", logger2.getLastLog());
    }
}