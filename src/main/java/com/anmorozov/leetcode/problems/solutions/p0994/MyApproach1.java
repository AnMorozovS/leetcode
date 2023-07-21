package com.anmorozov.leetcode.problems.solutions.p0994;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyApproach1 implements Solution {

    int fresh = 0;
    private int[][] grid;

    @Override
    public int orangesRotting(int[][] grid) {
        this.grid = grid;
        fresh = 0;
        Queue<List<Integer>> readyToRot = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    addToReadyRot(i - 1, j, readyToRot);
                    addToReadyRot(i + 1, j, readyToRot);
                    addToReadyRot(i, j - 1, readyToRot);
                    addToReadyRot(i, j + 1, readyToRot);
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        int day = 0;
        while (!readyToRot.isEmpty()) {
            if (fresh == 0) {
                break;
            }
            day++;
            Queue<List<Integer>> nextReadyToRot = new LinkedList<>();
            while (!readyToRot.isEmpty()) {
                List<Integer> node = readyToRot.poll();
                rotted(node.get(0), node.get(1), nextReadyToRot);
            }
            readyToRot = nextReadyToRot;
        }
        return fresh == 0 ? day : -1;
    }

    private void rotted(int i, int j, Queue<List<Integer>> readyToRot) {
        if (grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 2;
        fresh--;
        addToReadyRot(i - 1, j, readyToRot);
        addToReadyRot(i + 1, j, readyToRot);
        addToReadyRot(i, j - 1, readyToRot);
        addToReadyRot(i, j + 1, readyToRot);
    }

    private void addToReadyRot(int i, int j, Queue<List<Integer>> readyToRot) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[i].length) {
            if (grid[i][j] == 1) {
                readyToRot.add(List.of(i, j));
            }
        }
    }
}
