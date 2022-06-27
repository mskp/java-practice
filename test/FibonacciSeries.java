package com.sush.test;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no. of terms to print: ");
        int num = input.nextInt();
//        printFibonacciSeries(num);

        for (int i = 0; i < num; i++) {
            System.out.print(printFibonacciSeries(i) + " ");
        }
    }

//    public static void printFibonacciSeries(int num) {
//        int a = 0, b = 1, c;
//
//        for (int i = 0; i < num; i++) {
//            System.out.print(a + " ");
//            c = a + b;
//            a = b;
//            b = c;
//        }
//    }

/*    static int a = 0, b = 1, c;
    public static void fibonacciRecursive(int n){
        if(n > 0){
            fibonacciRecursive(n - 1);
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }*/

    public static int printFibonacciSeries(int num) {
        return (num <= 1) ? num :
                printFibonacciSeries(num - 1) + printFibonacciSeries(num - 2);
    }
}
