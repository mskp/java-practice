package com.sush.test;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = input.nextInt();

        String result = isItPrime(number) ? "prime" : "not prime";
        System.out.print(result);
    }

    public static boolean isItPrime(int num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;

        return true;
    }
}





