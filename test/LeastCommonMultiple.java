package com.sush.test;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        int firstNumber = 12;
        int secondNumber = 17;

        System.out.println(leastCommonMultiple(firstNumber, secondNumber));
    }

    public static int leastCommonMultiple(int num1, int num2) {
        int i;
        for (i = Math.max(num1, num2); i <= num1 * num2; i += Math.max(num1, num2))
            if (i % num1 == 0 && i % num2 == 0)
                break;

        return i;
    }
}
