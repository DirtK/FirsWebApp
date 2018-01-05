package ru.moneybranch.webapp.model;


/**
 * stanley
 * 04.01.18.
 */
public class Link {
    private final String name;
    private final String url;


    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }


    /*
            * clone метод клонирует объект. Блох "эффективное программирование на java" не рекомендует пользоваться этим методом.
            * А лучше создавать конструкторо копирования
            *
            * */
    public Link(Link link) { // Конструктор копирования принимает объект такого же класса
        this.name = link.name;
        this.url = link.url;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Link link = (Link) o;

        if (name != null ? !name.equals(link.name) : link.name != null) return false;
        return url.equals(link.url);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + url.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Link name: " + name +
                "\nLink url: " + url;
    }
}

