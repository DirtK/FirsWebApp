package ru.moneybranch.webapp.model;

import Enums.SectionType;

import java.util.Date;
import java.util.List;

/**
 * stanley
 * 05.04.18.
 */
public class OrganizationSection extends Section {
    private List<Organization> values;

    public OrganizationSection(SectionType sectionName) {
        super(sectionName);
    }
}
