package ru.moneybranch.webapp.model;

import java.util.Date;

/**
 * stanley
 * 04.04.18.
 */
public class Experience{

    private Organization jobIn;
    private String position;
    private String descriptionPos;

    public Experience(Organization jobIn, String position, String descriptionPos) {
        this.jobIn = jobIn;
        this.position = position;
        this.descriptionPos = descriptionPos;
    }

    public Organization getJobIn() {
        return jobIn;
    }

    public void setJobIn(Organization jobIn) {
        this.jobIn = jobIn;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescriptionPos() {
        return descriptionPos;
    }

    public void setDescriptionPos(String descriptionPos) {
        this.descriptionPos = descriptionPos;
    }

    @Override
    public String toString() {
        return jobIn + "\t\t" + position +  "\n\t\t" + descriptionPos+
                '}';
    }
}
