package com.anmorozov.leetcode.problems.solutions.p1631;

import java.util.PriorityQueue;

/**
 * Approach 2: Variations of Dijkstra's Algorithm
 */
public class Approach2 implements Solution {

    @Override
    public int minimumEffortPath(int[][] heights) {
        int[][] differenceMatrix = getDifferenceMatrix(heights);
        int rows = differenceMatrix.length;
        int columns = differenceMatrix[0].length;

        PriorityQueue<Cell> queue = new PriorityQueue<>();
        boolean[][] visited = new boolean[rows][columns];
        queue.add(new Cell(0, 0, differenceMatrix[0][0]));

        while (!queue.isEmpty()) {
            Cell curr = queue.poll();
            visited[curr.x()][curr.y()] = true;
            if (curr.x() == rows - 1 && curr.y() == columns - 1) {
                break;
            }
            for (int[] direction : DIRECTIONS) {
                int adjacentX = curr.x() + direction[0];
                int adjacentY = curr.y() + direction[1];
                if (isValidCell(adjacentX, adjacentY, rows, columns) && !visited[adjacentX][adjacentY]) {
                    int currentDifference = Math.abs(heights[adjacentX][adjacentY] - heights[curr.x()][curr.y()]);
                    int maxDifference = Math.max(currentDifference, differenceMatrix[curr.x()][curr.y()]);
                    if (differenceMatrix[adjacentX][adjacentY] > maxDifference) {
                        differenceMatrix[adjacentX][adjacentY] = maxDifference;
                        queue.add(new Cell(adjacentX, adjacentY, maxDifference));
                    }
                }
            }
        }
        return differenceMatrix[rows - 1][columns - 1];
    }


}

