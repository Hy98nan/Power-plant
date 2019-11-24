package com.six.dcsystem.Bean;

import java.util.Date;

public class Record {
    private Integer recordid;

    private Date buyingtime;

    private Integer initialammeternum;

    private Integer ammeterid;

    private Date termofvalidity;

    private String manufacturer;

    private String model;

    private Date factorytime;

    private Float cost;

    private String remarks;

    private String enclosure;

    private String type;

    private String characteristic;

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    public Date getBuyingtime() {
        return buyingtime;
    }

    public void setBuyingtime(Date buyingtime) {
        this.buyingtime = buyingtime;
    }

    public Integer getInitialammeternum() {
        return initialammeternum;
    }

    public void setInitialammeternum(Integer initialammeternum) {
        this.initialammeternum = initialammeternum;
    }

    public Integer getAmmeterid() {
        return ammeterid;
    }

    public void setAmmeterid(Integer ammeterid) {
        this.ammeterid = ammeterid;
    }

    public Date getTermofvalidity() {
        return termofvalidity;
    }

    public void setTermofvalidity(Date termofvalidity) {
        this.termofvalidity = termofvalidity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Date getFactorytime() {
        return factorytime;
    }

    public void setFactorytime(Date factorytime) {
        this.factorytime = factorytime;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure == null ? null : enclosure.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic == null ? null : characteristic.trim();
    }
}