package com.anmorozov.leetcode.problems.solutions;

import java.util.HashSet;
import java.util.Set;

public class P0733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Set<Cell> currentSet = new HashSet<>();
        int oldColor = image[sr][sc];
        image[sr][sc] = color;
        getValidNeighbours(image, sr, sc, oldColor, color, currentSet);
        return image;
    }

    public void getValidNeighbours(int[][] image, int sr, int sc, int oldColor, int newColor, Set<Cell> currentSet) {
        if (sr > 0 && image[sr - 1][sc] == oldColor) {
            Cell nextCell = new Cell(sr - 1, sc);
            if (!currentSet.contains(nextCell)) {
                currentSet.add(nextCell);
                image[sr - 1][sc] = newColor;
                getValidNeighbours(image, sr - 1, sc, oldColor, newColor, currentSet);
            }
        }
        if ((sr + 1) < image.length && image[sr + 1][sc] == oldColor) {
            Cell nextCell = new Cell(sr + 1, sc);
            if (!currentSet.contains(nextCell)) {
                currentSet.add(nextCell);
                image[sr + 1][sc] = newColor;
                getValidNeighbours(image, sr + 1, sc, oldColor, newColor, currentSet);
            }
        }
        if (sc > 0 && image[sr][sc - 1] == oldColor) {
            Cell nextCell = new Cell(sr, sc - 1);
            if (!currentSet.contains(nextCell)) {
                currentSet.add(nextCell);
                image[sr][sc - 1] = newColor;
                getValidNeighbours(image, sr, sc - 1, oldColor, newColor, currentSet);
            }
        }
        if ((sc + 1) < image[sr].length && image[sr][sc + 1] == oldColor) {
            Cell nextCell = new Cell(sr, sc + 1);
            if (!currentSet.contains(nextCell)) {
                currentSet.add(nextCell);
                image[sr][sc + 1] = newColor;
                getValidNeighbours(image, sr, sc + 1, oldColor, newColor, currentSet);
            }
        }
    }

    public record Cell(int xCoordinate, int yCoordinate) {

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Cell cell = (Cell) o;

            if (xCoordinate != cell.xCoordinate) {
                return false;
            }
            return yCoordinate == cell.yCoordinate;
        }

        @Override
        public int hashCode() {
            int result = xCoordinate;
            result = 31 * result + yCoordinate;
            return result;
        }
    }

}
