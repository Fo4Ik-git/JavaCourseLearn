package com.fo4ik.algorythm.sort;

public class MergeSort {

    /**
     *                 2 9 5 4 8 1 6 7
     * SPLIT           /             \           ---
     *              2 9 5 4       8 1 6 7          │
     * SPLIT        /     \       /     \          │
     *            2 9    5 4    8 1     6 7        │  divide
     * SPLIT      / \    / \    / \     / \        │
     *           2   9  5  4  8   1   6   7      --│
     * MERGE     \  /   \ /    \  /    \  /        │
     *           29     45      18      67         │  conquer
     * MERGE     \      /        \      /          │
     *             2459            1678            │
     * MERGE           \           /             ---
     *               1 2 4 5 6 7 8 9
     */

    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1, 6, 7, -1, 0, 3};
        mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    private static void mergeSort(int[] arr) {
        int length = arr.length; // get length of array

        // if array have only one element, then return
        if (length == 1) return;

        int mid = length / 2; // get middle of array
        int leftArr[] = new int[mid]; // create left array
        int rightArr[] = new int[length - mid]; // create left array


        //Write left part of array to leftArr
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        //Write right part of array to rightArr
        for (int i = mid; i < length; i++) {
            rightArr[i - mid] = arr[i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftArrLength = leftArr.length;
        int rightArrLength = rightArr.length;
        int leftArrIndex = 0, rightArrIndex = 0, arrIndex = 0;

        // while leftArr and rightArr have elements
        while (leftArrIndex < leftArrLength && rightArrIndex < rightArrLength) {
            // if leftArr element less than rightArr element
            if (leftArr[leftArrIndex] < rightArr[rightArrIndex]) {
                arr[arrIndex] = leftArr[leftArrIndex];
                leftArrIndex++;
            } else {
                // if rightArr element less than leftArr element
                arr[arrIndex] = rightArr[rightArrIndex];
                rightArrIndex++;
            }
            arrIndex++;
        }

        // Copy the remaining elements from leftArr and rightArr, if any
        while (leftArrIndex < leftArrLength) {
            arr[arrIndex] = leftArr[leftArrIndex];
            leftArrIndex++;
            arrIndex++;
        }

        while (rightArrIndex < rightArrLength) {
            arr[arrIndex] = rightArr[rightArrIndex];
            rightArrIndex++;
            arrIndex++;
        }


    }
}
