package com.demo.model;

public class Studio {
    private String sPhone;

    private String sSname;

    private String sName;

    private String sEmail;

    private String pwd;

    private Integer sState;

    public Studio(String sPhone, String sSname, String sName, String sEmail, String pwd, Integer sState) {
        this.sPhone = sPhone;
        this.sSname = sSname;
        this.sName = sName;
        this.sEmail = sEmail;
        this.pwd = pwd;
        this.sState = sState;
    }

    public Studio() {
        super();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public String getsSname() {
        return sSname;
    }

    public void setsSname(String sSname) {
        this.sSname = sSname == null ? null : sSname.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail == null ? null : sEmail.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Integer getsState() {
        return sState;
    }

    public void setsState(Integer sState) {
        this.sState = sState;
    }
}