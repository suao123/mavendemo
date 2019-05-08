package com.demo.model;

public class Order {
    private Integer oId;

    private String tName;

    private String o1date;

    private String o2date;

    private String o3date;

    private String o4date;

    private Boolean o1pay;

    private Boolean o2pay;

    private Boolean o3pay;

    private Boolean o4pay;

    private Integer enEvaluation;

    private String enPhone;

    private String sPhone;

    public Order(Integer oId, String tName, String o1date, String o2date, String o3date, String o4date, Boolean o1pay, Boolean o2pay, Boolean o3pay, Boolean o4pay, Integer enEvaluation, String enPhone, String sPhone) {
        this.oId = oId;
        this.tName = tName;
        this.o1date = o1date;
        this.o2date = o2date;
        this.o3date = o3date;
        this.o4date = o4date;
        this.o1pay = o1pay;
        this.o2pay = o2pay;
        this.o3pay = o3pay;
        this.o4pay = o4pay;
        this.enEvaluation = enEvaluation;
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

    public String getO1date() {
        return o1date;
    }

    public void setO1date(String o1date) {
        this.o1date = o1date == null ? null : o1date.trim();
    }

    public String getO2date() {
        return o2date;
    }

    public void setO2date(String o2date) {
        this.o2date = o2date == null ? null : o2date.trim();
    }

    public String getO3date() {
        return o3date;
    }

    public void setO3date(String o3date) {
        this.o3date = o3date == null ? null : o3date.trim();
    }

    public String getO4date() {
        return o4date;
    }

    public void setO4date(String o4date) {
        this.o4date = o4date == null ? null : o4date.trim();
    }

    public Boolean getO1pay() {
        return o1pay;
    }

    public void setO1pay(Boolean o1pay) {
        this.o1pay = o1pay;
    }

    public Boolean getO2pay() {
        return o2pay;
    }

    public void setO2pay(Boolean o2pay) {
        this.o2pay = o2pay;
    }

    public Boolean getO3pay() {
        return o3pay;
    }

    public void setO3pay(Boolean o3pay) {
        this.o3pay = o3pay;
    }

    public Boolean getO4pay() {
        return o4pay;
    }

    public void setO4pay(Boolean o4pay) {
        this.o4pay = o4pay;
    }

    public Integer getEnEvaluation() {
        return enEvaluation;
    }

    public void setEnEvaluation(Integer enEvaluation) {
        this.enEvaluation = enEvaluation;
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