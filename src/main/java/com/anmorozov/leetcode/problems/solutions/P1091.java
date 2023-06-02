package com.anmorozov.leetcode.problems.solutions;

import java.util.LinkedList;
import java.util.Queue;


public class P1091 {

    int[][] grid;
    private int gridLength;

    public int shortestPathBinaryMatrix(int[][] grid) {
        this.gridLength = grid.length;
        this.grid = grid;
        int endPosition = gridLength - 1;
        if (grid[0][0] != 0 || grid[endPosition][endPosition] != 0) {
            return -1;
        }
        Queue<int[]> currentPossitions = new LinkedList<>();
        currentPossitions.add(new int[] {0, 0});

        int generationCount = 1;
        while (true) {
            Queue<int[]> nextPositions = new LinkedList<>();
            while (true) {
                int[] position = currentPossitions.poll();
                if (position == null) {
                    break;
                } else if (position[0] == endPosition && position[1] == endPosition) {
                    return generationCount;
                } else {
                    addNeighbours(position, nextPositions);
                }
            }
            generationCount++;

            if (nextPositions.isEmpty()) {
                return -1;
            }
            currentPossitions = nextPositions;

        }
    }

    public void addNeighbours(int[] position, Queue<int[]> nextGenerationSet) {
        int x = position[1];
        int y = position[0];
        addPositionsToSet(nextGenerationSet, x + 1, y + 1);

        addPositionsToSet(nextGenerationSet, x, y + 1);
        addPositionsToSet(nextGenerationSet, x + 1, y);

        addPositionsToSet(nextGenerationSet, x + 1, y - 1);
        addPositionsToSet(nextGenerationSet, x - 1, y + 1);

        addPositionsToSet(nextGenerationSet, x, y - 1);
        addPositionsToSet(nextGenerationSet, x - 1, y);

        addPositionsToSet(nextGenerationSet, x - 1, y - 1);

    }

    public void addPositionsToSet(Queue<int[]> result, int x, int y) {
        if (x >= 0 && y >= 0 && x < gridLength && y < gridLength && grid[y][x] == 0) {
            result.add(new int[] {y, x});
            grid[y][x] = 1;
        }
    }
}
