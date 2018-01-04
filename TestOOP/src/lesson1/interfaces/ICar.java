package lesson1.interfaces;

/**
 * stanley
 * 31.12.17.
 */
public interface ICar {

    String getCarMark();
    void setCarMark(String carMark);

    int getYear();
    void setYear(int year);

    int getCurSpeed();
    void setCurSpeed(int curSpeed);

    float getVolumeEngine();
    void setVolumeEngine(float litres);

    String getEngineName();
    void setEngineName(String engineName);


    boolean isCarBroken();
    void  setCarBroken(boolean carBroken);

    void Go();
}
