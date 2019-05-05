package com.demo.model;

public class Credit {
    private Integer cId;

    private String enEnname;

    private String sName;

    private String oState;

    private Integer cCredit;

    public Credit(Integer cId, String enEnname, String sName, String oState, Integer cCredit) {
        this.cId = cId;
        this.enEnname = enEnname;
        this.sName = sName;
        this.oState = oState;
        this.cCredit = cCredit;
    }

    public Credit() {
        super();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getEnEnname() {
        return enEnname;
    }

    public void setEnEnname(String enEnname) {
        this.enEnname = enEnname == null ? null : enEnname.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getoState() {
        return oState;
    }

    public void setoState(String oState) {
        this.oState = oState == null ? null : oState.trim();
    }

    public Integer getcCredit() {
        return cCredit;
    }

    public void setcCredit(Integer cCredit) {
        this.cCredit = cCredit;
    }
}