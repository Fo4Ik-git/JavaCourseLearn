package com.fo4ik.learn.stack;

public interface Stack<T> {
    /**
     *In Java, "Stack" usually refers to the data structure provided by the Java Standard Library that follows the Last-In-First-Out (LIFO) principle. It is part of the java.util package and is represented by the  {@link java.util.Stack}
     *
     * @param value - the element to add
     */

    void push(T value); // add element to the end of the stack
    T pop(); // remove element from the end of the stack
    T peek(); // get element from the end of the stack
    boolean isEmpty();

}
