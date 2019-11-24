package com.six.dcsystem.Bean;

import java.util.Date;

public class Basestation {

    private Integer basestationid;

    private String basestationlocation;

    private Date installationtime;

    private Integer ammeterid;

    private String installingcontacts;

    private Float initialnum;

    private String overhaul;

    private String remarks;

    private Integer mainlinenumber;

    private Date termofvalidity;

    private Date closingdate;

    public Integer getBasestationid() {
        return basestationid;
    }

    public void setBasestationid(Integer basestationid) {
        this.basestationid = basestationid;
    }

    public String getBasestationlocation() {
        return basestationlocation;
    }

    public void setBasestationlocation(String basestationlocation) {
        this.basestationlocation = basestationlocation == null ? null : basestationlocation.trim();
    }

    public Date getInstallationtime() {
        return installationtime;
    }

    public void setInstallationtime(Date installationtime) {
        this.installationtime = installationtime;
    }

    public Integer getAmmeterid() {
        return ammeterid;
    }

    public void setAmmeterid(Integer ammeterid) {
        this.ammeterid = ammeterid;
    }

    public String getInstallingcontacts() {
        return installingcontacts;
    }

    public void setInstallingcontacts(String installingcontacts) {
        this.installingcontacts = installingcontacts == null ? null : installingcontacts.trim();
    }

    public Float getInitialnum() {
        return initialnum;
    }

    public void setInitialnum(Float initialnum) {
        this.initialnum = initialnum;
    }

    public String getOverhaul() {
        return overhaul;
    }

    public void setOverhaul(String overhaul) {
        this.overhaul = overhaul == null ? null : overhaul.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getMainlinenumber() {
        return mainlinenumber;
    }

    public void setMainlinenumber(Integer mainlinenumber) {
        this.mainlinenumber = mainlinenumber;
    }

    public Date getTermofvalidity() {
        return termofvalidity;
    }

    public void setTermofvalidity(Date termofvalidity) {
        this.termofvalidity = termofvalidity;
    }

    public Date getClosingdate() {
        return closingdate;
    }

    public void setClosingdate(Date closingdate) {
        this.closingdate = closingdate;
    }
}