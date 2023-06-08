package com.anmorozov.leetcode.problems.solutions;

public class P1318 {

    public int minFlips(int a, int b, int c) {

        int[] arrayA = getArray(a);
        int[] arrayB = getArray(b);
        int[] arrayC = getArray(c);

        int count = 0;
        for (int i = 0; i < 31; i++) {
            if (arrayA[i] == 0 && arrayB[i] == 0 && arrayC[i] == 1) {
                count++;
            } else if (arrayA[i] == 1 && arrayB[i] == 0 && arrayC[i] == 0) {
                count++;
            } else if (arrayA[i] == 0 && arrayB[i] == 1 && arrayC[i] == 0) {
                count++;
            } else if (arrayA[i] == 1 && arrayB[i] == 1 && arrayC[i] == 0) {
                count++;
                count++;
            }
        }
        return count;
    }

    private int[] getArray(int current) {
        int[] array = new int[31];
        for (int i = 30; i >= 0; i--) {
            int remainder = current % 2;
            current = current / 2;
            array[i] = remainder;
        }
        return array;
    }
}
