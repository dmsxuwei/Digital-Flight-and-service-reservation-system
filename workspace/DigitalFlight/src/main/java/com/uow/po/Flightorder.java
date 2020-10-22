package com.uow.po;

public class Flightorder {
    private String flightOrder;

    private String flightid;

    private String customerid;

    public String getFlightOrder() {
        return flightOrder;
    }

    public void setFlightOrder(String flightOrder) {
        this.flightOrder = flightOrder == null ? null : flightOrder.trim();
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid == null ? null : flightid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }
}