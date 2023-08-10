package com.anmorozov.leetcode.problems.solutions.p0075;

/**
 * <p><strong>75.</strong> Sort Colors.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>Given an array {@code nums} with {@code n} objects colored red, white, or blue, sort them <strong><a
     * href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in-place</a> </strong>so that objects of
     * the same color are adjacent, with the colors in the order red, white, and blue.</p>
     *
     * <p>We will use the integers {@code 0}, {@code 1}, and {@code 2} to represent the color red, white, and blue,
     * respectively.</p>
     *
     * <p>You must solve this problem without using the library's sort function.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code n == nums.length}</li>
     * 	<li>{@code 1 <= n <= 300}</li>
     * 	<li>{@code nums[i]} is either {@code 0}, {@code 1}, or {@code 2}.</li>
     * </ul>
     *
     * @param nums an array {@code nums} with {@code n} objects colored red, white, or blue
     * @return sorted array
     */
    int[] sortColors(int[] nums);
}
