package ru.moneybranch.webapp.model;

/**
 * stanley
 * 06.01.18.
 */
public class Contact {

    private final String TYPE;
    private final String VALUE;

    public Contact(String type, String value) {
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
