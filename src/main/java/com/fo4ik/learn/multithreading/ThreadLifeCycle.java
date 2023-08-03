package com.fo4ik.learn.multithreading;

public class ThreadLifeCycle {
    /**
     * Better to read this article: https://www.javatpoint.com/life-cycle-of-a-thread
     */

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("MyThread name: " + Thread.currentThread().getName());
            }
        });
        myThread.start();
        myThread.setPriority(10); //Set priority to thread (1 - 10)

        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        //But if we want run myThread earlier than main thread we can use Thread.sleep() method

        Thread.yield(); //This method will pause current thread and give a chance to other threads to execute
        System.out.println("Main thread");
    }
}
