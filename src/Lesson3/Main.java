package Lesson3;

import Enums.ContactType;
import ru.moneybranch.webapp.model.Contact;

/**
 * stanley
 * 05.04.18.
 */
public class Main {
    public static void main(String[] args) {
        Contact c = new Contact(ContactType.SKYPE,"1233443");
        System.out.printf("%1$s: %2$s",c.getType(), c.getValue());
        ContactType type = ContactType.ICQ;

    }
}
