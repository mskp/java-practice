package com.sush.test;

import java.util.Scanner;

public class Alphabets {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a string: ");
        String string = input.next();

        System.out.print(count(string));
    }

    public static boolean isItVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static String count(String str) {
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isItVowel(str.charAt(i)))
                vowelCount++;
            else
                consonantCount++;
        }
        return String.format("Vowel count: %d\nConsonant count: %d", vowelCount, consonantCount);
    }
}