package Lesson3;

import Enums.ContactType;
import ru.moneybranch.webapp.model.Contact;
import ru.moneybranch.webapp.model.Link;

import java.lang.reflect.Field;

/**
 * stanley
 * 05.04.18.
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Contact c = new Contact(ContactType.SKYPE, "1233443");
        System.out.printf("%1$s: %2$s\n", c.getType(), c.getValue());
        ContactType type = ContactType.ICQ;

        Link l = new Link("NaMe", "URL");

        Field field = Link.class.getDeclaredField("url"); // получаю имя поля через отражение
        System.out.println("Имя переменной: " + field.getName()); // variable name
        field.setAccessible(true);// Т.к.  объявленное поле - приватное, то небходимо открыть доступ к нему
        System.out.println("Значение переменной: " + field.get(l)); // объект, в котором значение поля должно быть возвращено
        System.out.println(l);
        System.out.println(l instanceof Link); // аналогично
        System.out.println(Link.class.isInstance(l)); // является ли объект экз-м этого класса

        String fill = "";
        String a1 = "Ja" + "va";
        String a2 = "Java";
        System.out.println(a1 == a2);

        for (int i = 0; i < 10; i++) { // это грубейшая ошибка. Тк создается 10 раных строк
            fill += a1 + " ";
        }


        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 500; i++) {
            builder.append(a1).append(" ").append(a2);
        }


   /* public static  <T> void sizeOf(T var) {
        Runtime.getRuntime().gc();
        String fill = "";
        long before = Runtime.getRuntime().freeMemory();
        for (int i = 0; i < 10; i++) { // это грубейшая ошибка. Тк создается 10 раных строк
            fill += var + " ";
        }
        long after = Runtime.getRuntime().freeMemory();
        System.out.println("Memory used:" + (before - after));
    }*/
    }
}
