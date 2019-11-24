package com.six.dcsystem.Bean;

import java.util.Date;

public class Settlement {
    private Integer settlementkey;

    private String settlementid;

    private Integer ammeterid;

    private Integer ammeternnum;

    private Integer ammeternnum25;

    private Float unitprice;

    private Float totalcost;

    private Float lastaccountbalance;

    private Float amountofpayment;

    private Date creationtime;

    private String founder;

    private Date updatetime;

    private String updateperson;

    private String postpone;

    private Float initialvalue;

    private String redescription;

    private String enclosure;

    private String zhuangtai;

    private String zt;

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public Integer getSettlementkey() {
        return settlementkey;
    }

    public void setSettlementkey(Integer settlementkey) {
        this.settlementkey = settlementkey;
    }

    public String getSettlementid() {
        return settlementid;
    }

    public void setSettlementid(String settlementid) {
        this.settlementid = settlementid == null ? null : settlementid.trim();
    }

    public Integer getAmmeterid() {
        return ammeterid;
    }

    public void setAmmeterid(Integer ammeterid) {
        this.ammeterid = ammeterid;
    }

    public Integer getAmmeternnum() {
        return ammeternnum;
    }

    public void setAmmeternnum(Integer ammeternnum) {
        this.ammeternnum = ammeternnum;
    }

    public Integer getAmmeternnum25() {
        return ammeternnum25;
    }

    public void setAmmeternnum25(Integer ammeternnum25) {
        this.ammeternnum25 = ammeternnum25;
    }

    public Float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Float unitprice) {
        this.unitprice = unitprice;
    }

    public Float getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(Float totalcost) {
        this.totalcost = totalcost;
    }

    public Float getLastaccountbalance() {
        return lastaccountbalance;
    }

    public void setLastaccountbalance(Float lastaccountbalance) {
        this.lastaccountbalance = lastaccountbalance;
    }

    public Float getAmountofpayment() {
        return amountofpayment;
    }

    public void setAmountofpayment(Float amountofpayment) {
        this.amountofpayment = amountofpayment;
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

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateperson() {
        return updateperson;
    }

    public void setUpdateperson(String updateperson) {
        this.updateperson = updateperson == null ? null : updateperson.trim();
    }

    public String getPostpone() {
        return postpone;
    }

    public void setPostpone(String postpone) {
        this.postpone = postpone == null ? null : postpone.trim();
    }

    public Float getInitialvalue() {
        return initialvalue;
    }

    public void setInitialvalue(Float initialvalue) {
        this.initialvalue = initialvalue;
    }

    public String getRedescription() {
        return redescription;
    }

    public void setRedescription(String redescription) {
        this.redescription = redescription == null ? null : redescription.trim();
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure == null ? null : enclosure.trim();
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }
}