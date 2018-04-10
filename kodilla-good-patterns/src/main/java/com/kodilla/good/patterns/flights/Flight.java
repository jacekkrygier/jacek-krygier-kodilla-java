package com.kodilla.good.patterns.flights;

public final class Flight {
    private final String departureAirport;
    private final String arrivalAirport;
    private  String connectingCity;

    public Flight(final String departureAirport, final String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Flight( final String departureAirport, final String arrivalAirport, final String connectingCity) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.connectingCity = connectingCity;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getConnectingCity() {
        return connectingCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureAirport.equals(flight.departureAirport)) return false;
        return arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", connectingCity='" + connectingCity + '\'' +
                '}';
    }
}
