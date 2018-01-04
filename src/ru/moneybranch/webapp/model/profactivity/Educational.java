package ru.moneybranch.webapp.model.profactivity;

import ru.moneybranch.webapp.auxiliary.ConsoleColors;
import ru.moneybranch.webapp.interfaces.Educationable;

import java.util.Arrays;

import static ru.moneybranch.webapp.auxiliary.Utils.makeTabulation;
import static ru.moneybranch.webapp.auxiliary.Utils.printArrItem;

/**
 * stanley
 * 04.01.18.
 */
public class Educational extends ProfessionalActivity implements Educationable {

    private String faculty;
    private String trainingForm;
    private boolean workAvailability;
    private String[] workDuration;

    public Educational() {
    }


    public Educational(String institutionName, String[] timeDuration, String description, String faculty, String trainingForm) {
        super(institutionName, timeDuration, description);
        this.faculty = faculty;
        this.trainingForm = trainingForm;
    }

    public Educational(String institutionName, String[] timeDuration, String description, String faculty, String trainingForm, boolean workAvailability, String[] workDuration) {
        super(institutionName, timeDuration, description);
        this.faculty = faculty;
        this.trainingForm = trainingForm;
        this.workAvailability = workAvailability;
        this.workDuration = workDuration;
    }

    @Override
    public String[] getWorkDuration() {
        return workDuration;
    }

    @Override
    public void setWorkDuration(String[] workDuration) {
        this.workDuration = workDuration;
    }

    @Override
    public boolean isWorkAvailability() {
        return workAvailability;
    }

    @Override
    public void setWorkAvailability(boolean workAvailability) {
        this.workAvailability = workAvailability;
    }

    @Override
    public String getTrainingForm() {
        return trainingForm;
    }

    @Override
    public void setTrainingForm(String trainingForm) {
        this.trainingForm = trainingForm;
    }

    @Override
    public String getFaculty() {
        return faculty;
    }

    @Override
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        char[] overline = new char[100];
        for (int i = 0; i < overline.length; i++) {
            overline[i] = '\u203e';

        }
        StringBuilder builder = new StringBuilder();
        String timeDuation = Arrays.toString(getTimeDuration()).replace("[", "").replace(",", " -").replace("]", "");
        builder
                .append("Место учебы: ")
                .append(ConsoleColors.ANSI_BLUE)
                .append(getInstitutionName())
                .append(ConsoleColors.ANSI_RESET)
                .append(getInstitutionName().length()<=30 ? "":"\t\t\t\t\t")
                .append("Период: ")
                .append(ConsoleColors.ANSI_RED)
                .append(timeDuation)
                .append(ConsoleColors.ANSI_RESET)
                .append("\n")
                .append("Факультет: ")
                .append(getFaculty())
                .append("\n")
                .append("Форма обучения: ")
                .append(getTrainingForm())
                .append("\n")
                .append("Направление: ")
                .append(printArrItem(makeTabulation(getDescription())))
                .append("\n")
                .append(overline);

        return builder.toString();
    }
}
