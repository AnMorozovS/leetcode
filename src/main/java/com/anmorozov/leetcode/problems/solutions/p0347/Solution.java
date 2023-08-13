package com.anmorozov.leetcode.problems.solutions.p0347;

/**
 * <p><strong>347.</strong> Top K Frequent Elements.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>Given an integer array {@code nums} and an integer {@code k}, return <em>the</em> {@code k} <em>most frequent
     * elements</em>. You may return the answer in <strong>any order</strong>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= nums.length <= 10}<sup>5</sup></li>
     * 	<li>{@code -10}<sup>4</sup>{@code  <= nums[i] <= 10}<sup>4</sup></li>
     * 	<li>{@code k} is in the range {@code [1, the number of unique elements in the array]}.</li>
     * 	<li>It is <strong>guaranteed</strong> that the answer is <strong>unique</strong>.</li>
     * </ul>
     *
     * @param nums an integer array
     * @param k number to elemets to return
     * @return <em>the</em> {@code k} <em>most frequent elements</em>
     */
    int[] topKFrequent(int[] nums, int k);
}
