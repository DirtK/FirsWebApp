package ru.moneybranch.webapp.model.profactivity;

import ru.moneybranch.webapp.interfaces.Activityable;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * stanley
 * 02.01.18.
 */
public abstract class ProfessionalActivity implements Activityable {

    private static String sectionHeader;
    private String institutionName; // Учреждение
    private String[] timeDuration;    // Длительность работы/Уебы
    private String description;


    public ProfessionalActivity() {
    }

    protected ProfessionalActivity(String institutionName, String[] timeDuration, String description) {
        this.institutionName = institutionName;
        this.timeDuration = timeDuration;
        this.description = description;
    }

    @Override
    public String getInstitutionName() {
        return institutionName;
    }

    @Override
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }





    @Override
    public String[] getTimeDuration() {
        return timeDuration;
    }

    @Override
    public void setTimeDuration(String[] duration) {
        timeDuration = duration;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
