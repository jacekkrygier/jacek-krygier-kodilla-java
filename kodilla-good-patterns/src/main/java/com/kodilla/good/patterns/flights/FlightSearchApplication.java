package com.kodilla.good.patterns.flights;

public class FlightSearchApplication {

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        FlightCollection flightCollection = new FlightCollection();

        flightSearch.searchByArrivalAirport("Warszawa");
        flightSearch.searchByDepartureAirport("Kraków");
        flightSearch.searchByConnectingCity("Kraków", "Warszawa", "Gdańsk");
    }
}
