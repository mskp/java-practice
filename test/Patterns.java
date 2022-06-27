package com.sush.test;

public class Patterns {

    public static void main(String[] args) {
        pattern6(5);
    }

    public static void pattern1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 4) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            } else
                System.out.println("*");

        }
    }

    public static void patter5(int n){
        for (int i = 0; i < n; i++) {
//            System.out.print();
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            System.out.print("*");
            System.out.println();
        }

    }
        public static void pattern6(int n) {
            for (int i = 0; i < n; i++) {
//                System.out.print("/");
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                    if(j == 4)
                        System.out.println("/");
                }
                System.out.println("\\");
            }
        }



}
