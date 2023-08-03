package com.fo4ik.learn.graph;

public class Queue {
    private int[] queueArray;
    private int maxSize = 10;
    private int head, tail, count;

    public Queue() {
        queueArray = new int[maxSize];
        head = 0;
        tail = -1;
        count = 0;
    }

    public void insert(int value) {
        if (tail == maxSize - 1) {
            tail = -1;
        }
        queueArray[++tail] = value;
        count++;
    }

    public int remove() {
        if (head == maxSize) {
            head = 0;
        }
        count--;
        return queueArray[head++];
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
