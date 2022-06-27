package com.sush.dsa.search;

import java.util.Scanner;

public class Search {
/*    public static void linearSearch(int[] a, int val) {
        boolean isFound = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == val) {
                System.out.printf("Found at position %d", i + 1);
                isFound = true;
            }
        }
        if (!isFound)
            System.out.println("Not found");
    }*/

/*    public static void binarySearch(int[] a, int val) {
        int beg = 0, end = a.length - 1;
        boolean isFound = false;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (a[mid] == val) {
                System.out.printf("Found at position %d\n", mid + 1);
                isFound = true;
                break;
            } else if (a[mid] > val)
                end = mid - 1;
            else
                beg = mid + 1;
        }
        if (!isFound)
            System.out.print("Not found");
    }*/

    public static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) return i;

        return -1;
    }

    public static int binarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (a[mid] < key)
                low = mid + 1;
            else if (a[mid] > key)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
