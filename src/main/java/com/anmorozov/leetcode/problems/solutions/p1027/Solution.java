package com.anmorozov.leetcode.problems.solutions.p1027;

/**
 * <p><b>1027.</b> Longest Arithmetic Subsequence</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given an array {@code nums} of integers, return <em>the length of the longest arithmetic subsequence
     * in</em> {@code nums}.</p>
     *
     * <p><strong>Note</strong> that:</p>
     *
     * <ul>
     * 	<li>A <strong>subsequence</strong> is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.</li>
     * 	<li>A sequence {@code seq} is arithmetic if {@code seq[i + 1] - seq[i]} are all the same value (for {@code 0 <= i < seq.length - 1}).</li>
     * </ul>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 2 <= nums.length <= 1000}</li>
     * 	<li>{@code 0 <= nums[i] <= 500}</li>
     * </ul>
     *
     * @param nums an array {@code nums} of integers
     * @return the maximum profit you can achieve
     */
    @SuppressWarnings("SpellCheckingInspection")
    int longestArithSeqLength(int[] nums);
}
