package com.anmorozov.leetcode.problems.solutions.p0994;

/**
 * Approach 2: In-place BFS
 */
public class Approach2 implements Solution {

    // run the rotting process, by marking the rotten oranges with the timestamp
    public boolean runRottingProcess(int timestamp, int[][] grid, int rows, int cols) {
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        // flag to indicate if the rotting process should be continued
        boolean toBeContinued = false;
        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                if (grid[row][col] == timestamp)
                // current contaminated cell
                {
                    for (int[] d : directions) {
                        int nRow = row + d[0];
                        int nCol = col + d[1];
                        if (nRow >= 0 && nRow < rows && nCol >= 0 && nCol < cols) {
                            if (grid[nRow][nCol] == 1) {
                                // this fresh orange would be contaminated next
                                grid[nRow][nCol] = timestamp + 1;
                                toBeContinued = true;
                            }
                        }
                    }
                }
            }
        }
        return toBeContinued;
    }

    @Override
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int timestamp = 2;
        while (runRottingProcess(timestamp, grid, rows, cols)) {
            timestamp++;
        }

        // end of process, to check if there are still fresh oranges left
        for (int[] row : grid) {
            for (int cell : row)
            // still got a fresh orange left
            {
                if (cell == 1) {
                    return -1;
                }
            }
        }

        // return elapsed minutes if no fresh orange left
        return timestamp - 2;
    }
}
