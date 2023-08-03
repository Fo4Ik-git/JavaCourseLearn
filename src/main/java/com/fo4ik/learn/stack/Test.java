package com.fo4ik.learn.stack;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test stack");
        testStack();
        System.out.println("\nTest queue");
        testQueue();
    }

    private static void testQueue(){
        SimpleQueue<Integer> queue = new SimpleQueue<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Adding " + i);
            queue.add(i);
        }

        System.out.println("--------------------");

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }

    private static void testStack(){
        SimpleStack<Integer> stack = new SimpleStack<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Adding " + i);
            stack.push(i);
        }

        System.out.println("--------------------");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
