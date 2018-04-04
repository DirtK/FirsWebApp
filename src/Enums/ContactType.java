package Enums;

/**
 * stanley
 * 04.04.18.
 */
public enum ContactType {

    PHONE("Телефон"),
    MOBILE("Мобильный"),
    SKYPE("Скайп"),
    MAIL("Почта"),
    ICQ;

    private String type;

    ContactType() {
    }

    ContactType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return  type;
    }
}
