package com.kodilla.testing.shape;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

public class ShapeCollectorTestSuite {

    private ShapeCollector shapeCollector;

    @BeforeEach
    public void setUp() {
        shapeCollector = new ShapeCollector();
        System.out.println("Test Case: Start");
    }

    @AfterEach
    public void tearDown() {
        shapeCollector = null;
        System.out.println("Test Case: End");
    }

    @Nested
    @DisplayName("Tests for addFigure() method")
    class AddFigureTests {
    }

    @Nested
    @DisplayName("Tests for removeFigure() method")
    class RemoveFigureTests {
    }

    @Nested
    @DisplayName("Tests for getFigure() method")
    class GetFigureTests {
    }

    @Nested
    @DisplayName("Tests for showFigures() method")
    class ShowFiguresTests {
    }
}
