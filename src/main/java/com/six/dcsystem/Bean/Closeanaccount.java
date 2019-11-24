package com.six.dcsystem.Bean;

import java.util.Date;

public class Closeanaccount {
    private Integer zhujian;

    private String tariffset;

    private String checkid;

    private Float tollmeters;

    private Float unitprice;

    private Float totalsum;

    private Float actualcost;

    private String paymentmethod;

    private String invoices;

    private Integer dutyparagraph;

    private String corporatename;

    private String contactse;

    private Integer contacttelephone;

    private String openingbank;

    private String founder;

    private Date creationtime;

    private String updateperson;

    private Date updatetime;

    private Settlement settlement;

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public Integer getZhujian() {
        return zhujian;
    }

    public void setZhujian(Integer zhujian) {
        this.zhujian = zhujian;
    }

    public String getTariffset() {
        return tariffset;
    }

    public void setTariffset(String tariffset) {
        this.tariffset = tariffset == null ? null : tariffset.trim();
    }

    public String getCheckid() {
        return checkid;
    }

    public void setCheckid(String checkid) {
        this.checkid = checkid == null ? null : checkid.trim();
    }

    public Float getTollmeters() {
        return tollmeters;
    }

    public void setTollmeters(Float tollmeters) {
        this.tollmeters = tollmeters;
    }

    public Float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Float unitprice) {
        this.unitprice = unitprice;
    }

    public Float getTotalsum() {
        return totalsum;
    }

    public void setTotalsum(Float totalsum) {
        this.totalsum = totalsum;
    }

    public Float getActualcost() {
        return actualcost;
    }

    public void setActualcost(Float actualcost) {
        this.actualcost = actualcost;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod == null ? null : paymentmethod.trim();
    }

    public String getInvoices() {
        return invoices;
    }

    public void setInvoices(String invoices) {
        this.invoices = invoices == null ? null : invoices.trim();
    }

    public Integer getDutyparagraph() {
        return dutyparagraph;
    }

    public void setDutyparagraph(Integer dutyparagraph) {
        this.dutyparagraph = dutyparagraph;
    }

    public String getCorporatename() {
        return corporatename;
    }

    public void setCorporatename(String corporatename) {
        this.corporatename = corporatename == null ? null : corporatename.trim();
    }

    public String getContactse() {
        return contactse;
    }

    public void setContactse(String contactse) {
        this.contactse = contactse == null ? null : contactse.trim();
    }

    public Integer getContacttelephone() {
        return contacttelephone;
    }

    public void setContacttelephone(Integer contacttelephone) {
        this.contacttelephone = contacttelephone;
    }

    public String getOpeningbank() {
        return openingbank;
    }

    public void setOpeningbank(String openingbank) {
        this.openingbank = openingbank == null ? null : openingbank.trim();
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
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
}