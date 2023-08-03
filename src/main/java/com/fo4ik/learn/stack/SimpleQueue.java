package com.fo4ik.learn.stack;

import com.fo4ik.learn.generics.Generics;

import java.util.ArrayList;

public class SimpleQueue<T> implements Queue<T>{
    /**
     * That is a simple implementation of Queue using ArrayList from {@link java.util}
     *
     * <p>For better understanding generics {@link Generics}
     *
     */
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T value) {
        list.add(value);
    }

    @Override
    public T remove() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
