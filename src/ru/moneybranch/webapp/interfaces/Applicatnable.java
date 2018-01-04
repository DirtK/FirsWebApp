package ru.moneybranch.webapp.interfaces;

/**
 * stanley
 * 02.01.18.
 */
public interface Applicatnable{

    String getFirstName();
    void setFirstName(String firstName);

    String getLastName();
    void setLastName(String lastName);

    String getPatronymic();
    void setpatronymic(String patronymic);

    int getAge();
    void setAge(int age);

    String getCurrentPosition(); // текущая позиция
    void setCurrentPosition(String currentPosition);

    String [] getPersonalQualites(); // Личные качества
    void setPersonalQualities(String[] qualities);

    int getPhone();
    void setPhone(int phone);

    String getMail();
    void setMail(String mail);




}
