package com.anmorozov.leetcode.problems.solutions.p0673;

/**
 * <p><b>673.</b> Number of Longest Increasing Subsequence.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given an integer array {@code nums}, return <em>the number of longest increasing subsequences.</em></p>
     *
     * <p><strong>Notice</strong> that the sequence has to be <strong>strictly</strong> increasing.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= nums.length <= 2000}</li>
     * 	<li>{@code -10}<sup>6</sup>{@code  <= nums[i] <= 10}<sup>6</sup></li>
     * </ul>
     *
     * @param nums an integer array
     * @return <em>the number of longest increasing subsequences.</em>
     */
    int findNumberOfLIS(int[] nums);
}
