package ru.moneybranch.webapp.model;

import Enums.SectionType;

/**
 * stanley
 * 06.01.18.
 */
public class Section {
    protected final SectionType sectionName;


    public Section(SectionType sectionName) {
        this.sectionName = sectionName;
     }

    public SectionType getSectionName() {
        return sectionName;
    }


}
