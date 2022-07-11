package com.sus.student_record_jdbc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("""
                    WELCOME TO STUDENT INFORMATION SYSTEM
                    1. Insert
                    2. Delete
                    3. Display Records
                    4. Exit
                    Enter your choice:-\s""");
            int choice = in.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the roll no: ");
                    int rollNo = in.nextInt();
                    System.out.print("Enter the name: ");
                    String name = in.next();
                    System.out.print("Enter email: ");
                    String email = in.next();
                    if (Student.insert(rollNo, name, email))
                        System.out.println("Inserted");
                    else
                        System.out.println("Failed to insert");
                }

                case 2 -> {
                    System.out.print("Enter roll no: ");
                    int rollNo = in.nextInt();
                    if (Student.delete(rollNo))
                        System.out.println("Deleted");
                    else
                        System.out.println("Failed to delete");
                }

                case 3 -> {
                    Student.display();
                }

                case 4 -> {
                    System.exit(0);
                }
            }
        }
    }
}
