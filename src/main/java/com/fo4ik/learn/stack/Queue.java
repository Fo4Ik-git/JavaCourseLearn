package com.fo4ik.learn.stack;

import com.fo4ik.learn.collections.QueueLearn;

public interface Queue<T> {

    /**
     *  If you want learn Queue in Java, {@link QueueLearn }
     */

    void add(T value); // add element to the end of the queue
    T remove(); // remove element from the front of the queue
    boolean isEmpty();
}
