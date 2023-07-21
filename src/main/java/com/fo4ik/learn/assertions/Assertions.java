package com.fo4ik.learn.assertions;

public class Assertions {
    public static void main(String[] args) {
        new Assertions().someMethod(-5);
    }

    private void someMethod(int a){
        /*Assertion using only for debug program
        But for apply this setting need to add to Run Config file to Vm options parameter -ea
        This only for debug **/

        assert (a > 0);
        System.out.println(a);
        //do something with a
    }
}
