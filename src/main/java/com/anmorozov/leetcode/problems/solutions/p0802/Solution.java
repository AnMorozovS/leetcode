package com.anmorozov.leetcode.problems.solutions.p0802;

import java.util.List;

/**
 * <p><b>802.</b> Find Eventual Safe States.</p>
 */
public interface Solution {

    /**
     * <p>There is a directed graph of {@code n} nodes with each node labeled from {@code 0} to {@code n - 1}. The
     * graph is represented by a <strong>0-indexed</strong> 2D integer array {@code graph} where {@code graph[i]} is an
     * integer array of nodes adjacent to node {@code i}, meaning there is an edge from node {@code i} to each node in
     * {@code graph[i]}.</p>
     *
     * <p>A node is a <strong>terminal node</strong> if there are no outgoing edges. A node is a <strong>safe
     * node</strong> if every possible path starting from that node leads to a <strong>terminal node</strong> (or
     * another safe node).</p>
     *
     * <p>Return <em>an array containing all the <strong>safe nodes</strong> of the graph</em>. The answer should be
     * sorted in <strong>ascending</strong> order.</p>
     *
     * <p>&nbsp;</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code n == graph.length}</li>
     * 	<li>{@code 1 <= n <= 10}<sup>4</sup></li>
     * 	<li>{@code 0 <= graph[i].length <= n}</li>
     * 	<li>{@code 0 <= graph[i][j] <= n - 1}</li>
     * 	<li>{@code graph[i]} is sorted in a strictly increasing order.</li>
     * 	<li>The graph may contain self-loops.</li>
     * 	<li>The number of edges in the graph will be in the range {@code [1, 4 * 10}<sup>4</sup>].</li>
     * </ul>
     *
     * @param graph a <strong>0-indexed</strong> 2D integer array {@code graph} where {@code graph[i]} is integer array
     * of nodes adjacent to node {@code i}
     * @return <em>an array containing all the <strong>safe nodes</strong> of the graph</em>
     */
    List<Integer> eventualSafeNodes(int[][] graph);
}
