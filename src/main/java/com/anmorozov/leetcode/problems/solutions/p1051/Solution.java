package com.anmorozov.leetcode.problems.solutions.p1051;

/**
 * <p><strong>1051.</strong> Height Checker.</p>
 * <em>Easy</em>
 */
public interface Solution {

    /**
     * <p>A school is trying to take an annual photo of all the students. The students are asked to stand in a single
     * file line in <strong>non-decreasing order</strong> by height. Let this ordering be represented by the integer
     * array {@code expected} where {@code expected[i]} is the expected height of the {@code i}<sup>th</sup> student in
     * line.</p>
     *
     * <p>You are given an integer array {@code heights} representing the <strong>current order</strong> that the
     * students are standing in. Each {@code heights[i]} is the height of the {@code i}<sup>th</sup> student in line
     * (<strong>0-indexed</strong>).</p>
     *
     * <p>Return <em>the <strong>number of indices</strong> where </em>{@code heights[i] != expected[i]}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= heights.length <= 100}</li>
     * 	<li>{@code 1 <= heights[i] <= 100}</li>
     * </ul>
     *
     * @param heights an integer array
     * @return <em>the <strong>number of indices</strong> where </em>{@code heights[i] != expected[i]}
     */
    int heightChecker(int[] heights);
}
