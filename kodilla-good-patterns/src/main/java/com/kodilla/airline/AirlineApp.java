package com.kodilla.airline;

import java.util.HashSet;
import java.util.Set;

public class AirlineApp {
    public static void main(String[] args) {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("Gdansk", "Warsaw"));
        flights.add(new Flight("Warsaw", "Krakow"));
        flights.add(new Flight("Krakow", "Wroclaw"));
        flights.add(new Flight("Gdansk", "Wroclaw"));
        flights.add(new Flight("Warsaw", "Gdansk"));

        FlightService flightService = new FlightService(flights);

        System.out.println("Flights from Gdansk:");
        flightService.findFlightsFromCity("Gdansk").forEach(System.out::println);

        System.out.println("\nFlights to Wroclaw:");
        flightService.findFlightsToCity("Wroclaw").forEach(System.out::println);

        System.out.println("\nFlights from Gdansk to Wroclaw with connection:");
        flightService.findFlightsWithConnection("Gdansk", "Wroclaw").forEach(System.out::println);
    }
}
