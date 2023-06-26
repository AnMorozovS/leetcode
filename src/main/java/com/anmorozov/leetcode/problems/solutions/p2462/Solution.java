package com.anmorozov.leetcode.problems.solutions.p2462;

/**
 * <p><b>2462.</b> Total Cost to Hire K Workers</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>You are given a <strong>0-indexed</strong> integer array {@code costs} where {@code costs[i]} is the cost of
     * hiring the {@code i}<sup>{@code th}</sup> worker.</p>
     *
     * <p>You are also given two integers {@code k} and {@code candidates}. We want to hire exactly {@code k} workers
     * according to the following rules:</p>
     *
     * <ul>
     * 	<li>You will run {@code k} sessions and hire exactly one worker in each session.</li>
     * 	<li>In each hiring session, choose the worker with the lowest cost from either the first {@code candidates} workers or the last {@code candidates} workers. Break the tie by the smallest index.
     * 	<ul>
     * 		<li>For example, if {@code costs = [3,2,7,7,1,2]} and {@code candidates = 2}, then in the first hiring session, we will choose the {@code 4}<sup>th</sup> worker because they have the lowest cost {@code [3,2,7,7,}<strong>{@code 1}</strong>{@code ,2]}.</li>
     * 		<li>In the second hiring session, we will choose {@code 1}<sup>st</sup> worker because they have the same lowest cost as {@code 4}<sup>th</sup> worker but they have the smallest index {@code [3,}<strong>{@code 2}</strong>{@code ,7,7,2]}. Please note that the indexing may be changed in the process.</li>
     * 	</ul>
     * 	</li>
     * 	<li>If there are fewer than candidates workers remaining, choose the worker with the lowest cost among them. Break the tie by the smallest index.</li>
     * 	<li>A worker can only be chosen once.</li>
     * </ul>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     * 	<li>{@code 1 <= costs.length <= 10} <sup>{@code 5 }</sup></li>
     * 	<li>{@code 1 <= costs[i] <= 10}<sup>{@code 5}</sup></li>
     * 	<li>{@code 1 <= k, candidates <= costs.length}</li>
     * </ul>
     *
     * @param costs a <strong>0-indexed</strong> integer array {@code costs} where {@code costs[i]} is the cost of
     * hiring the {@code i}<sup>th</sup> worker.
     * @param k We want to hire exactly {@code k} workers
     * @param candidates We have candidates
     * @return <em>the total cost to hire exactly </em>{@code k}<em> workers.</em>
     */
    long totalCost(int[] costs, int k, int candidates);
}
