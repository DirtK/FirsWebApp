package ru.moneybranch.webapp.model;

/**
 * stanley
 * 04.04.18.
 */
public class Education {
    private Organization educateOrg;
    private String direction;

    public Education(Organization educateOrg, String direction) {
        this.educateOrg = educateOrg;
        this.direction = direction;
    }

    public Organization getEducateOrg() {
        return educateOrg;
    }

    public void setEducateOrg(Organization educateOrg) {
        this.educateOrg = educateOrg;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return  educateOrg + "\t\t" + direction;
    }
}
