package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(2)
                .sauce("standard")
                .ingredient("lettuce")
                .ingredient("onion")
                .ingredient("cheese")
                .build();

        // When
        String bunType = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        String sauceType = bigmac.getSauce();
        int numberOfIngredients = bigmac.getIngredients().size();

        // Then
        assertEquals("sesame", bunType);
        assertEquals(2, burgers);
        assertEquals("standard", sauceType);
        assertEquals(3, numberOfIngredients); // lettuce, onion, cheese
    }
}
