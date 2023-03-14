package com.fo4ik.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Sort {
    public static void main(String[] args) {
        Set set = new TreeSet<>();

        set.add("3");
        set.add("5");
        set.add("4");
        set.add("1");

        printSet(set);

        set = new TreeSet<>();
       /* set.add(new Person1(1));
        set.add(new Person1(4));
        set.add(new Person1(2));*/

        /**
         * Compile error because Set don`t know how to sort Person1, because we don`t implement {@link Comparable}. Fix that in Person2 class
         */
        printSet(set);
        set = new TreeSet<>();

        set.add(new Person2(1));
        set.add(new Person2(3));
        set.add(new Person2(7));
        set.add(new Person2(5));
        set.add(new Person2(2));
        printSet(set);

        /**
         * Ok but what if we can`t implement Comparable? We can use {@link Comparator} in class ComparePerson1
         */
        set = new TreeSet<>(new ComparePerson1());

        set.add(new Person1(1));
        set.add(new Person1(4));
        set.add(new Person1(9));
        set.add(new Person1(12));
        set.add(new Person1(6));
        printSet(set);

    }

    private static void printSet(Set set) {
        System.out.println("_____________________________");
        for (Object o : set) {
            if (o instanceof Person2) {
                System.out.println(o.toString());
            }  else System.out.println(o);
        }
    }
}

class Person1 {
    private int age;

    public Person1(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "age=" + age +
                '}';
    }
}

class Person2 implements Comparable<Person2> {
    private int age;

    public Person2(int age) {
        this.age = age;
    }

    /*
    We need to implement this method to sort Person2
    This method is called when we add new element to TreeSet
    In this method we return int value, if this value is 0, then we say that this element is equal to another element
    */
    @Override
    public int compareTo(Person2 p) {
        // Simple example, we compare age of this object and age of another object
        /*if(p.age > this.age) return -1;
        else if(p.age < this.age) return 1;
        else return 0;*/

        //Another example, we compare age of this object and age of another object
        //This code is equal to code above
        return p.age - this.age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "age=" + age +
                '}';
    }
}

class ComparePerson1 implements Comparator<Person1> {
    @Override
    public int compare(Person1 o1, Person1 o2) {
        return o2.getAge() - o1.getAge();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}