package ru.moneybranch.webapp.model;

import ru.moneybranch.webapp.model.auxiliary.ConsoleColors;
import ru.moneybranch.webapp.model.interfaces.ICar;

/**
 * stanley
 * 01.01.18.
 */
public class BudgetCar extends Car  {

    private String preferredCassette;
    private boolean statusRecorder;

    public BudgetCar(String carMark, int year, int curSpeed) {
        super(carMark, year, curSpeed);
    }

    public BudgetCar(String carMark, int year) {
        super(carMark, year);
    }

    public BudgetCar(String carMark, int year, boolean carBroken) {
        super(carMark, year, carBroken);
    }

    public BudgetCar(String carMark, int year, int curSpeed, boolean carBroken) {
        super(carMark, year, curSpeed, carBroken);
    }

    public BudgetCar(String carMark, int year, int curSpeed, String preferredCassette, boolean statusRecorder) {
        super(carMark, year, curSpeed);
        this.preferredCassette = preferredCassette;
        this.statusRecorder = statusRecorder;
    }

    public BudgetCar(String carMark, int year, String preferredCassette, boolean statusRecorder) {
        super(carMark, year);
        this.preferredCassette = preferredCassette;
        this.statusRecorder = statusRecorder;
    }

    public BudgetCar(String carMark, int year, boolean carBroken, String preferredCassette, boolean statusRecorder) {
        super(carMark, year, carBroken);
        this.preferredCassette = preferredCassette;
        this.statusRecorder = statusRecorder;
    }

    public BudgetCar(String carMark, int year, int curSpeed, boolean carBroken, String preferredCassette, boolean statusRecorder) {
        super(carMark, year, curSpeed, carBroken);
        this.preferredCassette = preferredCassette;
        this.statusRecorder = statusRecorder;
    }

    public String getPreferredCassette() {
        return preferredCassette;
    }

    public void setPreferredCassette(String preferredCassette) {
        this.preferredCassette = preferredCassette;
    }

    public boolean isStatusRecorder() {
        return statusRecorder;
    }

    public void setStatusRecorder(boolean statusRecorder) {
        this.statusRecorder = statusRecorder;
    }

    @Override
    public void Go() {
        System.out.print("Кастомкар ");
        super.Go();
    }

    @Override
    public float getVolumeEngine() {
        if(this.getCarMark().contains("GAZ 24"))
            return 12;
        else
        return super.getVolumeEngine();
    }

    public void turnOnTheMusic(){
        if(isStatusRecorder() && !getPreferredCassette().isEmpty()){
            System.out.println("Играет музыка: " + ConsoleColors.ANSI_GREEN + getPreferredCassette() + ConsoleColors.ANSI_RESET);
        }

    }
}
