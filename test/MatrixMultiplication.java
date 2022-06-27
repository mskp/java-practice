package com.sush.test;

import java.util.Arrays;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] firstArray = {{12, 22, 3}, {19, 15, 12}, {13, 3, 12}};

        int[][] secondArray = {{2, 5, 3}, {8, 9, 1}, {11, 19, 5}};

        int[][] resultant = multiplyMatrices3_3(firstArray, secondArray);

        System.out.println(Arrays.deepToString(resultant));
    }

    public static int[][] multiplyMatrices3_3(int[][] first, int[][] second) {
        int[][] result = new int[3][3];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                int sum = 0;
                for (int k = 0; k < first[i].length; k++) {
                    sum += first[i][k] * second[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }
}
