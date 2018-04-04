package ru.moneybranch.webapp.model;

import java.util.Date;

/**
 * stanley
 * 06.01.18.
 */
public class Organization {
    private String orgName;
    private String period;

    public Organization(String orgName, String period) {
        this.orgName = orgName;
        this.period = period;
    }

    public void setOrgName(String orgName){
        this.orgName = orgName;
    }

    public String getOrgName(){
        return orgName;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return orgName + "\n"+ period;
    }
}
