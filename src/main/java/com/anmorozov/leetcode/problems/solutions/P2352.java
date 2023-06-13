package com.anmorozov.leetcode.problems.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P2352 {

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rows = new HashMap<>();
        for (int[] row : grid) {
            String key = Arrays.toString(row);
            rows.put(key, 1 + rows.getOrDefault(key, 0));
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            int[] colArray = new int[n];
            for (int r = 0; r < n; ++r) {
                colArray[r] = grid[r][i];
            }
            result += rows.getOrDefault(Arrays.toString(colArray), 0);
        }
        return result;
    }
}
