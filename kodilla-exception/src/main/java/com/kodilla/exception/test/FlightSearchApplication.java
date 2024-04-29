package com.kodilla.exception.test;

public class FlightSearchApplication {

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();

        try {
            Flight flight = new Flight("Warsaw", "Madrid");
            flightSearch.findFlight(flight);
            System.out.println("Flight found!");
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found. Reason: " + e.getMessage());
        }
    }
}
