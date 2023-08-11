package com.anmorozov.leetcode.problems.solutions.p0215;

/**
 * <p><strong>215.</strong> Kth Largest Element in an Array.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>Given an integer array {@code nums} and an integer {@code k}, return <em>the</em> {@code k}<sup>th</sup>
     * <em>largest element in the array</em>.</p>
     *
     * <p>Note that it is the {@code k}<sup>th</sup> largest element in the sorted order, not the
     * {@code k}<sup>th</sup>
     * distinct element.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= k <= nums.length <= 10}<sup>5</sup></li>
     * 	<li>{@code -10}<sup>4</sup>{@code  <= nums[i] <= 10))}<sup>4</sup></li>
     * </ul>
     *
     * @param nums an integer array
     * @param k an integer
     * @return <em>the</em> {@code k}<sup>th</sup> <em>largest element in the array</em>
     */
    int findKthLargest(int[] nums, int k);
}
