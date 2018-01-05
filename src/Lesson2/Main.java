package Lesson2;

import ru.moneybranch.webapp.model.Link;

/**
 * stanley
 * 04.01.18.
 */
public class Main {
    public static void main(String[] args) {
        /*
        * Как известно, оператором new, объекты создаются в куче. Но начиная с java 6, это не совсем так.
        * Например объект link может создасться в куче, а может и в стеке.
        * В java 6 сделали оптимизацию. И если  я создаю этот объект link, использую его и затем забываю про него, нигде не используя и не передавая в другие места программы. То он создается в стеке.
        * Однако, если его необходимо передать, то объект создается как обычно - в куче. И передать ссылку на этот объект.
        *
        * */
        Link link1= new Link("javawebinar","mystudy.ru");
        Link link2 = link1;
        Link link3 = new Link(link2);

        System.out.println(link1.getClass());
        System.out.println(link1.equals(link2));
        System.out.println(link2.equals(link3));


    }
}
