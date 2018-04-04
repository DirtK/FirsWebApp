package Lesson2;

import ru.moneybranch.webapp.model.Link;
import java.util.Locale;

/**
 * stanley
 * 04.01.18.
 */
public class Main {

    static final int MAX_INDEX = 10;
    static final String HW = "Hello World";
    public static void main(String[] args) {
        /*Как известно, оператором new, объекты создаются в куче. Но начиная с java 6, это не совсем так.
        * Например объект link может создасться в куче, а может и в стеке.
        * В java 6 сделали оптимизацию. И если  я создаю этот объект link, использую его и затем забываю про него, нигде не используя и не передавая в другие места программы. То он создается в стеке.
        * Однако, если его необходимо передать, то объект создается как обычно - в куче. И передать ссылку на этот объект.
        *
        */
        int i = 5;
        Link link1 = new Link("javawebinar", "mystudy.ru");
        Link link2 = link1;
        Link link3 = new Link(link2);
        System.out.println(link1.hashCode());
        System.out.println(link3.hashCode());
        System.out.println(link1.equals(link2));
        System.out.println(link1.equals(link3));
        System.out.println(link3.getClass());


        Integer object = 15; // Не обязательно делать явное создание объекта (Boxing/Unboxing). Начиная с JAVA 5 это происходит имплицитно

        System.out.println(Link.getEMPTY()); // Обращаюсь к статическому полю
        char ch = 'Q'; // размер чара = 2 байта. 2 в 16-й степени - где-то 16 тысяч символов в этот размер. Unicode
        // а сейчас как стандарт идет UTF-8
        printInt(object);
        FreshJuiceTest.testEnum();
    }

    static void printInt(Integer integer) {
        System.out.println("Object: " + integer);
    }

    static void printInt(int i) {// Здесь, если передается объектный тип, то сперва происходит unboxing, и уже потом идет распечатка
        System.out.println("Primitive: " + i);
    }


    /**
     * Тестовый класс для перечисления
     */
    private static class FreshJuiceTest {

        /**
         * Размеры сока, перечисление
         */
        enum FreshJuiceSize {
            SMALL("Маленький"),
            MEDIUM("Средний"),
            LARGE("Большой");
            private String juiceSize;

            FreshJuiceSize(String jSize) {
                juiceSize = jSize;
            }

            public String getJuiceSize() {
                return juiceSize;
            }

            @Override
            public String toString() {
                return getJuiceSize();
            }
        }

        /**
         * Вывод значений перечисления
         */
        public static void testEnum() {

            int i = 0;
            while (i < FreshJuiceSize.values().length) {
                System.out.println(" Juice size: " + FreshJuiceSize.values()[i]);
                i++;
            }
        }
    }



}


/*// Task 1
        int a = 14,b = 5;
        if(a>b)
            System.out.printf("A %d more then B %d\n" , a,b);
        else
            System.out.printf("B %d more then A %d\n" ,b,a);

        // Task 2

        System.out.println("\nOdd numbers");
        int i = 0;
        while(i <= MAX_INDEX){
            if((i%2)!= 0)
                System.out.println(i);
            i--;
            if(i < 0)
                System.out.println("The variable \" i \" is negative");
                break;
        }

        // Task 3

        System.out.println("\nEven numbers");
        for (int j = 0; j < MAX_INDEX; j++) {
            if((j%2) == 0)
                System.out.println(j);
        }

        // Task 4
        System.out.println(HW);*/


        /*String str = String.format(Locale.CHINA," %.02f%n",10.3); // "d" - вывод десятичного числа.
        System.out.print(str);
        System.out.printf(Locale.FRANCE," %.1f%n",10.3); // "d" - вывод десятичного числа.
        System.out.printf(Locale.getDefault()," %,10d%n",1000000); // "d" - вывод десятичного числа.*/

        /*System.out.printf("%-5s%-11s%-25s%-11s%n","Код","За единиц","Валюты","Рублей РФ");
                System.out.println("-----------------------------------------------------");
                System.out.printf("%-5s%-11d%-25s%-11.4f%n","AUD",1,"Австралийский доллар",44.9883);
                System.out.printf("%-5s%-11d%-25s%-11.4f%n","GBP",1,"Фунт стерлингов",86.8429);
                System.out.printf("%-5s%-11d%-25s%-11.4f%n","BYR",10000,"Белорусский рубль",39.7716);
                System.out.printf("%-5s%-11d%-25s%-11.4f%n","DKK",10,"Датская крона",84.9192);
                System.out.printf("%-5s%-11d%-25s%-11.4f%n","USD",1,"Доллар США",58.4643);
                System.out.printf("%-5s%-11d%-25s%-11.4f%n","EUR",1,"Евро",63.3695);
                System.out.printf("%-5s%-11d%-25s%-11.4f%n","KZT",100,"Казахский тенге",31.4654);
*/

