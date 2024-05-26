package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.List;

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
            // Given
            Shape shape = new Circle("Circle", 5);

            // When
            shapeCollector.addFigure(shape);

            // Then
            assertEquals(1, shapeCollector.getShapes().size());
        }
    }

    @Nested
    @DisplayName("Tests for removeFigure method")
    class RemoveFigureTests {

        @Test
        @DisplayName("Should remove a figure from the collection")
        void shouldRemoveFigureFromCollection() {
            // Given
            Shape shape = new Square("Square", 4);
            shapeCollector.addFigure(shape);

            // When
            shapeCollector.removeFigure(shape);

            // Then
            assertEquals(0, shapeCollector.getShapes().size());
        }
    }

    @Nested
    @DisplayName("Tests for getFigure method")
    class GetFigureTests {

        @Test
        @DisplayName("Should get a figure from the collection")
        void shouldGetFigureFromCollection() {
            // Given
            Shape shape = new Triangle("Triangle", 3, 4, 5);
            shapeCollector.addFigure(shape);

            // When
            Shape retrievedShape = shapeCollector.getFigure(0);

            // Then
            assertEquals(shape, retrievedShape);
        }
    }

    @Nested
    @DisplayName("Tests for showFigures method")
    class ShowFiguresTests {

        @Test
        @DisplayName("Should return names of all figures as one String")
        void shouldReturnNamesOfAllFigures() {
            // Given
            Shape circle = new Circle("Circle", 5);
            Shape square = new Square("Square", 4);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);

            // When
            String result = shapeCollector.showFigures();

            // Then
            assertEquals("Circle, Square", result);
        }
    }
}
