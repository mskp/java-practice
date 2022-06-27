package com.sush.test;

import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();

        System.out.print(isItArmstrong(num));
    }

    public static boolean isItArmstrong(int number) {
        int num = number, result = 0;

        while (num > 0) {
            int remainder = num % 10;
            result += Math.pow(remainder, 3);
            num /= 10;
        }

        return result == number;
    }
}