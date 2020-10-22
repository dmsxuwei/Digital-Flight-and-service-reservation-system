package com.uow.po;

public class Refund {
    private String refuncid;

    private String customerid;

    private String flightid;

    public String getRefuncid() {
        return refuncid;
    }

    public void setRefuncid(String refuncid) {
        this.refuncid = refuncid == null ? null : refuncid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid == null ? null : flightid.trim();
    }
}