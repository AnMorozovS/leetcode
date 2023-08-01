package com.anmorozov.leetcode.problems.solutions.p1192;

import java.util.List;

/**
 * <p><strong>1192.</strong> Critical Connections in a Network.</p>
 * <em>Hard</em>
 */
public interface Solution {

    /**
     * <p>There are {@code n} servers numbered from {@code 0} to {@code n - 1} connected by undirected server-to-server
     * {@code connections} forming a network where
     * {@code connections[i] = [a}<sub>i</sub>{@code , b}<sub>i</sub>{@code ]} represents a connection between servers
     * {@code a}<sub>i</sub> and {@code b}<sub>i</sub>. Any server can reach other servers directly or indirectly
     * through the network.</p>
     *
     * <p>A <em>critical connection</em> is a connection that, if removed, will make some servers unable to reach some
     * other server.</p>
     *
     * <p>Return all critical connections in the network in any order.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 2 <= n <= 10}<sup>5</sup></li>
     * 	<li>{@code n - 1 <= connections.length <= 10}<sup>5</sup></li>
     * 	<li>{@code 0 <= a}<sub>i</sub>{@code , b}<sub>i</sub>{@code  <= n - 1}</li>
     * 	<li>{@code a}<sub>i</sub>{@code  != b}<sub>i</sub></li>
     * 	<li>There are no repeated connections.</li>
     * </ul>
     *
     * @param n {@code n} servers numbered from {@code 0} to {@code n - 1}
     * @param connections forming a network
     * @return Return all critical connections in the network in any order.
     */
    List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections);
}
