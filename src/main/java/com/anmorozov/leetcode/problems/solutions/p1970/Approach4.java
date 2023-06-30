package com.anmorozov.leetcode.problems.solutions.p1970;

/**
 * Approach 4: Disjoint Set Union (on water cells)
 */
public class Approach4 implements Solution {

    @Override
    public int latestDayToCross(int row, int col, int[][] cells) {
        DisjointSetUnion disjointSetUnion = new DisjointSetUnion(row * col + 2);
        int[][] grid = new int[row][col];
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

        for (int i = 0; i < row * col; ++i) {
            int r = cells[i][0] - 1;
            int c = cells[i][1] - 1;
            grid[r][c] = 1;
            int index1 = r * col + c + 1;
            for (int[] d : directions) {
                int newR = r + d[0];
                int newC = c + d[1];
                int index2 = newR * col + newC + 1;
                if (newR >= 0 && newR < row && newC >= 0 && newC < col && grid[newR][newC] == 1) {
                    disjointSetUnion.union(index1, index2);
                }
            }
            if (c == 0) {
                disjointSetUnion.union(0, index1);
            }
            if (c == col - 1) {
                disjointSetUnion.union(row * col + 1, index1);
            }
            if (disjointSetUnion.find(0) == disjointSetUnion.find(row * col + 1)) {
                return i;
            }
        }
        return -1;
    }
}

