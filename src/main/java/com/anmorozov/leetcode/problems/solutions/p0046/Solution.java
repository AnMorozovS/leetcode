package com.anmorozov.leetcode.problems.solutions.p0046;

import java.util.List;

/**
 * <p><strong>46.</strong> Permutations</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>Given an array {@code nums} of distinct integers, return <em>all the possible permutations</em>. You can
     * return the answer in <strong>any order</strong>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= nums.length <= 6}</li>
     * 	<li>{@code -10 <= nums[i] <= 10}</li>
     * 	<li>All the integers of {@code nums} are <strong>unique</strong>.</li>
     * </ul>
     *
     * @param nums an array of distinct integers
     * @return <em>all the possible permutations</em>
     */
    List<List<Integer>> permute(int[] nums);
}
