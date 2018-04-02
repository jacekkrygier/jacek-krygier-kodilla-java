package com.kodilla.exception.test;


import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("London", true);
        flights.put("Berlin", true);
        flights.put("Paris", false);
        flights.put("Moscow", false);

        if (flights.containsKey(flight.getArrivalAirport()) && flights.get(flight.getArrivalAirport()) == true) {
            System.out.println("Congratulations! Your flight to " + flight.getArrivalAirport() + " is available");
        } else {
            throw new RouteNotFoundException("Unavailable flight");
        }



    }
}
