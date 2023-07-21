package com.fo4ik.learn.multithreading;

public class CreateThread {

    public static void main(String[] args) {
        //Thread is a process of execution of code

        //First way to create thread is to extend Thread class (MyThread class)
        MyThread myThread = new MyThread();
        //Start thread
        myThread.start();
        //new MyThread().start();

        //Show thread name
        System.out.println("Main thread name: " + Thread.currentThread().getName());

        //Second way to create thread is to implement Runnable interface (MyThread2 class)
        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();

        Thread myThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                //Code that will be executed in thread
                System.out.println("This is new thread implements Runnable");
                System.out.println("MyThread name: " + Thread.currentThread().getName());
            }
        });
        myThread3.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        //Code that will be executed in thread
        System.out.println("This is new thread extends Thread");
        System.out.println("MyThread name: " + Thread.currentThread().getName());
//        myMethod();
    }
    private void myMethod(){
        throw new RuntimeException();
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        //Code that will be executed in thread
        System.out.println("This is new thread implements Runnable");
        System.out.println("MyThread name: " + Thread.currentThread().getName());
    }
}
