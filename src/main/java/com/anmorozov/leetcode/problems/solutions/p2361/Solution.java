package com.anmorozov.leetcode.problems.solutions.p2361;

/**
 * <p><strong>2361.</strong> Minimum Costs Using the Train Line</p>
 * <i>Hard</i>
 */
public interface Solution {

    /**
     * <p>A train line going through a city has two routes, the regular route and the express route. Both routes go
     * through the <strong>same</strong> {@code n + 1} stops labeled from {@code 0} to {@code n}. Initially, you start
     * on the regular route at stop {@code 0}.</p>
     *
     * <p>You are given two <strong>1-indexed</strong> integer arrays {@code regular} and {@code express}, both of
     * length {@code n}. {@code regular[i]} describes the cost it takes to go from stop {@code i - 1} to stop {@code i}
     * using the regular route, and {@code express[i]} describes the cost it takes to go from stop {@code i - 1} to stop
     * {@code i} using the express route.</p>
     *
     * <p>You are also given an integer {@code expressCost} which represents the cost to transfer from the regular
     * route
     * to the express route.</p>
     *
     * <p>Note that:</p>
     *
     * <ul>
     * 	<li>There is no cost to transfer from the express route back to the regular route.</li>
     * 	<li>You pay {@code expressCost} <strong>every</strong> time you transfer from the regular route to the express route.</li>
     * 	<li>There is no extra cost to stay on the express route.</li>
     * </ul>
     *
     * <p>Return <em>a <strong>1-indexed</strong> array </em>{@code costs}<em> of length </em>{@code n}<em>, where </em>{@code costs[i]}<em> is the <strong>minimum</strong> cost to reach stop </em>{@code i}<em> from stop </em>{@code 0}.</p>
     *
     * <p>Note that a stop can be counted as <strong>reached</strong> from either route.</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code n == regular.length == express.length}</li>
     * 	<li>{@code 1 <= n <= 10}<sup>5</sup></li>
     * 	<li>{@code 1 <= regular[i], express[i], expressCost <= 10}<sup>5</sup></li>
     * </ul>
     *
     * @param regular costs array
     * @param express costs array
     * @param expressCost to switch route
     * @return em>a <strong>1-indexed</strong> array </em>{@code costs}<em> of length </em>{@code n}<em>, where
     * </em>{@code costs[i]}<em> is the <strong>minimum</strong> cost to reach stop </em>{@code i}<em> from stop
     * </em>{@code 0}
     */
    long[] minimumCosts(int[] regular, int[] express, int expressCost);

}
