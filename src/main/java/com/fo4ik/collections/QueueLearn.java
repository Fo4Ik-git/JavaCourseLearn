package com.fo4ik.collections;

import java.util.Iterator;
import java.util.Queue;

public class QueueLearn {
    public static void main(String[] args) {
        Queue queue = new java.util.PriorityQueue<>();
        /**
         * @see Queue#offer(Object)
         */
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");

        //Show all elements in queue
        Iterator iterator = queue.iterator();
        //Infinity loop
       /* while (iterator.hasNext()) {
            //peek() retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
            *//**
         * @see Queue#peek()
         *//*
            System.out.println(queue.peek());
        }*/
        System.out.println("_____________________________");
        System.out.println("Number of elements in queue: " + queue.size());

        while (iterator.hasNext()) {
            //poll() retrieves and removes the head of this queue, or returns null if this queue is empty.
            /**
             * @see Queue#poll()
             */
            System.out.println(queue.poll());
        }
        System.out.println("_____________________________");
        System.out.println("Number of elements in queue: " + queue.size());
    }
}
