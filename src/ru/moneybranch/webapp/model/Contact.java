package ru.moneybranch.webapp.model;

import Enums.ContactType;

/**
 * stanley
 * 06.01.18.
 */
public class Contact {

    private final ContactType TYPE;
    private final String VALUE;

    public Contact(ContactType type, String value) {
        this.TYPE = type;
        this.VALUE = value;
    }

    public String getType() {
        return TYPE;
    }

    public String getValue() {
        return VALUE;
    }
}
