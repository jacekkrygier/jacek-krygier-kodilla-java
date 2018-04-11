package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightCollection {
    private static final List<Flight> flightList = new ArrayList<>();


    public FlightCollection() {
        flightList.add(new Flight("Gdańsk", "Kraków"));
        flightList.add(new Flight("Gdańsk", "Wrocław"));
        flightList.add(new Flight("Gdańsk", "Warszawa"));
        flightList.add(new Flight("Warszawa", "Gdańsk"));
        flightList.add(new Flight("Warszawa", "Kraków"));
        flightList.add(new Flight("Warszawa", "Wrocław"));
        flightList.add(new Flight("Kraków", "Gdańsk"));
        flightList.add(new Flight("Kraków", "Wrocław"));
        flightList.add(new Flight("Kraków", "Warszawa"));
        flightList.add(new Flight("Wrocław", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Warszawa"));
    }

    public static List<Flight> getFlightList() {
        return flightList;
    }
}

