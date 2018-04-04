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
        Contact c = new Contact(ContactType.SKYPE,"1233443");
        System.out.printf("%1$s: %2$s\n",c.getType(), c.getValue());
        ContactType type = ContactType.ICQ;

        Link l = new Link("NaMe","URL");

        Field field = Link.class.getDeclaredField("url"); // получаю имя поля через отражение
        field.setAccessible(true);// Т.к.  объявленное поле - приватное, то небходимо открыть доступ к нему
        System.out.println(field.get(l));
        System.out.println(l);
    }
}
