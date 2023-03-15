package com.fo4ik.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLearn {
    public static void main(String[] args) {
        /**
         * {@link Queue} is an ordered collection. The user of this interface has precise control over where in the list each element is inserted.
         * Queue we use when we need to add elements to the end of the list and remove elements from the beginning of the list.
         *  Queue have 2 implementations: {@link LinkedList} and {@link PriorityQueue}.
         */


        //PriorityQueue is an unbounded queue based on a priority heap. The elements of the priority queue are ordered according to their natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.
        Queue priorityQueue = new PriorityQueue<>();

        //LinkedList is a doubly linked list implementation of the List and Deque interfaces. It can be found in the java.util package.
        Queue linkedList = new LinkedList<>();


        /**
         * @see Queue#offer(Object)
         */
        priorityQueue.offer("1");
        priorityQueue.offer("2");
        priorityQueue.offer("3");


        //Show all elements in queue
        Iterator iterator = priorityQueue.iterator();


        /**
         * @see Queue#peek()
         *
         */
        /*Infinity loop
        while (iterator.hasNext()) {
            //peek() retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
            System.out.println(priorityQueue.peek());
        }*/


        System.out.println("_____________________________");
        System.out.println("Number of elements in queue: " + priorityQueue.size());

        while (iterator.hasNext()) {
            //poll() retrieves and removes the head of this queue, or returns null if this queue is empty.
            /**
             * @see Queue#poll()
             */
            System.out.println(priorityQueue.poll());
        }
        System.out.println("_____________________________");
        System.out.println("Number of elements in queue: " + priorityQueue.size());
    }
}
