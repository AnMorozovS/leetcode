package com.anmorozov.leetcode.problems.solutions.p1493;

/**
 * <p><b>1493.</b> Longest Subarray of 1's After Deleting One Element.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given a binary array {@code nums}, you should delete one element from it.</p>
     * <p>Return <em>the size of the longest non-empty subarray containing only </em>{@code 1}<em>'s in the resulting
     * array</em>. Return {@code 0} if there is no such subarray.</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= nums.length <= 10}<sup>5</sup></li>
     * 	<li>{@code nums[i]} is either {@code 0} or {@code 1}.</li>
     * </ul>
     *
     * @param nums a binary array
     * @return <em>the size of the longest non-empty subarray containing only </em>{@code 1}<em>'s in the resulting
     * array</em>. Return {@code 0} if there is no such subarray.
     */
    int longestSubarray(int[] nums);
}
