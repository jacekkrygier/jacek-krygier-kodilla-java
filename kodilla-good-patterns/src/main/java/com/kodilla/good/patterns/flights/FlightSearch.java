package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    public static void searchByDepartureAirport(String airport) {
        System.out.println("You are looking for flights from: " + airport + ". Here are the results:");
        FlightCollection.getFlightList().stream()
                .filter(f -> f.getDepartureAirport().equals(airport))
                .forEach(System.out::println);
    }

    public static void searchByArrivalAirport(String airport) {
        System.out.println("You are looking for flights to: " + airport + ". Here are the results:");
        FlightCollection.getFlightList().stream()
                .filter(f -> f.getArrivalAirport().equals(airport))
                .forEach(System.out::println);
    }

    public static void searchByConnectingCity(String airport) {
        System.out.println("You are looking for flights through the: " + airport + ". Here are the results:");
        FlightCollection.getFlightList().stream()
                .filter(flight -> flight.getConnectingCity() !=null)
                .filter(flight -> flight.getConnectingCity().equals(airport))
                .forEach(System.out::println);
    }
}