package com.anmorozov.leetcode.problems.solutions.p2343;

/**
 * <p><strong>2343.</strong> Query Kth Smallest Trimmed Number.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>You are given a <strong>0-indexed</strong> array of strings {@code nums}, where each string is of
     * <strong>equal length</strong> and consists of only digits.</p>
     *
     * <p>You are also given a <strong>0-indexed</strong> 2D integer array {@code queries} where
     * {@code queries[i] = [k}<sub>i</sub>{@code , trim}<sub>i</sub>{@code ]}. For each {@code queries[i]}, you need
     * to:</p>
     *
     * <ul>
     * 	<li><strong>Trim</strong> each number in {@code nums} to its <strong>rightmost</strong> {@code trim}<sub>i</sub> digits.</li>
     * 	<li>Determine the <strong>index</strong> of the {@code k}<sub>i</sub><sup>th</sup> smallest trimmed number in {@code nums}. If two trimmed numbers are equal, the number with the <strong>lower</strong> index is considered to be smaller.</li>
     * 	<li>Reset each number in {@code nums} to its original length.</li>
     * </ul>
     *
     * <p>Return <em>an array </em>{@code answer}<em> of the same length as </em>{@code queries},<em> where </em>{@code answer[i]}<em> is the answer to the </em>{@code i}<sup>th</sup><em> query.</em></p>
     *
     * <p><strong>Note</strong>:</p>
     *
     * <ul>
     * 	<li>To trim to the rightmost {@code x} digits means to keep removing the leftmost digit, until only {@code x} digits remain.</li>
     * 	<li>Strings in {@code nums} may contain leading zeros.</li>
     * </ul>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= nums.length <= 100}</li>
     * 	<li>{@code 1 <= nums[i].length <= 100}</li>
     * 	<li>{@code nums[i]} consists of only digits.</li>
     * 	<li>All {@code nums[i].length} are <strong>equal</strong>.</li>
     * 	<li>{@code 1 <= queries.length <= 100}</li>
     * 	<li>{@code queries[i].length == 2}</li>
     * 	<li>{@code 1 <= k}<sub>i</sub>{@code  <= nums.length}</li>
     * 	<li>{@code 1 <= trim}<sub>i</sub>{@code  <= nums[i].length}</li>
     * </ul>
     *
     * @param nums a <strong>0-indexed</strong> array of strings
     * @param queries a <strong>0-indexed</strong> 2D integer array
     * @return <em>an array </em>{@code answer}<em> of the same length as </em>{@code queries},<em> where
     * </em>{@code answer[i]}<em> is the answer to the </em>{@code i}<sup>th</sup><em> query.</em>
     */
    int[] smallestTrimmedNumbers(String[] nums, int[][] queries);
}
