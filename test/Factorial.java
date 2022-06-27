package com.sush.test;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();

        System.out.print(factorial(num));
    }

    public static BigInteger factorial(int num) {
        return (num == 0 || num == 1) ? BigInteger.ONE :
                factorial(num - 1).multiply(BigInteger.valueOf(num));
    }
}
