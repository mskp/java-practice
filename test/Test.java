package com.sush.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringJoiner;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
/*        StringJoiner str = new StringJoiner(", ");

        int first = 2000;

        for(int second = 0; second < 9; second += 2){
            for(int third = 0; third < 9; third += 2){
                for(int fourth = 0; fourth < 9; fourth += 2){
                    str.add(String.valueOf(first + second*100 + third*10 + fourth));
                }
            }
        }*/
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            list.add(i);

        list.forEach(System.out::println);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++)
            linkedList.add(i);

        linkedList.forEach(i -> System.out.println(i));

    }
}
