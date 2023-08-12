package com.anmorozov.leetcode.problems.solutions.p0063;

import java.util.HashMap;
import java.util.Map;

public class MyApproach1 implements Solution {

    private int[][] obstacleGrid;

    private Map<Integer, Map<Integer, Integer>> cache;

    @Override
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        this.obstacleGrid = obstacleGrid;
        this.cache = new HashMap<>();
        return useCache(0, 0);
    }

    private int useCache(int i, int j) {
        Map<Integer, Integer> innerMap = cache.computeIfAbsent(i, HashMap::new);
        if (!innerMap.containsKey(j)) {
            int result = move(i, j);
            innerMap.put(j, result);
        }
        return this.cache.get(i).get(j);
    }

    private int move(int i, int j) {
        if (obstacleGrid[i][j] == 1) {
            return 0;
        }
        if (i == obstacleGrid.length - 1 && j == obstacleGrid[i].length - 1) {
            return 1;
        }
        int count = 0;
        if (i < obstacleGrid.length - 1) {
            count += useCache(i + 1, j);
        }
        if (j < obstacleGrid[i].length - 1) {
            count += useCache(i, j + 1);
        }
        return count;
    }
}
