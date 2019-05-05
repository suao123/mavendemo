package com.demo.model;

public class Tender {
    private Integer tId;

    private String tTname;

    private String tName;

    private String tPhone;

    private String tEmail;

    private String tStartdate;

    private String tTxt;

    private String tInfo;

    private String enPhone;

    private String tEnddate;

    public Tender(Integer tId, String tTname, String tName, String tPhone, String tEmail, String tStartdate, String tTxt, String tInfo, String enPhone, String tEnddate) {
        this.tId = tId;
        this.tTname = tTname;
        this.tName = tName;
        this.tPhone = tPhone;
        this.tEmail = tEmail;
        this.tStartdate = tStartdate;
        this.tTxt = tTxt;
        this.tInfo = tInfo;
        this.enPhone = enPhone;
        this.tEnddate = tEnddate;
    }

    public Tender() {
        super();
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettTname() {
        return tTname;
    }

    public void settTname(String tTname) {
        this.tTname = tTname == null ? null : tTname.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone == null ? null : tPhone.trim();
    }

    public String gettEmail() {
        return tEmail;
    }

    public void settEmail(String tEmail) {
        this.tEmail = tEmail == null ? null : tEmail.trim();
    }

    public String gettStartdate() {
        return tStartdate;
    }

    public void settStartdate(String tStartdate) {
        this.tStartdate = tStartdate == null ? null : tStartdate.trim();
    }

    public String gettTxt() {
        return tTxt;
    }

    public void settTxt(String tTxt) {
        this.tTxt = tTxt == null ? null : tTxt.trim();
    }

    public String gettInfo() {
        return tInfo;
    }

    public void settInfo(String tInfo) {
        this.tInfo = tInfo == null ? null : tInfo.trim();
    }

    public String getEnPhone() {
        return enPhone;
    }

    public void setEnPhone(String enPhone) {
        this.enPhone = enPhone == null ? null : enPhone.trim();
    }

    public String gettEnddate() {
        return tEnddate;
    }

    public void settEnddate(String tEnddate) {
        this.tEnddate = tEnddate == null ? null : tEnddate.trim();
    }
}