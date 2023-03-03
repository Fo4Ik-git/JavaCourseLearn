package com.fo4ik.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapLearn {
    public static void main(String[] args) {
        /**
         * See all methods in {@link Map} interface
         * @see Map is an object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
         */
        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 2");
        Book book3 = new Book("Book 3", "Author 3");

        Map map = new HashMap<>();
        map.put("1", book1);
        map.put("2", book2);
        map.put("3", book3);

        //We can use get to get value by key
        System.out.println("Map get 1: " + map.get("1"));

        //
        Set set = map.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }


    }
}

class Book {

    String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "\nBook: " +
                "name: " + name  +
                ", author: " + author;
    }
}
