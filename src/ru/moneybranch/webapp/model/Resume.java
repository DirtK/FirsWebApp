package ru.moneybranch.webapp.model;



import Enums.SectionType;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

/**
 * stanley
 * 31.12.17.
 */
public class Resume {
    private String uuid;
    private String fullName;
    private String location;
    private String homePage;
    private List<Contact> contacts;
    private List<Section> sections;

    public Resume(){
    }

    public Resume(String fullName, String location) {
        this(UUID.randomUUID().toString(),fullName,location); // В java есть UUID класс, позволяющий генерить случайную строчку, которая гарантирует уникальность
    }

    public Resume(String uuid, String fullName, String location) {
        this.uuid = uuid;
        this.fullName = fullName;
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resume resume = (Resume) o;

        return uuid.equals(resume.uuid);

    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    public void addSection(Section section){
        sections.add(section);
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public static void main(String[] args)  {



    }















}
