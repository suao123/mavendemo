package com.demo.model;

public class Enterprise {
    private String enPhone;

    private String enEname;

    private String enBoss;

    private String enEmail;

    private String enName;

    private String pwd;

    private Integer enState;

    public Enterprise(String enPhone, String enEname, String enBoss, String enEmail, String enName, String pwd, Integer enState) {
        this.enPhone = enPhone;
        this.enEname = enEname;
        this.enBoss = enBoss;
        this.enEmail = enEmail;
        this.enName = enName;
        this.pwd = pwd;
        this.enState = enState;
    }

    public Enterprise() {
        super();
    }

    public String getEnPhone() {
        return enPhone;
    }

    public void setEnPhone(String enPhone) {
        this.enPhone = enPhone == null ? null : enPhone.trim();
    }

    public String getEnEname() {
        return enEname;
    }

    public void setEnEname(String enEname) {
        this.enEname = enEname == null ? null : enEname.trim();
    }

    public String getEnBoss() {
        return enBoss;
    }

    public void setEnBoss(String enBoss) {
        this.enBoss = enBoss == null ? null : enBoss.trim();
    }

    public String getEnEmail() {
        return enEmail;
    }

    public void setEnEmail(String enEmail) {
        this.enEmail = enEmail == null ? null : enEmail.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Integer getEnState() {
        return enState;
    }

    public void setEnState(Integer enState) {
        this.enState = enState;
    }
}