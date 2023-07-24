package com.anmorozov.leetcode.problems.solutions.p1631;

/**
 * My Approach 1: SPFA Algorithm
 */
public class MyApproach1 implements Solution {

    @Override
    public int minimumEffortPath(int[][] heights) {

        int[][] differenceMatrix = getDifferenceMatrix(heights);
        int rows = differenceMatrix.length;
        int columns = differenceMatrix[0].length;

        for (int trip = 0; trip < rows * columns; trip++) {
            boolean noChanges = true;
            for (int i = 0; i < differenceMatrix.length; i++) {
                for (int j = 0; j < differenceMatrix[i].length; j++) {
                    if (differenceMatrix[i][j] < Integer.MAX_VALUE) {
                        for (int[] direction : DIRECTIONS) {
                            int adjacentX = i + direction[0];
                            int adjacentY = j + direction[1];
                            if (isValidCell(adjacentX, adjacentY, rows, columns)) {
                                int currentDifference = Math.max(
                                        Math.abs(heights[i][j] - heights[adjacentX][adjacentY]),
                                        differenceMatrix[i][j]);
                                if (currentDifference < differenceMatrix[adjacentX][adjacentY]) {
                                    differenceMatrix[adjacentX][adjacentY] = currentDifference;
                                    noChanges = false;
                                }
                            }
                        }
                    }
                }
            }
            if (noChanges) {
                break;
            }
        }
        return differenceMatrix[rows - 1][columns - 1];
    }
}
