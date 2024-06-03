package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for adding and removing figures")
    class AddRemoveTests {

        @Test
        void testAddFigure() {
            // Given
            ShapeCollector collector = new ShapeCollector();
            Shape shape = new Circle(2.5); // Change radius to match actual calculation

            // When
            collector.addFigure(shape);

            // Then
            assertEquals(Math.PI * 2.5 * 2.5, collector.getFigure(0).getField(), 0.01); // Adjust expected value
        }


        @Test
        void testRemoveFigure() {
            // Given
            ShapeCollector collector = new ShapeCollector();
            Shape shape = new Circle(1.0);
            collector.addFigure(shape);

            // When
            boolean result = collector.removeFigure(shape);

            // Then
            assertTrue(result);
            assertEquals(0, collector.showFigures().length());
        }
    }

    @Nested
    @DisplayName("Tests for getting and showing figures")
    class GetShowTests {

        @Test
        void testGetFigure() {
            // Given
            ShapeCollector collector = new ShapeCollector();
            Shape shape = new Circle(1.0);
            collector.addFigure(shape);

            // When
            Shape retrievedShape = collector.getFigure(0);

            // Then
            assertEquals(shape, retrievedShape);
        }

        @Test
        void testShowFigures() {
            // Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Circle(1.0));
            collector.addFigure(new Square(1.0));
            collector.addFigure(new Triangle(1.0, 1.0));

            // When
            String result = collector.showFigures();

            // Then
            assertEquals("Circle, Square, Triangle", result);
        }
    }
}
