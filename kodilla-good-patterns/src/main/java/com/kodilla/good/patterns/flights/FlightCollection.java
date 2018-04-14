package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightCollection {
    private static final List<Flight> flightList = new ArrayList<>();


    public FlightCollection() {
        flightList.add(new Flight("CH1234","Gdańsk", "Kraków", LocalDateTime.of(2018,4,20,5,30), LocalDateTime.of(2018,4,20,7,0)));
        flightList.add(new Flight("HG2938","Gdańsk", "Wrocław", LocalDateTime.of(2018,4,19,5,30), LocalDateTime.of(2018,4,19,7,0)));
        flightList.add(new Flight("PL7738","Gdańsk", "Warszawa", LocalDateTime.of(2018,4,18,5,30), LocalDateTime.of(2018,4,18,7,0)));
        flightList.add(new Flight("TG9456","Warszawa", "Gdańsk", LocalDateTime.of(2018,4,17,5,30), LocalDateTime.of(2018,4,17,7,0)));
        flightList.add(new Flight("PK2857","Warszawa", "Kraków", LocalDateTime.of(2018,4,16,5,30), LocalDateTime.of(2018,4,16,7,0)));
        flightList.add(new Flight("RU8345","Warszawa", "Wrocław", LocalDateTime.of(2018,4,21,5,30), LocalDateTime.of(2018,4,21,7,0)));
        flightList.add(new Flight("BN9876","Kraków", "Gdańsk", LocalDateTime.of(2018,4,22,5,30), LocalDateTime.of(2018,4,22,7,0)));
        flightList.add(new Flight("WS3245","Kraków", "Wrocław", LocalDateTime.of(2018,4,23,5,30), LocalDateTime.of(2018,4,23,7,0)));
        flightList.add(new Flight("XC8484", "Kraków", "Warszawa", LocalDateTime.of(2018,4,15,5,30), LocalDateTime.of(2018,4,15,7,0)));
        flightList.add(new Flight("CD4567","Wrocław", "Gdańsk", LocalDateTime.of(2018,4,24,5,30), LocalDateTime.of(2018,4,24,7,0)));
        flightList.add(new Flight("SD9386","Wrocław", "Warszawa", LocalDateTime.of(2018,4,25,5,30), LocalDateTime.of(2018,4,25,7,0)));
    }

    public static List<Flight> getFlightList() {
        return flightList;
    }
}

