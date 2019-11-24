package com.six.dcsystem.Bean;

import java.util.Date;

public class Check {
    private Integer checkkey;

    private String checkid;

    private String meterreadingid;

    private String adjustment;

    private Float deduction;

    private Float actual;

    private Date creationtime;

    private String founder;

    private String updateperson;

    private Date updatetime;

    private String settlingmonth;

    private String state;

    public Integer getCheckkey() {
        return checkkey;
    }

    public void setCheckkey(Integer checkkey) {
        this.checkkey = checkkey;
    }

    public String getCheckid() {
        return checkid;
    }

    public void setCheckid(String checkid) {
        this.checkid = checkid == null ? null : checkid.trim();
    }

    public String getMeterreadingid() {
        return meterreadingid;
    }

    public void setMeterreadingid(String meterreadingid) {
        this.meterreadingid = meterreadingid == null ? null : meterreadingid.trim();
    }

    public String getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(String adjustment) {
        this.adjustment = adjustment == null ? null : adjustment.trim();
    }

    public Float getDeduction() {
        return deduction;
    }

    public void setDeduction(Float deduction) {
        this.deduction = deduction;
    }

    public Float getActual() {
        return actual;
    }

    public void setActual(Float actual) {
        this.actual = actual;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }

    public String getUpdateperson() {
        return updateperson;
    }

    public void setUpdateperson(String updateperson) {
        this.updateperson = updateperson == null ? null : updateperson.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getSettlingmonth() {
        return settlingmonth;
    }

    public void setSettlingmonth(String settlingmonth) {
        this.settlingmonth = settlingmonth == null ? null : settlingmonth.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}