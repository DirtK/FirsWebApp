package ru.moneybranch.webapp.interfaces;

/**
 * stanley
 * 04.01.18.
 */
public interface Educationable {

    String[] getWorkDuration(); // Продолжительность работы в годах
    void setWorkDuration(String[] workDuration);

    boolean isWorkAvailability();
    void setWorkAvailability(boolean workAvailability);

    String getTrainingForm();
    void setTrainingForm(String trainingForm);

    String getFaculty();
    void setFaculty(String faculty);
}
