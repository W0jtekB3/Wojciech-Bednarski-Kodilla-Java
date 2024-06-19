package com.kodilla.spring.reader;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibraryTestSuite {

    @Autowired
    private Reader reader;

    @Test
    public void testRead() {
        // Given

        // When
        reader.read();

        // Then
        // Verify output manually or with logs
    }
}