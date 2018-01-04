package ru.moneybranch.webapp.model.resume;

import ru.moneybranch.webapp.auxiliary.ConsoleColors;
import ru.moneybranch.webapp.auxiliary.Utils;
import ru.moneybranch.webapp.interfaces.Activityable;
import ru.moneybranch.webapp.interfaces.PracticalSkills;
import ru.moneybranch.webapp.model.position.Applicant;
import ru.moneybranch.webapp.model.profactivity.Educational;
import ru.moneybranch.webapp.model.profactivity.Experience;
import ru.moneybranch.webapp.model.prosperity.Achievements;
import ru.moneybranch.webapp.model.prosperity.Skills;

import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate; // хранит год, месяц и день. Он используется для хранения и обработки даты без времени.
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * stanley
 * 31.12.17.
 */
public class Resume {




    public Resume() throws ParseException {
    }

    public static void main(String[] args) throws ParseException {

        Applicant applicant = new Applicant("Артем","Силаев","Андреевич",24,"Сбербанк. Старший специалист IT отдела.",new String[]{"ответственность","перфекционизм","усидчивость","критический склад ума","люблю спорт"},4717532,"oklow@yandex.ru");
        System.out.println(applicant);
        System.out.println(ConsoleColors.ANSI_GREEN + "Личные качества: " + ConsoleColors.ANSI_WHITE);
        String[] arrQuaites = applicant.getPersonalQualites();
        for (int i = 0; i <arrQuaites.length; i++) {
            System.out.print(arrQuaites[i] + (i == arrQuaites.length-1 ? ".\n":", "));

        }
        System.out.println(Utils.getOverLine());
        System.out.println();






        Activityable.getSectionHeader("Опыт");

        Experience npcIRS = new Experience("\"ЗАО\" НПЦ ИРС",new String[]{"04/2014","06/2014"},"Тестирование и сопровождение программного обеспечения.Создание небольших локальных сетей и тестирование аппаратных средств.","Лаборант");
        Experience irbis = new Experience("\"ОАО\" Ирбис",new String[]{"08/2014","11/2016"},"Настройка и сопровождение внутренней сети","Администратор");
        Experience liebherr = new Experience("\"ОАО\" Liebherr",new String[]{"12/2016","н.в."},"Разработка и поддержка высоконагруженнных серверов","Специалист");

        System.out.println(npcIRS+ "\n"+ irbis+ "\n"+ liebherr) ;

        Activityable.getSectionHeader("Образование");

        Educational kp15 = new Educational("Коллежд предпринимательства № 15", new String[]{"09/2009","06/2012"},"Начальное профессиональное. По специальности оператор ЭВМ","технический","очная форма");
        Educational mok1 = new Educational("Первый московский общеобразовательный комплекс", new String[]{"09/2012","06/2015"},"Среднее профессиональное. Информационные системы по отраслям","технический","очная форма");
        System.out.println(kp15 + "\n" + mok1);













    }















}
