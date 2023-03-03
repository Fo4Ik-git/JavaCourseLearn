package com.fo4ik.test;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 76, 1, 5, 23, 6};
        int search = 23;

        //Linear search stream
        System.out.println("Linear search stream: " +
                IntStream.range(0, arr.length)
                        .filter(i -> arr[i] == search)
                        .findFirst().orElse(-1));


    }
}
