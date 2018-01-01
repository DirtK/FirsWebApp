package ru.moneybranch.webapp.model;

/**
 * stanley
 * 01.01.18.
 */
public class SportCar extends Car {

    public SportCar(String carMark, int year, int curSpeed) {
        super(carMark, year, curSpeed);
    }

    public SportCar(String carMark, int year) {
        super(carMark, year);
    }

    public SportCar(String carMark, int year, boolean carBroken) {
        super(carMark, year, carBroken);
    }

    public SportCar(String carMark, int year, int curSpeed, boolean carBroken) {
        super(carMark, year, curSpeed, carBroken);
    }

    @Override
    public void Go() {
        System.out.print("Спорткар ");
        super.Go();
    }

    @Override
    public float getVolumeEngine() {
        return 3.5f;
    }
}
