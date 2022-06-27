package com.sush.test;

public class MultiplicationTable {

    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            System.out.println();
        }

        printTable(2);
    }

    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }

    public static void printTableRev(int num) {
        for (int i = 10; i >= 1; i--)
            System.out.printf("%d x %d = %d\n", num, i, num * i);
    }
}
