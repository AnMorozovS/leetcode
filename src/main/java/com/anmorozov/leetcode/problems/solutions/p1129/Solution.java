package com.anmorozov.leetcode.problems.solutions.p1129;

/**
 * <p><strong>1129.</strong> Shortest Path with Alternating Colors.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>You are given an integer {@code n}, the number of nodes in a directed graph where the nodes are labeled from
     * {@code 0} to {@code n - 1}. Each edge is red or blue in this graph, and there could be self-edges and parallel
     * edges.</p>
     *
     * <p>You are given two arrays {@code redEdges} and {@code blueEdges} where:</p>
     *
     * <ul>
     * 	<li>{@code redEdges[i] = [a}<sub>i</sub>{@code , b}<sub>i</sub>{@code ]} indicates that there is a directed red edge from node {@code a}<sub>i</sub> to node {@code b}<sub>i</sub> in the graph, and</li>
     * 	<li>{@code blueEdges[j] = [u}<sub>j</sub>{@code , v}<sub>j</sub>{@code ]} indicates that there is a directed blue edge from node {@code u}<sub>j</sub> to node {@code v}<sub>j</sub> in the graph.</li>
     * </ul>
     *
     * <p>Return an array {@code answer} of length {@code n}, where each {@code answer[x]} is the length of the shortest path from node {@code 0} to node {@code x} such that the edge colors alternate along the path, or {@code -1} if such a path does not exist.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= n <= 100}</li>
     * 	<li>{@code 0 <= redEdges.length, blueEdges.length <= 400}</li>
     * 	<li>{@code redEdges[i].length == blueEdges[j].length == 2}</li>
     * 	<li>{@code 0 <= a}<sub>i</sub>{@code , b}<sub>i</sub>{@code , u}<sub>j</sub>{@code , v}<sub>j</sub>{@code  < n}</li>
     * </ul>
     *
     * @param n the number of nodes in a directed graph
     * @param redEdges indicates that there is a directed red edge from
     * @param blueEdges indicates that there is a directed blue edge from node
     * @return an array {@code answer} of length {@code n}, where each {@code answer[x]} is the length of the shortest
     * path from node {@code 0} to node {@code x} such that the edge colors alternate along the path, or {@code -1} if
     * such a path does not exist.
     */
    int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges);
}
