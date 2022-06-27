package com.sush.test;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a string: ");
        String string = input.next();

        System.out.print(reverseString(string));
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        int len = str.length();

        for (int i = len - 1; i >= 0; i--)
            reversed.append(str.charAt(i));

        return reversed.toString();
    }
}