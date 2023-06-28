package com.anmorozov.leetcode.problems.solutions.p1971;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p><b>1971.</b> Find if Path Exists in Graph</p>
 * <i>Easy</i>
 */
public interface Solution {

    /**
     * <p>There is a <strong>bi-directional</strong> graph with {@code n} vertices, where each vertex is labeled from
     * {@code 0} to {@code n - 1} (<strong>inclusive</strong>). The edges in the graph are represented as a 2D integer
     * array {@code edges}, where each {@code edges[i] = [u}<sub>i</sub>{@code , v}<sub>i</sub>] denotes a
     * bi-directional edge between vertex {@code u}<sub>i</sub> and vertex {@code v}<sub>i</sub>. Every vertex pair is
     * connected by <strong>at most one</strong> edge, and no vertex has an edge to itself.</p>
     *
     * <p>You want to determine if there is a <strong>valid path</strong> that exists from vertex {@code source} to
     * vertex {@code destination}.</p>
     *
     * <p>Given {@code edges} and the integers {@code n}, {@code source}, and {@code destination}, return {@code
     * true}<em> if there is a <strong>valid path</strong> from </em>{@code source}<em> to </em>{@code destination}<em>,
     * or </em>{@code false}<em> otherwise</em><em>.</em></p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= n <= 2 * 10}<sup>5</sup></li>
     * 	<li>{@code 0 <= edges.length <= 2 * 10}<sup>5</sup></li>
     * 	<li>{@code edges[i].length == 2}</li>
     * 	<li>{@code 0 <= u}<sub>{@code i}</sub>{@code , v}<sub>i</sub>{@code  <= n - 1}</li>
     * 	<li>{@code u}<sub>i</sub>{@code  != v}<sub>i</sub></li>
     * 	<li>{@code 0 <= source, destination <= n - 1}</li>
     * 	<li>There are no duplicate edges.</li>
     * 	<li>There are no self edges.</li>
     * </ul>
     *
     * @param n graph with {@code n} vertices
     * @param edges a 2D integer array {@code edges}
     * @param source source
     * @param destination destination
     * @return {@code true}<em> if there is a <strong>valid path</strong> from </em>{@code source}<em> to </em>{@code
     * destination}<em>, or </em>{@code false}<em> otherwise</em><em>.</em>
     */
    boolean validPath(int n, int[][] edges, int source, int destination);

    default Map<Integer, List<Integer>> getGraph(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            graph.computeIfAbsent(a, val -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, val -> new ArrayList<>()).add(a);
        }
        return graph;
    }
}
