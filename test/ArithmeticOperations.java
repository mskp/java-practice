package com.sush.test;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("""
                    1. Addition
                    2. Subtraction
                    3. Multiplication
                    4. Division
                    5. Modulus
                    6. Exponentiation
                    7. Exit
                    Enter your choice:\s""");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter first number:- ");
                    int firstNum = input.nextInt();
                    System.out.print("Enter second number:- ");
                    int secondNum = input.nextInt();
                    System.out.printf("\n%d + %d = %d\n\n", firstNum, secondNum, calculate(firstNum, secondNum));
                }
                case 2 -> {
                    System.out.print("Enter first number:- ");
                    short firstNum = input.nextShort();
                    System.out.print("Enter second number:- ");
                    short secondNum = input.nextShort();
                    System.out.printf("\n%d - %d = %d\n\n", firstNum, secondNum, calculate(firstNum, secondNum));
                }
                case 3 -> {
                    System.out.print("Enter first number:- ");
                    int firstNum = input.nextInt();
                    System.out.print("Enter second number:- ");
                    short secondNum = input.nextShort();
                    System.out.printf("\n%d x %d = %d\n\n", firstNum, secondNum, calculate(firstNum, secondNum));
                }
                case 4 -> {
                    System.out.print("Enter first number:- ");
                    int firstNum = input.nextInt();
                    System.out.print("Enter second number:- ");
                    float secondNum = input.nextFloat();
                    System.out.printf("\n%d / %.2f = %.2f\n\n", firstNum, secondNum, calculate(firstNum, secondNum));
                }
                case 5 -> {
                    System.out.print("Enter first number:- ");
                    float firstNum = input.nextFloat();
                    System.out.print("Enter second number:- ");
                    int secondNum = input.nextInt();
                    System.out.printf("\n%.2f %% %d = %.2f\n\n", firstNum, secondNum, calculate(firstNum, secondNum));
                }
                case 6 -> {
                    System.out.print("Enter value for base:- ");
                    short base = input.nextShort();
                    System.out.print("Enter value for exponent:- ");
                    int exponent = input.nextInt();
                    System.out.printf("\n%d^%d = %d\n\n", base, exponent, calculate(base, exponent));
                }
                case 7 -> System.exit(0);

                default -> System.out.println("\nInvalid choice\n");
            }
        }
    }

    public static int calculate(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }  //Addition

    public static int calculate(short firstNum, short secondNum) {
        return firstNum - secondNum;
    }  //Subtraction

    public static int calculate(int firstNum, short secondNum) {
        return firstNum * secondNum;
    }  //Multiplication

    public static int calculate(short base, int exponent) {
        return (int) Math.pow(base, exponent);
    }  //Exponentiation

    public static float calculate(int firstNum, float secondNum) {
        return firstNum / secondNum;
    }  //Division

    public static float calculate(float firstNum, int secondNum) {
        return firstNum % secondNum;
    }  //Modulus

}