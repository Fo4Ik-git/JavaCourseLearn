package com.fo4ik.learn.collections.lists;

import java.util.*;
import com.fo4ik.learn.collections.QueueLearn;

public class ListLearn {

    public static void main(String[] args) {

        /**
         * {@link List} is an ordered {@link Collections} (sometimes called a sequence). Lists may contain duplicate elements.
         * List is an interface, so we can't create object of it, but we can create object of classes that implements it.
         * List have methods to
         * {@link List#add(Object)}, {@link List#remove(Object)},{@link List#get(int)},
         * {@link List#set(int, Object)}, {@link List#sort(Comparator)} (Object)} etc.
         *
         * List have 3 implementations: {@link ArrayList}, {@link Vector}, {@link LinkedList}.
         */

        //ArrayList is a resizable array, which can be found in the java.util package.
        List arrayList = new ArrayList<>();

        System.out.println("ArrayList size: " + arrayList.size() + "\n");

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        printList(arrayList);

        //Vector is similar to ArrayList, but is synchronized. It can be found in the java.util package.
        //Synchronized means that only one thread can access a Vector object at a time, that used only for thread safe.
        List vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        printList(vector);

        /**
         * LinkedList is a doubly linked list implementation of the List and Deque interfaces. It can be found in the java.util package.
         LinkedList implements Queue interface, so we can use it as a queue. See more details in {@link QueueLearn} class.
         LinkedList the best choice if we need to add or remove elements from the beginning or the end of the list.
         **/
        List linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        printList(linkedList);

    }

    private static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
