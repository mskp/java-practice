package com.sush.test;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(4521143));
    }

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
