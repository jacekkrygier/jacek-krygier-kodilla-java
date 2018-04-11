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

    public static void searchByConnectingCity(String arrivalAirport, String connectingCity) {
        System.out.println("You are looking for flights through the: " + connectingCity + " to " + arrivalAirport + ". First, choose one of these flights: ");
        FlightCollection.getFlightList().stream()
                .filter(flight -> flight.getDepartureAirport() != arrivalAirport)
                .filter(flight -> flight.getArrivalAirport().equals(connectingCity))
                .forEach(System.out::println);

        System.out.println("Then, choose this flight:");

        FlightCollection.getFlightList().stream()
                .filter(flight -> flight.getDepartureAirport().equals(connectingCity))
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }
}