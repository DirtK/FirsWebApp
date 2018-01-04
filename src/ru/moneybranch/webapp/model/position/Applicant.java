package ru.moneybranch.webapp.model.position;

import ru.moneybranch.webapp.auxiliary.ConsoleColors;
import ru.moneybranch.webapp.interfaces.Applicatnable;

import java.util.Arrays;

import static ru.moneybranch.webapp.auxiliary.Utils.makeTabulation;
import static ru.moneybranch.webapp.auxiliary.Utils.printArrItem;

/**
 * stanley
 * 02.01.18.
 */
public class Applicant implements Applicatnable {

    private String firstName;
    private String lastName;
    private String patronymic;
    private int age;
    private String currentPosition;
    private String[] personalQualities;
    private int phone;
    private String mail;

    public Applicant(String firstName, String lastName, String patronymic, int age, int phone, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.age = age;
        this.phone = phone;
        this.mail = mail;
    }

    public Applicant(String firstName, String lastName, String patronymic, int age, String currentPosition) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.age = age;
        this.currentPosition = currentPosition;
    }

    public Applicant(String firstName, String lastName, String patronymic, int age, String currentPosition, String[] personalQualities, int phone, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.age = age;
        this.currentPosition = currentPosition;
        this.personalQualities = personalQualities;
        this.phone = phone;
        this.mail = mail;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public void setpatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    @Override
    public String[] getPersonalQualites() {
        return personalQualities;
    }

    @Override
    public void setPersonalQualities(String[] qualities) {
        personalQualities = qualities;
    }

    @Override
    public int getPhone() {
        return phone;
    }

    @Override
    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public void setMail(String mail) {
        this.mail = mail;
    }


    @Override
    public String toString() {
        char[] overline = new char[100];
        for (int i = 0; i < overline.length; i++) {
            overline[i] = '\u203e';

        }
        StringBuilder builder = new StringBuilder();


        builder

                .append(ConsoleColors.ANSI_BLACK)
                .append(getLastName().toUpperCase())
                .append("\t")
                .append(getFirstName().toUpperCase())
                .append("\t")
                .append(getPatronymic().toUpperCase())
                .append(ConsoleColors.ANSI_RESET)
                .append("\n")
                .append(ConsoleColors.ANSI_CYAN)
                .append("Текущая позиция: ")
                .append(getCurrentPosition())
                .append("\n")
                .append(ConsoleColors.ANSI_RESET)
                .append("Возраст: ")
                .append(getAge())
                .append("\n")
                .append("Телефон: ")
                .append(getPhone())
                .append("\n")
                .append("Почта: ")
                .append(ConsoleColors.ANSI_YELLOW)
                .append(getMail())
                .append(ConsoleColors.ANSI_RESET)
                .append("\n")
                .append(overline);

        return builder.toString();
    }

   /* @Override
    public String toString() {
        return ConsoleColors.ANSI_BLUE +"Позиция: \n".toUpperCase() + ConsoleColors.ANSI_RESET + currentPosition;
    }*/
}
