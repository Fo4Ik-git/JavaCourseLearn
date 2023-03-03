package com.fo4ik.methods;

public class Methods {

    //Method with no return type and no parameters
    public static void printHello() {
        System.out.println("Hello");
    }
    public static void printHello(String name) {
        System.out.println("Hello " + name);
    }

    public void printHello2() {
        System.out.println("Hello");
    }

    

    public static void main(String[] args) {
        printHello();
        printHello("John");
        //printHello2();

        Methods methods = new Methods();
        methods.printHello2();
    }




}
