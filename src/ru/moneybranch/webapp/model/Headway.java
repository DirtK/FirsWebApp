package ru.moneybranch.webapp.model;

import Enums.SectionType;

import java.util.List;

/**
 * stanley
 * 05.04.18.
 */
public class Headway extends Section {
    private List<String> values;

    public Headway(SectionType sectionName) {
        super(sectionName);
    }


    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}
