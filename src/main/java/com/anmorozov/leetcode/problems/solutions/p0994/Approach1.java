package com.anmorozov.leetcode.problems.solutions.p0994;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Approach 1: Breadth-First Search (BFS)
 */
public class Approach1 implements Solution {
    @Override
    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue = new ArrayDeque<>();

        // Step 1). build the initial set of rotten oranges
        int freshOranges = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < cols; ++c) {
                if (grid[r][c] == 2) {
                    queue.offer(new Pair(r, c));
                } else if (grid[r][c] == 1) {
                    freshOranges++;
                }
            }
        }

        // Mark the round / level, _i.e_ the ticker of timestamp
        queue.offer(new Pair(-1, -1));

        // Step 2). start the rotting process via BFS
        int minutesElapsed = -1;
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int row = p.key();
            int col = p.value();
            if (row == -1) {
                // We finish one round of processing
                minutesElapsed++;
                // to avoid the endless loop
                if (!queue.isEmpty()) {
                    queue.offer(new Pair(-1, -1));
                }
            } else {
                // this is a rotten orange
                // then it would contaminate its neighbors
                for (int[] d : directions) {
                    int neighborRow = row + d[0];
                    int neighborCol = col + d[1];
                    if (neighborRow >= 0 && neighborRow < rows &&
                            neighborCol >= 0 && neighborCol < cols) {
                        if (grid[neighborRow][neighborCol] == 1) {
                            // this orange would be contaminated
                            grid[neighborRow][neighborCol] = 2;
                            freshOranges--;
                            // this orange would then contaminate other oranges
                            queue.offer(new Pair(neighborRow, neighborCol));
                        }
                    }
                }
            }
        }

        // return elapsed minutes if no fresh orange left
        return freshOranges == 0 ? minutesElapsed : -1;
    }

    record Pair(Integer key, Integer value) {
    }
}
