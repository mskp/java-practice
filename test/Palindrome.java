package com.sush.test;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();
        System.out.println(isItPalindrome(num));

        System.out.print("Input a string: ");
        String str = input.next();
        System.out.print(isItPalindrome(str));
    }

    public static boolean isItPalindrome(int number) {
        int num = number, reversed = 0;

        while (num > 0) {
            reversed = (reversed * 10) + (num % 10);
            num /= 10;
        }

        return reversed == number;
    }

    public static boolean isItPalindrome(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--)
            reversed.append(str.charAt(i));

        return reversed.toString().equalsIgnoreCase(str);
    }
}