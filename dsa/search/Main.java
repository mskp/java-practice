package com.sush.dsa.search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {45, 56, 78, 23, 56};
        System.out.println(Search.linearSearch(arr, 23));
        System.out.println(Search.binarySearch(arr, 56));
    }
}
