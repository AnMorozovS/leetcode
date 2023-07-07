package com.anmorozov.leetcode.problems.solutions.p0209;

/**
 * <p><b>209.</b> Minimum Size Subarray Sum.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given an array of positive integers {@code nums} and a positive integer {@code target}, return <em>the
     * <strong>minimal length</strong> of a subarray whose sum is greater than or equal to</em> {@code target}. If
     * there is no such subarray, return {@code 0} instead.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= target <= 10}<sup>9</sup></li>
     * 	<li>{@code 1 <= nums.length <= 10}<sup>5</sup></li>
     * 	<li>{@code 1 <= nums[i] <= 10}<sup>4</sup></li>
     * </ul>
     *
     * <p>&nbsp;</p>
     * <strong>Follow up:</strong> If you have figured out the {@code O(n)} solution, try coding another solution of which the time complexity is {@code O(n log(n))}.
     *
     * @param target limit
     * @param nums an array of positive integers
     * @return <em>the <strong>minimal length</strong> of a </em><em>subarray whose sum is greater than or
     * equal to</em> {@code target}. If there is no such subarray, return {@code 0} instead.
     */
    int minSubArrayLen(int target, int[] nums);

}
