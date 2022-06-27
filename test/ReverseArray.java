package com.sush.test;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{34, 56, 78, 44, 56, 23, 21})));
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int[] reverseArray(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size / 2; i++) {
            swap(arr, i, size - 1 - i);
        }
        return arr;
    }
}
