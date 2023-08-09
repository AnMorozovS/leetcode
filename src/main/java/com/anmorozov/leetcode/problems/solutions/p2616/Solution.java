package com.anmorozov.leetcode.problems.solutions.p2616;

/**
 * <p><strong>2616.</strong> Minimize the Maximum Difference of Pairs.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>You are given a <strong>0-indexed</strong> integer array {@code nums} and an integer {@code p}. Find
     * {@code p} pairs of indices of {@code nums} such that the <strong>maximum</strong> difference amongst all the
     * pairs is
     * <strong>minimized</strong>. Also, ensure no index appears more than once amongst the {@code p} pairs.</p>
     *
     * <p>Note that for a pair of elements at the index {@code i} and {@code j}, the difference of this pair is
     * {@code |nums[i] - nums[j]|}, where {@code |x|} represents the <strong>absolute</strong> <strong>value</strong> of
     * {@code x}.</p>
     *
     * <p>Return <em>the <strong>minimum maximum</strong> difference among all </em>{@code p} <em>pairs.</em> We define
     * the maximum of an empty set to be zero.</p>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     * 	<li>{@code 1 <= nums.length <= 10}<sup>5</sup></li>
     * 	<li>{@code 0 <= nums[i] <= 10}<sup>9</sup></li>
     * 	<li>{@code 0 <= p <= (nums.length)/2}</li>
     * </ul>
     *
     * @param nums a <strong>0-indexed</strong> integer array
     * @param p an integer
     * @return <em>the <strong>minimum maximum</strong> difference among all </em>{@code p} <em>pairs.</em>
     */
    int minimizeMax(int[] nums, int p);
}
