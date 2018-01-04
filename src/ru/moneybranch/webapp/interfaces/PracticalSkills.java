package ru.moneybranch.webapp.interfaces;

import ru.moneybranch.webapp.auxiliary.ConsoleColors;

import java.util.List;

/**
 * stanley
 * 04.01.18.
 */
public interface PracticalSkills {

    static void getSectionHeader(String str){
        if("Достижения".equals(str)){
            System.out.println(ConsoleColors.ANSI_PURPLE +"Достижения\n".toUpperCase() + ConsoleColors.ANSI_RESET);
        }
        else if("Квалификация".equals(str)){
            System.out.println(ConsoleColors.ANSI_PURPLE +"Квалификация\n".toUpperCase() + ConsoleColors.ANSI_RESET);
        }
    }

    List<String> getProgressList();
    void setProgressList(List<String> progressList);

}
