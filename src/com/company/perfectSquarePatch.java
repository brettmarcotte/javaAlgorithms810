package com.company;

public class perfectSquarePatch {
    public static int[][] squarePatch(int n) {
        int[][] finalArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                finalArray[i][j] = n;
            }
        }
        return finalArray;
    }
}

