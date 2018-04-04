package Enums;

/**
 * stanley
 * 04.04.18.
 */
public enum Frameworks {
    Java("Spring(MVC, Security, Data, Bot), JPA(Hibernate), GWT(SmartGWT, ExtGWT/GXT), JUnit"),
    JS("jQuery"),
    PHP("Yii 2, Cake");

    private String frameworks;
    Frameworks(String frameworks){
        this.frameworks = frameworks;
    }

    public String getFrameworks() {
        return frameworks;
    }


}
