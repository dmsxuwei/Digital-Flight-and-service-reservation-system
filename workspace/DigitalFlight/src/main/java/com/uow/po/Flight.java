package com.uow.po;

import java.util.Date;

public class Flight {
    private String flightid;

    private String airline;

    private String flightnumber;

    private Date departureTime;

    private Date arrivalTime;

    private String departureCity;

    private String arrivalCity;

    private Integer airFare;

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid == null ? null : flightid.trim();
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline == null ? null : airline.trim();
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber == null ? null : flightnumber.trim();
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity == null ? null : departureCity.trim();
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity == null ? null : arrivalCity.trim();
    }

    public Integer getAirFare() {
        return airFare;
    }

    public void setAirFare(Integer airFare) {
        this.airFare = airFare;
    }
}