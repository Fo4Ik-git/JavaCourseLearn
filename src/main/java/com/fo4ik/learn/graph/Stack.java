package com.fo4ik.learn.graph;

public class Stack {
    private int maxSize = 10;
    private int top;
    private int[] stackArray;

    public Stack() {
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        stackArray[++top] = value;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
