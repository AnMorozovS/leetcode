package com.anmorozov.leetcode.problems.solutions.p1631;

import java.util.Arrays;

/**
 * 1631. Path With Minimum Effort
 */
public interface Solution {

    int[][] DIRECTIONS = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    default boolean isValidCell(int x, int y, int row, int col) {
        return x >= 0 && x <= row - 1 && y >= 0 && y <= col - 1;
    }

    default int[][] getDifferenceMatrix(int[][] heights) {
        int[][] differenceMatrix = new int[heights.length][heights[0].length];

        for (int[] maxHeight : differenceMatrix) {
            Arrays.fill(maxHeight, Integer.MAX_VALUE);
        }
        differenceMatrix[0][0] = 0;
        return differenceMatrix;
    }

    /**
     * <p>You are a hiker preparing for an upcoming hike. You are given {@code heights}, a 2D array of size
     * {@code rows x columns}, where {@code heights[row][col]} represents the height of cell {@code (row, col)}. You are
     * situated in the top-left cell, {@code (0, 0)}, and you hope to travel to the bottom-right cell, {@code (rows-1,
     * columns-1)} (i.e.,<strong>0-indexed</strong>). You can move
     * <strong>up</strong>, <strong>down</strong>, <strong>left</strong>, or <strong>right</strong>, and you wish to
     * find a route that requires the minimum <strong>effort</strong>.</p>
     *
     * <p>A route's <strong>effort</strong> is the <strong>maximum absolute difference</strong>in heights between two
     * consecutive cells of the route.</p>
     *
     * <p>Return <em>the minimum <strong>effort</strong> required to travel from the top-left cell to the bottom-right
     * cell.</em></p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code rows == heights.length}</li>
     * 	<li>{@code columns == heights[i].length}</li>
     * 	<li>{@code 1 <= rows, columns <= 100}</li>
     * 	<li>{@code 1 <= heights[i][j] <= 10}<sup>6</sup></li>
     * </ul>
     *
     * @param heights a 2D array of size {@code rows x columns}
     * @return <em>the minimum <strong>effort</strong> required to travel from the top-left cell to the bottom-right
     * cell.</em>
     */
    int minimumEffortPath(int[][] heights);
}
