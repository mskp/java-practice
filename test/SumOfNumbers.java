package com.sush.test;

public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println(sum(23, 45, 67, 12));
    }

    public static int sum(int firstNum, int secondNum, int... rest) {
        int result = firstNum + secondNum;

        for (int i : rest) result += i;

        return result;
    }
}