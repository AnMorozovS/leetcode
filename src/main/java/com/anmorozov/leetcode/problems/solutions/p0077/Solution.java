package com.anmorozov.leetcode.problems.solutions.p0077;

import java.util.List;

/**
 * <p><strong>77.</strong> Combinations.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given two integers {@code n} and {@code k}, return <em>all possible combinations of</em> {@code k}
     * <em>numbers
     * chosen from the range</em> {@code [1, n]}.</p>
     *
     * <p>You may return the answer in <strong>any order</strong>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= n <= 20}</li>
     * 	<li>{@code 1 <= k <= n}</li>
     * </ul>
     *
     * @param n range from 1 to n
     * @param k numbers in range
     * @return <em>all possible combinations</em>
     */
    List<List<Integer>> combine(int n, int k);
}
