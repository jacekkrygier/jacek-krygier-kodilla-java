package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;

public final class Flight {
    private final String flightNumber;
    private final String departureAirport;
    private final String arrivalAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;


    public Flight(final String flightNumber, final String departureAirport, final String arrivalAirport, final LocalDateTime departureTime, final LocalDateTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }


    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!flightNumber.equals(flight.flightNumber)) return false;
        if (!departureAirport.equals(flight.departureAirport)) return false;
        if (!arrivalAirport.equals(flight.arrivalAirport)) return false;
        if (!departureTime.equals(flight.departureTime)) return false;
        return arrivalTime.equals(flight.arrivalTime);
    }

    @Override
    public int hashCode() {
        int result = flightNumber.hashCode();
        result = 31 * result + departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        result = 31 * result + departureTime.hashCode();
        result = 31 * result + arrivalTime.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}

