package com.anmorozov.leetcode.problems.solutions.p0063;

/**
 * <p><strong>63.</strong> Unique Paths II.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>You are given an {@code m x n} integer array {@code grid}. There is a robot initially located at the
     * <b>top-left corner</b> (i.e., {@code grid[0][0]}). The robot tries to move to the <strong>bottom-right
     * corner</strong> (i.e., {@code grid[m - 1][n - 1]}). The robot can only move either down or right at any point in
     * time.</p>
     *
     * <p>An obstacle and space are marked as {@code 1} or {@code 0} respectively in {@code grid}. A path that the
     * robot
     * takes cannot include <strong>any</strong> square that is an obstacle.</p>
     *
     * <p>Return <em>the number of possible unique paths that the robot can take to reach the bottom-right
     * corner</em>.</p>
     *
     * <p>The testcases are generated so that the answer will be less than or equal to {@code 2 * 10}<sup>9</sup>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code m == obstacleGrid.length}</li>
     * 	<li>{@code n == obstacleGrid[i].length}</li>
     * 	<li>{@code 1 <= m, n <= 100}</li>
     * 	<li>{@code obstacleGrid[i][j]} is {@code 0} or {@code 1}.</li>
     * </ul>
     *
     * @param obstacleGrid an {@code m x n} integer array {@code grid}
     * @return <em>the number of possible unique paths that the robot can take to reach the bottom-right corner</em>
     */
    int uniquePathsWithObstacles(int[][] obstacleGrid);
}
