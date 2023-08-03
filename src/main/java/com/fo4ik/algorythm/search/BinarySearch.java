package com.fo4ik.algorythm.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

public class BinarySearch {
     static int searchedNumber ;

    public static void main(String[] args) {
        int numbers = 100;
        int[] array = createArray(numbers);
        System.out.println(Arrays.toString(array));
        System.out.println("=====================================");
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        System.out.println(binarySearch(array, searchedNumber));
    }

    private static int binarySearch(int[] sortedArray, int searchedNumber) {
        int left = 0;
        int right = sortedArray.length - 1;
        int middle = right / 2;

        int operations = 0;
        System.out.println("Searched number: " + searchedNumber);

        while (sortedArray[middle] != searchedNumber) {
            if (sortedArray[middle] < searchedNumber) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            if(sortedArray[middle] == searchedNumber) {
                System.out.println("Found number: " + searchedNumber);
                System.out.println("Index: " + middle);
                System.out.println("Operations: " + operations);
                return middle;
            }

            middle = (left + right) / 2;
            operations++;
        }
        System.out.println("Index: " + middle);
        System.out.print("Operations: " );
        return operations;
    }

    private static int[] createArray(int countOfNumbersInArray) {
        if (countOfNumbersInArray <= 0) {
            throw new IllegalArgumentException("Count must be greater than zero.");
        }

        int range = countOfNumbersInArray * 2;
        if (range > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Range exceeds maximum supported value.");
        }

        if (countOfNumbersInArray > range) {
            throw new IllegalArgumentException("Count cannot be greater than the range.");
        }

        Set<Integer> uniqueNumbers = Collections.newSetFromMap(new ConcurrentHashMap<>());

        ThreadLocalRandom.current()
                .ints(0, range)
                .distinct()
                .limit(countOfNumbersInArray)
                .parallel()
                .forEach(uniqueNumbers::add);

        int[] array = uniqueNumbers.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        Random random = new Random();
        searchedNumber = array[random.nextInt(array.length)];

        return array;

    }

}
