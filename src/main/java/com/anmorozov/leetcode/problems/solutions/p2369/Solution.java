package com.anmorozov.leetcode.problems.solutions.p2369;

/**
 * <p><strong>2369.</strong> Check if There is a Valid Partition For The Array.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>You are given a <strong>0-indexed</strong> integer array {@code nums}. You have to partition the array into
     * one or more <strong>contiguous</strong> sub arrays.</p>
     *
     * <p>We call a partition of the array <strong>valid</strong> if each of the obtained subarrays satisfies
     * <strong>one</strong> of the following conditions:</p>
     *
     * <ol>
     * 	<li>The subarray consists of <strong>exactly</strong> {@code 2} equal elements. For example, the subarray {@code [2,2]} is good.</li>
     * 	<li>The subarray consists of <strong>exactly</strong> {@code 3} equal elements. For example, the subarray {@code [4,4,4]} is good.</li>
     * 	<li>The subarray consists of <strong>exactly</strong> {@code 3} consecutive increasing elements, that is, the difference between adjacent elements is {@code 1}. For example, the subarray {@code [3,4,5]} is good, but the subarray {@code [1,3,5]} is not.</li>
     * </ol>
     *
     * <p>Return {@code true}<em> if the array has <strong>at least</strong> one valid partition</em>. Otherwise, return {@code false}.</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 2 <= nums.length <= 10}<sup>5</sup></li>
     * 	<li>{@code 1 <= nums[i] <= 10}<sup>6</sup></li>
     * </ul>
     */
    boolean validPartition(int[] nums);
}
