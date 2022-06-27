package com.sush.test;

public class MatrixTranspose {

    public static void main(String[] args) {
        int[][] arr = {{34, 56, 78},
                       {12, 90, 75},
                       {22, 34, 56}}; //3X3 Matrix

//                Transposing a 3x3 matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[j][i] + " ");

            System.out.println();
        }

        int[][] arr1 = {{23, 45, 69},
                        {12, 32, 67}}; //2X3 Matrix

//               Transposing a 2x3 matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(arr[j][i] + " ");

            System.out.println();
        }
    }
}
