package com.anmorozov.leetcode.problems.solutions.p1200;

import java.util.List;

/**
 * <p><strong>1200.</strong> Minimum Absolute Difference.</p>
 * <em>Easy</em>
 */
public interface Solution {

    /**
     * <p>Given an array of <strong>distinct</strong> integers {@code arr}, find all pairs of elements with the minimum
     * absolute difference of any two elements.</p>
     *
     * <p>Return a list of pairs in ascending order(with respect to pairs), each pair {@code [a, b]} follows</p>
     *
     * <ul>
     * 	<li>{@code a, b} are from {@code arr}</li>
     * 	<li>{@code a < b}</li>
     * 	<li>{@code b - a} equals to the minimum absolute difference of any two elements in {@code arr}</li>
     * </ul>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 2 <= arr.length <= 10}<sup>5</sup></li>
     * 	<li>{@code -10}<sup>6</sup>{@code  <= arr[i] <= 10)}<sup>6</sup></li>
     * </ul>
     *
     * @param arr an array of <strong>distinct</strong> integers
     * @return a list of pairs in ascending order(with respect to pairs), each pair {@code [a, b]} follows
     */
    List<List<Integer>> minimumAbsDifference(int[] arr);

}
