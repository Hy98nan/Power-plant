package com.six.dcsystem.Bean;

import java.util.Date;

public class Statistics {
    private String statisticsid;

    private String ammeterid;

    private Date times;

    private Float totalwordcount;

    private Float totalsum;

    public String getStatisticsid() {
        return statisticsid;
    }

    public void setStatisticsid(String statisticsid) {
        this.statisticsid = statisticsid == null ? null : statisticsid.trim();
    }

    public String getAmmeterid() {
        return ammeterid;
    }

    public void setAmmeterid(String ammeterid) {
        this.ammeterid = ammeterid == null ? null : ammeterid.trim();
    }

    public Date getTimes() {
        return times;
    }

    public void setTimes(Date times) {
        this.times = times;
    }

    public Float getTotalwordcount() {
        return totalwordcount;
    }

    public void setTotalwordcount(Float totalwordcount) {
        this.totalwordcount = totalwordcount;
    }

    public Float getTotalsum() {
        return totalsum;
    }

    public void setTotalsum(Float totalsum) {
        this.totalsum = totalsum;
    }
}