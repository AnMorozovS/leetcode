package com.anmorozov.leetcode.problems.solutions.p1870;

/**
 * <p><strong>1870.</strong> Minimum Speed to Arrive on Time.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>You are given a floating-point number {@code hour}, representing the amount of time you have to reach the
     * office. To commute to the office, you must take {@code n} trains in sequential order. You are also given an
     * integer array {@code dist} of length {@code n}, where {@code dist[i]} describes the distance (in kilometers) of
     * the {@code i}<sup>th</sup> train ride.</p>
     *
     * <p>Each train can only depart at an integer hour, so you may need to wait in between each train ride.</p>
     *
     * <ul>
     * 	<li>For example, if the {@code 1}<sup>st</sup> train ride takes {@code 1.5} hours, you must wait for an additional {@code 0.5} hours before you can depart on the {@code 2}<sup>nd</sup> train ride at the 2 hour mark.</li>
     * </ul>
     *
     * <p>Return <em>the <strong>minimum positive integer</strong> speed <strong>(in kilometers per hour)</strong> that all the trains must travel at for you to reach the office on time, or </em>{@code -1}<em> if it is impossible to be on time</em>.</p>
     *
     * <p>Tests are generated such that the answer will not exceed {@code 10}<sup>7</sup> and {@code hour} will have <strong>at most two digits after the decimal point</strong>.</p>
     *
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     * 	<li>{@code n == dist.length}</li>
     * 	<li>{@code 1 <= n <= 10}<sup>5</sup></li>
     * 	<li>{@code 1 <= dist[i] <= 10}<sup>5</sup></li>
     * 	<li>{@code 1 <= hour <= 10}<sup>9</sup></li>
     * 	<li>There will be at most two digits after the decimal point in {@code hour}.</li>
     * </ul>
     *
     * @param dist where {@code dist[i]} describes the distance (in kilometers) of the {@code i}<sup>th</sup> train
     * ride
     * @param hour the amount of time you have to reach the office
     * @return <em>the <strong>minimum positive integer</strong> speed <strong>(in kilometers per hour)</strong> that
     * all the trains must travel at for you to reach the office on time, or </em>{@code -1}<em> if it is impossible to
     * be on time</em>
     */
    int minSpeedOnTime(int[] dist, double hour);
}
