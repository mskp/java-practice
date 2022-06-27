package com.sush.dsa.sort;

public class Sort {

    public static void bubbleSort(int[] a){
        int size = a.length;

        for (int i = 0; i < size - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < size - i - 1; j++) {
                if (a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    isSorted = false;
                }
            }
            if(isSorted)
                return;
        }
    }

//    public static void insertionSort(int[] a){
//
//        for (int i = 1; i < a.length; i++) {
//            int current = a[i];
//            int j = i - 1;
//
//            while (j >= 0 && a[j] > current){
//                a[j + 1] = a[j];
//                j--;
//            }
//            a[j + 1] = current;
//        }
//    }

    public static void insertionSort(int[] a) {
        for (int i, k = 0; ++k < a.length; ) {
            int ai = a[i = k];

            if (ai < a[i - 1]) {
                while (--i >= 0 && ai < a[i]) {
                    a[i + 1] = a[i];
                }
                a[i + 1] = ai;
            }
        }
    }

    private static int partition(int[] a, int low, int high){
        int pivot = a[low];
        int i = low + 1;
        int j = high;

        do {
            while (a[i] <= pivot) i++;

            while (a[j] > pivot) j--;

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        } while (i < j);

        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        return j;
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(a, low, high);
            quickSort(a, low, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, high);
        }
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < a.length; j++)

                if (a[j] < a[minIndex])
                    minIndex = j;

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}




