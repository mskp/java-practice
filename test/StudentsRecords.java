package com.sush.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentsRecords {
    public static void main(String[] args) {

//        try{
//            createFile("myNewFile.txt");
//        } catch (IOException e){
//            System.out.println(e);
//        }

//        try {
//            insertRecords("Sushant Kumar Pandey", 420, 79, "myRecords.txt");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            readFile("myRecords.txt");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        deleteFile("myNewFile.txt");
    }

    public static void createFile(String fileName) throws IOException {
        File f = new File(fileName);
        try {
            if (f.createNewFile())
                System.out.println("File created successfully.");
            else
                System.out.println("File couldn't be created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertRecords(String name, int rollNo, float percent, String fileName) throws RuntimeException {
        String str = "Name: " + name + "\nRoll No: " + rollNo + "\nPercent: " + percent + "\n\n";
        try {
            FileWriter f = new FileWriter(fileName, true);
//            PrintWriter p = new PrintWriter(f);
            f.write(str);
//            p.print(str);
            System.out.println("Records inserted successfully in " + fileName);
            f.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile(String fileName) throws IOException {
        FileReader f = new FileReader(fileName);
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                f.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteFile(String fileName) {
        File f = new File(fileName);
        if (f.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Operation failed.");
        }
    }
}