package com.kodilla.airline;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {
    private final Set<Flight> flights;

    public FlightService(Set<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightsFromCity(String city) {
        return flights.stream()
                .filter(flight -> flight.getDeparture().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsToCity(String city) {
        return flights.stream()
                .filter(flight -> flight.getDestination().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsWithConnection(String departure, String destination) {
        List<Flight> directFlights = findFlightsFromCity(departure).stream()
                .filter(flight -> flight.getDestination().equals(destination))
                .collect(Collectors.toList());

        if (!directFlights.isEmpty()) {
            return directFlights;
        }

        return flights.stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .flatMap(flight -> findFlightsFromCity(flight.getDestination()).stream())
                .filter(flight -> flight.getDestination().equals(destination))
                .collect(Collectors.toList());
    }
}
