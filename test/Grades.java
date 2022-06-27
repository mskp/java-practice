package com.sush.test;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        float percent = input.nextFloat();

        System.out.print(getGrade(percent));
    }

    public static String getGrade(float percent){
        String grade;

        if (percent >= 90) grade = "Grade A+";
        else if (percent >= 80) grade = "Grade A";
        else if (percent >= 75) grade = "Grade B";
        else if (percent >= 60) grade = "Grade C";
        else if (percent >= 50) grade = "Grade D";
        else grade = "Failed";

        return grade;
    }
}
