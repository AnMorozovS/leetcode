package com.anmorozov.leetcode.problems.solutions.p0994;

/**
 * <p><b>994.</b> Rotting Oranges.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>You are given an {@code m x n} {@code grid} where each cell can have one of three values:</p>
     *
     * <ul>
     * 	<li>{@code 0} representing an empty cell,</li>
     * 	<li>{@code 1} representing a fresh orange, or</li>
     * 	<li>{@code 2} representing a rotten orange.</li>
     * </ul>
     *
     * <p>Every minute, any fresh orange that is <strong>4-directionally adjacent</strong> to a rotten orange becomes rotten.</p>
     *
     * <p>Return <em>the minimum number of minutes that must elapse until no cell has a fresh orange</em>. If <em>this is impossible, return</em> {@code -1}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code m == grid.length}</li>
     * 	<li>{@code n == grid[i].length}</li>
     * 	<li>{@code 1 <= m, n <= 10}</li>
     * 	<li>{@code grid[i][j]} is {@code 0}, {@code 1}, or {@code 2}.</li>
     * </ul>
     *
     * @param grid where each cell can have one of three values: {@code 0}, {@code 1}, or {@code 2}
     * @return <em>the minimum number of minutes that must elapse until no cell has a fresh orange</em>
     */
    int orangesRotting(int[][] grid);
}
