package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    void testBasicPizzaOrder() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
        assertEquals("Dough, tomato sauce, cheese", description);
    }

    @Test
    void testPizzaWithExtraCheeseAndHam() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        // Then
        assertEquals(new BigDecimal(27), calculatedCost);
        assertEquals("Dough, tomato sauce, cheese, extra cheese, ham", description);
    }

    @Test
    void testPizzaWithAllToppings() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        // Then
        assertEquals(new BigDecimal(30), calculatedCost);
        assertEquals("Dough, tomato sauce, cheese, extra cheese, ham, mushrooms", description);
    }
}