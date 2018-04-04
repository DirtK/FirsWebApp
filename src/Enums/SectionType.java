package Enums;

/**
 * stanley
 * 05.04.18.
 */
public enum SectionType {
    OBJECTIVE("В настоящее время", "Начинающий джава программист"),
    ACHIEVEMENT("Достижения"),
    QUALIFICATIONS("Навыки"),
    EXPERIENCE("Опыт работы"),
    EDUCATION("Образование");

    private String type;
    private String desc;

    SectionType() {
    }

    SectionType(String type) {
        this.type = type;
    }

    SectionType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType(){
        return type;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return  type;
    }
}
