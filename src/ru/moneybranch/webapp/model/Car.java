package ru.moneybranch.webapp.model;

import ru.moneybranch.webapp.model.auxiliary.ConsoleColors;
import ru.moneybranch.webapp.model.interfaces.ICar;

/**
 * stanley
 * 31.12.17.
 */
public abstract class Car implements ICar {
    private String carMark;
    private int year;
    private int curSpeed = 100;
    private boolean carBroken;
    private String engineName;
    private float engineLitres;

    public Car() {
    }

    public Car(String carMark, int year, int curSpeed) {
        this.carMark = carMark;
        this.year = year;
        this.curSpeed = curSpeed;
    }

    public Car(String carMark, int year) {
        this.carMark = carMark;
        this.year = year;
    }

    public Car(String carMark, int year, boolean carBroken) {
        this.carMark = carMark;
        this.year = year;
        this.carBroken = carBroken;
    }

    public Car(String carMark, int year, int curSpeed, boolean carBroken) {
        this.carMark = carMark;
        this.year = year;
        this.curSpeed = curSpeed;
        this.carBroken = carBroken;
    }

    @Override
    public void Go() {
        System.out.format("%s едет со скоростью %s км/ч \n", getCarMark(), getCurSpeed());
    }

    @Override
    public String getCarMark() {
        return ConsoleColors.ANSI_BLUE + carMark + ConsoleColors.ANSI_RESET;
    }

    @Override
    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getCurSpeed() {
        return curSpeed;
    }

    @Override
    public void setCurSpeed(int curSpeed) {
        this.curSpeed = curSpeed;
    }

    @Override
    public float getVolumeEngine() {
        return engineLitres;
    }

    @Override
    public void setVolumeEngine(float litres) {
        engineLitres = litres;
    }

    @Override
    public String getEngineName() {
        return engineName;
    }

    @Override
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Override
    public boolean isCarBroken() {
        return carBroken;
    }

    @Override
    public void setCarBroken(boolean carBroken) {
        this.carBroken = carBroken;
    }

    public  void getCarState(){
        if(isCarBroken())
            System.out.println(this + ": разбита");
        else
            System.out.println(this + ": на ходу");
    }

    @Override
    public String toString() {
        return getCarMark() + " " +getYear() + " года";
    }
}
