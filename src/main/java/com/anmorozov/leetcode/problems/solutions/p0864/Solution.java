package com.anmorozov.leetcode.problems.solutions.p0864;

/**
 * 864. Shortest Path to Get All Keys
 */
public interface Solution {

    /**
     * <p>You are given an {@code m x n} grid {@code grid} where:</p>
     *
     * <ul>
     * 	<li>{@code '.'} is an empty cell.</li>
     * 	<li>{@code '#'} is a wall.</li>
     * 	<li>{@code '@'} is the starting point.</li>
     * 	<li>Lowercase letters represent keys.</li>
     * 	<li>Uppercase letters represent locks.</li>
     * </ul>
     *
     * <p>You start at the starting point and one move consists of walking one space in one of the four cardinal directions. You cannot walk outside the grid, or walk into a wall.</p>
     *
     * <p>If you walk over a key, you can pick it up and you cannot walk over a lock unless you have its corresponding key.</p>
     *
     * <p>For some {@code 1 <= k <= 6}, there is exactly one lowercase and one uppercase letter of the first {@code k} letters of the English alphabet in the grid. This means that there is exactly one key for each lock, and one lock for each key; and also that the letters used to represent the keys and locks were chosen in the same order as the English alphabet.</p>
     *
     * <p>Return <em>the lowest number of moves to acquire all keys</em>. If it is impossible, return {@code -1}.</p>
     *
     * <p>&nbsp;</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code m == grid.length}</li>
     * 	<li>{@code n == grid[i].length}</li>
     * 	<li>{@code 1 <= m, n <= 30}</li>
     * 	<li>{@code grid[i][j]} is either an English letter, {@code '.'}, {@code '#'}, or {@code '@'}.</li>
     * 	<li>The number of keys in the grid is in the range {@code [1, 6]}.</li>
     * 	<li>Each key in the grid is <strong>unique</strong>.</li>
     * 	<li>Each key in the grid has a matching lock.</li>
     * </ul>
     *
     * @param grid {@code m x n}
     * @return <em>the lowest number of moves to acquire all keys</em>. If it is impossible, return {@code -1}.
     */
    int shortestPathAllKeys(String[] grid);
}
