package ru.moneybranch.webapp.interfaces;

import ru.moneybranch.webapp.auxiliary.ConsoleColors;
import ru.moneybranch.webapp.model.profactivity.Experience;
import ru.moneybranch.webapp.model.profactivity.ProfessionalActivity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * stanley
 * 02.01.18.
 */
public interface Activityable {

    /**
     * Метод по умолчанию. Доступны начиная с JAVA 8. Данные методы позволяют задать начальную реализацию.
     * Также, методы по умолчанию в позволяют избежать создания служебных классов, так как все необходимые методы могут быть представлены в самих интерфейсах.
     * @return
     */
    /*default String log(){
        return "";
    }*/

    String getInstitutionName();
    void setInstitutionName(String institutionName);

    static void getSectionHeader(String str){
        if("Опыт".equals(str)){
            System.out.println(ConsoleColors.ANSI_PURPLE +"опыт работы\n".toUpperCase() + ConsoleColors.ANSI_RESET);
        }
        else if("Образование".equals(str)){
            System.out.println(ConsoleColors.ANSI_PURPLE +"образование\n".toUpperCase() + ConsoleColors.ANSI_RESET);
        }
    }



    String[] getTimeDuration();
    void setTimeDuration(String[] duration);

    String getDescription();
    void setDescription(String description);
}
