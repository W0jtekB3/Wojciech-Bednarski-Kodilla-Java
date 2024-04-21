package com.kodilla.testing.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for ShapeCollector class")
class ShapeCollectorTestSuite {

    private ShapeCollector shapeCollector;

    @BeforeEach
    void setUp() {
        shapeCollector = new ShapeCollector();
    }

    @Nested
    @DisplayName("Tests for addFigure method")
    class AddFigureTests {

        @Test
        @DisplayName("Should add a figure to the collection")
        void shouldAddFigureToCollection() {
            Shape shape;
            shape = new Circle(5);

            shapeCollector.addFigure(shape);

            assertEquals(1, shapeCollector.getFigureCount());
        }

        private class Circle implements Shape {
            public Circle(int i) {
            }
        }
    }
}
