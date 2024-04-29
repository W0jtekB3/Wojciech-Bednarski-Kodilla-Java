package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("London", false);
        airports.put("Paris", true);
        airports.put("Berlin", false);

        if (!airports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Airport not found: " + flight.getArrivalAirport());
        }
    }
}
