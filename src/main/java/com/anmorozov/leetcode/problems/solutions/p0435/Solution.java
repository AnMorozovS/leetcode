package com.anmorozov.leetcode.problems.solutions.p0435;

/**
 * <p><b>435.</b> Non-overlapping Intervals.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given an array of intervals {@code intervals} where {@code intervals[i] = [start}<sub>i</sub>{@code ,
     * end}<sub>i</sub>{@code ]}, return <em>the minimum number of intervals you need to remove to make the rest of the
     * intervals non-overlapping</em>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= intervals.length <= }10<sup>5</sup></li>
     * 	<li>{@code intervals[i].length == 2}</li>
     * 	<li>{@code -5 * 10}<sup>4</sup>{@code  <= start}<sub>i</sub>{@code  < end}<sub>i</sub>{@code  <= 5 * 10}<sup>4</sup></li>
     * </ul>
     *
     * @param intervals an array of intervals
     * @return <em>the minimum number of intervals you need to remove to make the rest of the intervals
     * non-overlapping</em>
     */
    int eraseOverlapIntervals(int[][] intervals);
}
