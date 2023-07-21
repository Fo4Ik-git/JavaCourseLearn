package com.fo4ik.learn.innerClass;

public class Main {

    /**
     *  Inner class is a class that is created inside another class.
     *
     *  We cant create object of inner class without object of outer class
     *  Inner inner = new Inner();
     */

    private int i = 5;

    public static void main(String[] args) {
        //Inner inner = new Inner();

        //We can create object of inner class only with object of outer class,
        //because inner class is not static

        Main main = new Main();
        Inner inner = main.new Inner();
        //or
        Inner inner1 = new Main().new Inner();
        inner.print(main.i);

    }

    //We can create method with inner class
    void initInner(){
        Inner inner = new Inner();
        inner.print(i);
    }




    class Inner{
        private int k = 6;
        void print(int field){
            System.out.println(field);
            //Inner class can access all fields of outer class
        }

    }
}
