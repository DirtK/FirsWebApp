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
        /*int i = 5;
        Link link1 = new Link("javawebinar", "mystudy.ru");
        Link link2 = link1;
        Link link3 = new Link(link2);
        System.out.println(link1.getName().hashCode());
        System.out.println(link3.getName().hashCode());


        System.out.println(link1.hashCode());
        System.out.println(link3.hashCode());

        System.out.println(link1.getClass());
        System.out.println(link1.equals(link2));
        System.out.println(link2.equals(link3));*/

        Integer integer = 16; // Не обязательно делать явное создание объекта (Boxing). Начиная с JAVA 5 это происходит имплицитно
        System.out.println(Link.getEMPTY()); // Обращаюсь к статическому полю
        char ch = 'Q'; // размер чара = 2 байта. 2 в 16-й степени - где-то 16 тысяч символов в этот размер. Unicode
        // а сейчас как стандарт идет UTF-8
        printInt(integer);

}

   static void printInt(Integer integer){
       System.out.println(integer);
   }

   static void printInt(int i) {// Здесь, если передается объектный тип, то сперва происходит unboxing, и уже потом идет распечатка
        System.out.println("i = " + i);
    }

}


