package ru.moneybranch.webapp.model.profactivity;

import ru.moneybranch.webapp.auxiliary.ConsoleColors;
import ru.moneybranch.webapp.auxiliary.Utils;
import ru.moneybranch.webapp.interfaces.Experianceable;

import java.util.Arrays;

import static ru.moneybranch.webapp.auxiliary.Utils.makeTabulation;
import static ru.moneybranch.webapp.auxiliary.Utils.printArrItem;

/**
 * stanley
 * 02.01.18.
 */
public class Experience extends ProfessionalActivity implements Experianceable {

    private String post;

    public Experience() {
    }

    public Experience(String institutionName, String[] timeDuration, String description, String post) {
        super(institutionName, timeDuration, description);
        this.post = post;
    }

    @Override
    public String getPost() {
        return post;
    }

    @Override
    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        String resoultString;
        String timeDuation = Arrays.toString(getTimeDuration()).replace("[", "").replace(",", " -").replace("]", "");
        builder
                .append("Место работы: ")
                .append(ConsoleColors.ANSI_BLUE)
                .append(getInstitutionName())
                .append(ConsoleColors.ANSI_RESET)
                .append("\n")
                .append(timeDuation)
                .append("\t\t\t")
                .append("Должность: ")
                .append(post)
                .append("\n")
                .append("\t\t\t\t\t\t\t")
                .append(printArrItem(makeTabulation(getDescription())))
                .append("\n")
                .append(Utils.getOverLine());

        return builder.toString();
    }



}