package com.anmorozov.leetcode.problems.solutions;

public class P200 {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    floodIsland(grid, i, j);
                }
            }
        }
        return count;
    }

    private void floodIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        floodIsland(grid, i + 1, j);
        floodIsland(grid, i - 1, j);
        floodIsland(grid, i, j + 1);
        floodIsland(grid, i, j - 1);
    }
}
