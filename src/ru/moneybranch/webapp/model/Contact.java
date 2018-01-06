package ru.moneybranch.webapp.model;

/**
 * stanley
 * 06.01.18.
 */
public class Contact {

    private final String type;
    private final String value;

    public Contact(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
