package com.sush.test;

import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a string: ");
        String string = input.nextLine();

        System.out.print(length(string));
    }

    public static int length(String string) {
        char[] str = string.toCharArray();
        int len = 0;

        for (char c : str)
            len++;

        return len;
    }
}
