package com.fo4ik.generics;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        //Generics is a way to create a class or method that can work with different types of data.
        Generics generics = new Generics();
        //There we can see that we can use different types of data in method
        //We can set type of data in method call, but we don't have to
        System.out.println(generics.<Integer,Integer>method(1,2));
        System.out.println(generics.method("Hello ))", new Object()));

        System.out.println("--------------------");

        //We can use generics in classes
        GenericsClass genericsClass = new GenericsClass<>("Generic in class");
        System.out.println(genericsClass.getT());
        genericsClass.setT(123);
        System.out.println(genericsClass.getT());


        System.out.println("--------------------");
        //We can use extends to set type of data that we can use in method
        Car car = new Car();
        generics.methodCar(car);

        System.out.println("--------------------");


        List<File> list = new ArrayList<>();
        List list1 = new ArrayList();

        list.add(new File(""));
        list1.add(new Generics());
        list1.add("");
        list1.add(new File(""));

        //This is not working because we don`t know what type of data we will use
        /*for (Object o : list1) {
          File f = (File) o;
        }*/

        //But if we use type List we can do some operations
        for(File f : list){
            System.out.println(f.getName());
        }

    }



    //Syntax of generics
    //first of all we need to set type of data in angle brackets for example: <T>
    //after return type for example: T
    <T, U> T method(T t, U u){
        //We can use generics in methods
        //T is a type parameter. It is a placeholder for a type. We can use any letter instead of T.
        //Unfortunately we don`t know what type of data we will use in method, so we can`t use it in method

        return t;
    }

    <T extends Generics & Comparable & Serializable> T methodCar(T t){
        // We can use extends to set type of data that we can use in method

        t.someMethod();
        return t;
    }

    void someMethod(){
        System.out.println("Some method");
    }

}

//Also we can use generics in classes
class GenericsClass<T>{

    //We can use generics in fields
    T t;

    //We can use generics in constructors
    public GenericsClass(T t) {
        this.t = t;
    }

    //We can use generics in methods
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class Car extends Generics implements Comparable, Serializable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
