package main.subpackage;

import java.util.Arrays;

public class Main {
 
     public static void main(String[] args){
       //Arrays.asList(args).forEach(s -> System.out.println("Hello " + s));
       String[] strArr = {"dear"};
       //Arrays.asList(args).forEach(e -> System.out.println("Hello " + strArr[0] + " " + e));
         Arrays.asList(args).forEach(e -> System.out.format("Hello %s %s",strArr[0],e));
     }
}

// Вкладка Version Control позволяет узнать правки по проекту
