package com.anmorozov.leetcode.problems.solutions;

public class P1232 {

    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int x2 = coordinates[1][0];
        int y1 = coordinates[0][1];
        int y2 = coordinates[1][1];
        long k = y1 - y2;
        long c = (long) x1 * y2 - (long) x2 * y1;
        long divide = x1 - x2;
        for (int i = 2; i < coordinates.length; i++) {
            int xi = coordinates[i][0];
            int yi = coordinates[i][1];
            long xResult = (xi * k) + c;
            long yResult = yi * divide;
            if (xResult != yResult) {
                return false;
            }
        }
        return true;
    }
}
