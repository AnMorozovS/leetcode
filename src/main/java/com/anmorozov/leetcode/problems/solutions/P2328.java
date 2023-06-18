package com.anmorozov.leetcode.problems.solutions;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class P2328 {

    private int[][] grid;
    private int rowsNumber;
    private int columnsNumber;
    private Map<Integer, BigInteger> cash;

    public int countPaths(int[][] grid) {
        this.grid = grid;
        rowsNumber = this.grid.length;
        columnsNumber = this.grid[0].length;
        cash = new HashMap<>();

        BigInteger count = BigInteger.ZERO;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                count = count.add(useCash(i, j));
            }
        }
        return count.mod(BigInteger.valueOf((long) 1e9 + 7)).intValue();
    }

    private BigInteger countPath(int row, int column) {
        BigInteger count = BigInteger.ONE;
        if (row > 0) {
            if (grid[row - 1][column] > grid[row][column]) {
                count = count.add(useCash(row - 1, column));
            }
        }
        if (row < rowsNumber - 1) {
            if (grid[row + 1][column] > grid[row][column]) {
                count = count.add(useCash(row + 1, column));
            }
        }
        if (column > 0) {
            if (grid[row][column - 1] > grid[row][column]) {
                count = count.add(useCash(row, column - 1));
            }
        }
        if (column < columnsNumber - 1) {
            if (grid[row][column + 1] > grid[row][column]) {
                count = count.add(useCash(row, column + 1));
            }
        }
        return count;

    }

    private BigInteger useCash(int i, int j) {
        int key = (i * columnsNumber) + j;
        BigInteger currenCounter;
        if (cash.containsKey(key)) {
            currenCounter = cash.get(key);
        } else {
            currenCounter = countPath(i, j);
            cash.put(key, currenCounter);
        }
        return currenCounter;
    }
}
