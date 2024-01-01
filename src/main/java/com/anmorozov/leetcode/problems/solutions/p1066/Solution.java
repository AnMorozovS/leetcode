package com.anmorozov.leetcode.problems.solutions.p1066;

/**
 * <p><strong>1066.</strong> Campus Bikes II.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>On a campus represented as a 2D grid, there are {@code n} workers and {@code m} bikes, with {@code n <= m}. Each worker and bike is a 2D coordinate on this grid.</p>
     *
     * <p>We assign one unique bike to each worker so that the sum of the <strong>Manhattan distances</strong> between each worker and their assigned bike is minimized.</p>
     *
     * <p>Return {@code the minimum possible sum of Manhattan distances between each worker and their assigned bike}.</p>
     *
     * <p>The <strong>Manhattan distance</strong> between two points {@code p1} and {@code p2} is {@code Manhattan(p1, p2) = |p1.x - p2.x| + |p1.y - p2.y|}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     * <li>{@code n == workers.length}</li>
     * <li>{@code m == bikes.length}</li>
     * <li>{@code 1 <= n <= m <= 10}</li>
     * <li>{@code workers[i].length == 2}</li>
     * <li>{@code bikes[i].length == 2}</li>
     * <li>{@code 0 <= workers[i][0], workers[i][1], bikes[i][0], bikes[i][1] < 1000}</li>
     * <li>All the workers and the bikes locations are <strong>unique</strong>.</li>
     * </ul>
     *
     * @param workers two-dimensional integer array
     * @param bikes   two-dimensional integer array
     * @return the minimum possible sum of Manhattan distances between each worker and their assigned bike
     */
    int assignBikes(int[][] workers, int[][] bikes);

    default int findDistance(int[] worker, int[] bike) {
        return Math.abs(worker[0] - bike[0]) + Math.abs(worker[1] - bike[1]);
    }
}
