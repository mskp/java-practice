package com.sush.test;

import java.util.Arrays;

public class MatrixAddition {

    public static void main(String[] args) {
        int[][] firstArray = {{34, 56, 78}, {12, 89, 32}, {234, 6, 90}};

        int[][] secondArray = {{43, 67, 89}, {90, 12, 32}, {65, 88, 94}};

        int[][] resultant = addMatrices(firstArray, secondArray);

        System.out.println(Arrays.deepToString(resultant));
    }

    public static int[][] addMatrices(int[][] first, int[][] second) {
        int[][] result = new int[3][3];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }
}
