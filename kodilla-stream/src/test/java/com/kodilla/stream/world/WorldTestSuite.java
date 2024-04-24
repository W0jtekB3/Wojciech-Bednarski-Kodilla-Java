package com.kodilla.stream.world;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for World class")
public class WorldTestSuite {

    @Test
    @DisplayName("Test getPeopleQuantity method")
    void testGetPeopleQuantity() {
        // Given
        World world = new World();
        Continent europe = new Continent();
        europe.addCountry(new Country(BigDecimal.valueOf(100_000_000)));
        europe.addCountry(new Country(BigDecimal.valueOf(50_000_000)));
        Continent asia = new Continent();
        asia.addCountry(new Country(BigDecimal.valueOf(1_000_000_000)));
        asia.addCountry(new Country(BigDecimal.valueOf(500_000_000)));
        world.addContinent(europe);
        world.addContinent(asia);

        // When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        // Then
        assertEquals(BigDecimal.valueOf(1_650_000_000), totalPopulation);
    }
}
