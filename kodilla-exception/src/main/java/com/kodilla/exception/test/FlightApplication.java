package com.kodilla.exception.test;

public class FlightApplication {
    public static void main(String[] args) {
        FlightSearch flightsearch = new FlightSearch();
        Flight flight = new Flight("Moscow", "Paris");
        Flight flight2 = new Flight("Moscow", "Warsaw");
        try {
            flightsearch.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e + "\nOops! I'm afraid that you can't fly to " + flight.getArrivalAirport());
        } finally {
            System.out.println("Thank you for using our application\n");
        }
        try {
            flightsearch.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e + "\nOops! I'm afraid that you can't fly to " + flight2.getArrivalAirport());
        } finally {
            System.out.println("Thank you for using our application");
        }
    }
}
