package ru.moneybranch.webapp.model;

import java.util.Date;

/**
 * stanley
 * 06.01.18.
 */
public class Organization {
    private String orgName;
    private Date periodOfWork;

    public Organization(String orgName, Date periodOfWork) {
        this.orgName = orgName;
        this.periodOfWork = periodOfWork;
    }

    public void setOrgName(String orgName){
        this.orgName = orgName;
    }

    public String getOrgName(){
        return orgName;
    }

    public Date getPeriodOfWork() {
        return periodOfWork;
    }

    public void setPeriodOfWork(Date periodOfWork) {
        this.periodOfWork = periodOfWork;
    }
}
