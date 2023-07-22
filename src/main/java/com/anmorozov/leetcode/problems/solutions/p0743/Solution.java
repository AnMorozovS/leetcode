package com.anmorozov.leetcode.problems.solutions.p0743;

/**
 * <p><b>743.</b> Network Delay Time.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>You are given a network of {@code n} nodes, labeled from {@code 1} to {@code n}. You are also given {@code
     * times}, a list of travel times as directed edges {@code times[i] = (u}<sub>i</sub>{@code , v}<sub>i</sub>{@code ,
     * w}<sub>i</sub>{@code )}, where {@code u}<sub>i</sub> is the source node, {@code v}<sub>i</sub> is the target
     * node, and {@code w}<sub>i</sub> is the time it takes for a signal to travel from source to target.</p>
     *
     * <p>We will send a signal from a given node {@code k}. Return <em>the <strong>minimum</strong> time it takes for
     * all the</em> {@code n} <em>nodes to receive the signal</em>. If it is impossible for all the {@code n} nodes to
     * receive the signal, return {@code -1}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= k <= n <= 100}</li>
     * 	<li>{@code 1 <= times.length <= 6000}</li>
     * 	<li>{@code times[i].length == 3}</li>
     * 	<li>{@code 1 <= u}<sub>i</sub>{@code , v}<sub>i</sub>{@code  <= n}</li>
     * 	<li>{@code u}<sub>i</sub>{@code  != v}<sub>i</sub></li>
     * 	<li>{@code 0 <= w}<sub>i</sub>{@code  <= 100}</li>
     * 	<li>All the pairs {@code (u}<sub>i</sub>{@code , v}<sub>i</sub>{@code )} are <strong>unique</strong>. (i.e., no multiple edges.)</li>
     * </ul>
     *
     * @param times a list of travel times as directed edges
     * @param n a network of {@code n} nodes
     * @param k send a signal from a given node
     * @return <em>the <strong>minimum</strong> time it takes for all the</em> {@code n} <em>nodes to receive the
     * signal</em>
     */
    int networkDelayTime(int[][] times, int n, int k);
}
