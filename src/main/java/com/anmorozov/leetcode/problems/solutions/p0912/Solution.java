package com.anmorozov.leetcode.problems.solutions.p0912;

/**
 * <p><strong>912.</strong> Sort an Array.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>Given an array of integers {@code nums}, sort the array in ascending order and return it.</p>
     *
     * <p>You must solve the problem <strong>without using any built-in</strong> functions in {@code O(nlog(n))} time
     * complexity and with the smallest space complexity possible.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= nums.length <= 5 * 10}<sup>4</sup></li>
     * 	<li>{@code -5 * 10}<sup>4</sup>{@code  <= nums[i] <= 5 * 10}<sup>4</sup></li>
     * </ul>
     *
     * @param nums an array of integers
     * @return sort the array in ascending order and return it
     */
    Integer[] sortArray(Integer[] nums);
}
