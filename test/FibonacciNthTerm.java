package com.sush.test;

public class FibonacciNthTerm {
    public static void main(String[] args) {
        System.out.println(fibNth(8));
    }

    public static int fibNth(int num) {
        return (num == 1 || num == 2) ? num - 1 :
                fibNth(num - 1) + fibNth(num - 2);
    }

/*    public static int fibNth(int num) {
        int a = 0, b = 1;
        for (int i = 1; i < num; i++) {
            b = a + b;
            a = b - a;
        }
        return a;
    }*/
}
