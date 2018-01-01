package main;

import ru.moneybranch.webapp.model.BudgetCar;
import ru.moneybranch.webapp.model.Car;
import ru.moneybranch.webapp.model.SportCar;
import ru.moneybranch.webapp.model.auxiliary.ConsoleColors;
import ru.moneybranch.webapp.model.interfaces.ICar;

public class Main {

    public static void main(String[] args) {
        ICar altezza = new SportCar("Altezza",2001,true); // За счет использования ссылки на интерфейс, ограничиваю список доступных методов. PS - только те, что описаны в интерфейсе
        ICar celsior = new SportCar("Celsior",1991,220,true);
        ICar clioV6  = new SportCar("Reno V6",2002,310,false);
        BudgetCar gaz24 = new BudgetCar("GAZ 24 Custom Black",2005,75,"Burial Loner",true);

        gaz24.Go();
        gaz24.setEngineName("Chrysler RB 426 V8 Hemi");
        System.out.format("Движок: %s %s v%.0f %s \n", ConsoleColors.ANSI_PURPLE,gaz24.getEngineName(), gaz24.getVolumeEngine(), ConsoleColors.ANSI_RESET );
        gaz24.turnOnTheMusic();

        System.out.println();
        altezza.Go();
        celsior.Go();
        clioV6.Go();

        System.out.println();
        ((Car)altezza).getCarState();
        ((Car)celsior).getCarState();
        ((Car)clioV6).getCarState();


    }
}

// Вкладка Version Control позволяет узнать правки по проекту
