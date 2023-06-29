package com.anmorozov.leetcode.problems.solutions.p0864;

import java.util.Arrays;

public class MyApproach1 implements Solution {

    private int height;
    private int width;
    private char[][] ground;

    @Override
    public int shortestPathAllKeys(String[] grid) {
        height = grid.length;
        width = grid[0].length();
        ground = new char[height][width];
        Integer startI = null;
        Integer startJ = null;
        boolean[] keyRing = new boolean['z' - 'a' + 1];
        Arrays.fill(keyRing, true);
        for (int i = 0; i < height; i++) {
            char[] row = grid[i].toCharArray();
            for (int j = 0; j < row.length; j++) {
                char cell = row[j];
                if (cell >= 'a' && cell <= 'z') {
                    keyRing[cell - 'a'] = false;
                } else if (cell == '@') {
                    startI = i;
                    startJ = j;
                }
                ground[i][j] = cell;
            }
        }
        if (startI == null || startJ == null) {
            return -1;
        }
        boolean[][] visited = new boolean[height][width];
        int shortestPath = shortestPath(startI, startJ, visited, keyRing);
        return shortestPath == -1 ? shortestPath : shortestPath - 1;
    }

    private int shortestPath(int i, int j, boolean[][] visited, boolean[] keyRing) {

        if (i >= height || i < 0) {
            return -1;
        }
        if (j >= width || j < 0) {
            return -1;
        }

        if (visited[i][j]) {
            return -1;
        }
        visited[i][j] = true;

        char cell = ground[i][j];
        if (cell == '#') {
            return -1;
        }
        if (cell >= 'A' && cell <= 'Z') {
            if (!keyRing[Character.toLowerCase(cell) - 'a']) {
                return -1;
            }
        }

        if (cell >= 'a' && cell <= 'z') {
            keyRing[cell - 'a'] = true;
            boolean stopFlag = true;
            for (boolean b : keyRing) {
                if (!b) {
                    stopFlag = false;
                    break;
                }
            }
            if (stopFlag) {
                return 1;
            }
            visited = new boolean[height][width];
            visited[i][j] = true;
        }
        int path1 = shortestPath(i + 1, j, Arrays.copyOf(visited, visited.length),
                Arrays.copyOf(keyRing, keyRing.length));
        int path2 = shortestPath(i - 1, j, Arrays.copyOf(visited, visited.length),
                Arrays.copyOf(keyRing, keyRing.length));
        int path3 = shortestPath(i, j + 1, Arrays.copyOf(visited, visited.length),
                Arrays.copyOf(keyRing, keyRing.length));
        int path4 = shortestPath(i, j - 1, Arrays.copyOf(visited, visited.length),
                Arrays.copyOf(keyRing, keyRing.length));

        int minPath = -1;
        minPath = getMinPath(path1, minPath);
        minPath = getMinPath(path2, minPath);
        minPath = getMinPath(path3, minPath);
        minPath = getMinPath(path4, minPath);
        return minPath == -1 ? -1 : minPath + 1;

    }

    private int getMinPath(int path, int minPath) {
        if (path != -1) {
            if (minPath != -1) {
                minPath = Math.min(path, minPath);
            } else {
                minPath = path;
            }
        }
        return minPath;
    }

}
