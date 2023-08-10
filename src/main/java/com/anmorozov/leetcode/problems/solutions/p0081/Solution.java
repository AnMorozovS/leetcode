package com.anmorozov.leetcode.problems.solutions.p0081;

/**
 * <p><strong>81.</strong> Search in Rotated Sorted Array II.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>There is an integer array {@code nums} sorted in non-decreasing order (not necessarily with
     * <strong>distinct</strong> values).</p>
     *
     * <p>Before being passed to your function, {@code nums} is <strong>rotated</strong> at an unknown pivot index
     * {@code k} ({@code 0 <= k < nums.length}) such that the resulting array is
     * {@code [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]} (<strong>0-indexed</strong>). For
     * example, {@code [0,1,2,4,4,4,5,6,6,7]} might be rotated at pivot index {@code 5} and become
     * {@code [4,5,6,6,7,0,1,2,4,4]}.</p>
     *
     * <p>Given the array {@code nums} <strong>after</strong> the rotation and an integer {@code target}, return
     * {@code true}<em> if </em>{@code target}<em> is in </em>{@code nums}<em>, or </em>{@code false}<em> if it is not
     * in </em>{@code nums}<em>.</em></p>
     *
     * <p>You must decrease the overall operation steps as much as possible.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= nums.length <= 5000}</li>
     * 	<li>{@code -10}<sup>4</sup>{@code  <= nums[i] <= 10}<sup>4</sup></li>
     * 	<li>{@code nums} is guaranteed to be rotated at some pivot.</li>
     * 	<li>{@code -10}<sup>4</sup>{@code  <= target <= 10}<sup>4</sup></li>
     * </ul>
     *
     * @param nums sorted in non-decreasing order
     * @param target an integer
     * @return {@code true}<em> if </em>{@code target}<em> is in </em>{@code nums}<em>, or </em>{@code false}<em> if it
     * is not in </em>{@code nums}<em>.</em>
     */
    boolean search(int[] nums, int target);
}
