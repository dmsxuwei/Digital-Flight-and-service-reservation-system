package com.uow.po;

public class Balance {
    private String balanceid;

    private String customerid;

    private Integer balanceValue;

    public String getBalanceid() {
        return balanceid;
    }

    public void setBalanceid(String balanceid) {
        this.balanceid = balanceid == null ? null : balanceid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public Integer getBalanceValue() {
        return balanceValue;
    }

    public void setBalanceValue(Integer balanceValue) {
        this.balanceValue = balanceValue;
    }
}