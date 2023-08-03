package com.fo4ik.learn.stack;

import java.util.ArrayList;

public class SimpleStack<T> implements Stack<T>{
    private ArrayList<T> list = new ArrayList<T>();
    @Override
    public void push(T value) {
        list.add(0, value);
    }

    @Override
    public T pop() {
        return list.remove(0);
    }

    @Override
    public T peek() {
        return list.get(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
