package com.sush.test;

public class MaxInArray {

    public static void main(String[] args) {
        int[] arr = {34, 56, 78, 12, 76, 9};
        System.out.print(getMax(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i : arr)
            if (i > max) max = i;

        return max;
    }
}