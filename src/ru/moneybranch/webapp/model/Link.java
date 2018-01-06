package ru.moneybranch.webapp.model;


/**
 * stanley
 * 04.01.18.
 */
public class Link {
    private static Link EMPTY = new Link();
    private final String name;
    private final String url;

    public String getName() {
        return name;
    }

    /**
     * Констуктор поумолчанию
      */
    public Link() {
        this("",null);// вызываю другой конструктор этого класса. Один конструктор модет вызывать другой
    }

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }


    /*
            * clone метод клонирует объект. Блох "эффективное программирование на java" не рекомендует пользоваться этим методом.
            * А лучше создавать конструктор копирования
            *
            * */
    public Link(Link link) { // Конструктор копирования принимает объект такого же класса
        this(link.name,link.url);
        /*this.name = link.name;
        this.url = link.url;*/

    }

    public static Link getEMPTY() {
        return EMPTY;
    }

    /**
        *Переопределяю equals &  hashCode для того чтобы объекты с одинаковыми полями были тождественны
         *
         * СОГЛАШЕНИЕ ДЛЯ hashCode - (если общекты равны между собой, то и их хешкоды равны).
         * НО ЕСЛИ хешкоды равны, то совсем не обязательно, что объекты равны.
         * Поэтому и необходимо дополнительно переопределять метод equals, с указанными свойствми объекта.
         * На основе которых и будет определяться равеноство объектов, и их равнозначный идентификатор
        */

    @Override
    public int hashCode() {// C помощью хешкода делаю уникальные идентификаторы объектов равнозначными. Основываясь на хешкодах "имени" и "урла".  ОТСЮДА И ПОЛУЧАЮ ИДЕНТИЧНЫЕ признаки объекта
        int result = name.hashCode();
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    // Однако, если необходимо сравнивание объектов, и получение положительного результата, при одинаковых свойствах. ТО НУЖНО И ПЕРЕОПРЕДЕЛИТЬ этот метод equals
    @Override
    public boolean equals(Object o) {




        if (this == o) return true;// Если объект равен этому объекту, то сразу тру
        if (o == null || getClass() != o.getClass()) return false;// Если объект нул, или класс объекта не совкадает с нашим классом, то фалс

        Link link = (Link) o;// Иначе, преобразую объект к типу линк

        if (!name.equals(link.name)) return false; // Если имя не равно имени объекта, то фалс
        return url != null ? url.equals(link.url) : link.url == null; // ....

    }

    /**
     * Метод finalize вызывать не нужно.
     * Он вызывается перед тем, как GC очистит память от мусора (неиспользуемых объектов).
     * Использовать этот метод никогда не надо, т.к. невозможно контролировать GC, и нет четкой гарантии, когда неиспользуемый класс (экземпляр), будет выведен из пямяти.
     * Для этого есть иные конструкции. Потому его и не используют
     * @return
     */
    /*@Override
    protected void finalize() throws Throwable {
        super.finalize();
    }*/

    /**
     * Методы  notify(), notifyAll() и перегруженный wait() - многопоточные методы.  Методы синхнонизации потоков     *

     * Object object = new Object();
     *
     *  object.notify();
     *  object.notifyAll();
     *  object.wait();
     * @return
     */


    /**
     * Позволяет указать, какие данные будут выводиться об объекте, по его ссылке
      * @return
     */
    @Override
    public String toString() {
        return "Link name: " + name +
                "\nLink url: " + url;
    }
}


