package com.fo4ik.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetLearn {
    public static void main(String[] args) {
        //
        /**
         *  See all methods in {@link Set} interface
         *  {@link Set} is a collection that cannot contain duplicate elements.
         */
        Set set = new HashSet<>();
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("2");
        set.add("2");
        set.add("3");
        set.add("3");
        set.add("3");

        for (Object o : set) {
            System.out.println(o);
        }

    }
}

class TreeSetLearn{

    public static void main(String[] args) {
        /**
         *  See all methods in {@link TreeSet} class
         *  {@link TreeSet} is a sorted set. The elements are ordered using their natural ordering, or by a Comparator provided at set creation time, depending on which constructor is used.
         */
        Set treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("1");
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("3");
        treeSet.add("3");

        for (Object o : treeSet) {
            System.out.println(o);
        }
    }

}
