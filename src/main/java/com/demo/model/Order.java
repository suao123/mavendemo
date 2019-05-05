package com.demo.model;

public class Order {
    private Integer oId;

    private String tName;

    private String oDate;

    private String enPhone;

    private String sPhone;

    public Order(Integer oId, String tName, String oDate, String enPhone, String sPhone) {
        this.oId = oId;
        this.tName = tName;
        this.oDate = oDate;
        this.enPhone = enPhone;
        this.sPhone = sPhone;
    }

    public Order() {
        super();
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String getoDate() {
        return oDate;
    }

    public void setoDate(String oDate) {
        this.oDate = oDate == null ? null : oDate.trim();
    }

    public String getEnPhone() {
        return enPhone;
    }

    public void setEnPhone(String enPhone) {
        this.enPhone = enPhone == null ? null : enPhone.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }
}