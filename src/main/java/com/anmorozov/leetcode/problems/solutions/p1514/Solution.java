package com.anmorozov.leetcode.problems.solutions.p1514;

/**
 * <p><b>1514.</b> Path with Maximum Probability</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>You are given an undirected weighted graph of  {@code n} nodes (0-indexed), represented by an edge list where
     * {@code edges[i] = [a, b]} is an undirected edge connecting the nodes  {@code a} and  {@code b} with a probability
     * of success of traversing that edge  {@code succProb[i]}.</p>
     *
     * <p>Given two nodes {@code start} and {@code end}, find the path with the maximum probability of success to go
     * from {@code start} to {@code end} and return its success probability.</p>
     *
     * <p>If there is no path from  {@code start} to  {@code end}, <strong>return 0</strong>. Your answer will be
     * accepted if it differs from the correct answer by at most <strong>1e-5</strong>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     * <li> {@code 2 <= n <= 10^4}</li>
     * <li> {@code 0 <= start, end < n}</li>
     * <li> {@code start != end}</li>
     * <li> {@code 0 <= a, b < n}</li>
     * <li> {@code a != b}</li>
     * <li> {@code 0 <= succProb.length == edges.length <= 2*10^4}</li>
     * <li> {@code 0 <= succProb[i] <= 1}</li>
     * <li>There is at most one edge between every two nodes.</li>
     * </ul>
     *
     * @param n nodes in graph
     * @param edges an edge list where {@code edges[i] = [a, b]} is an undirected edge connecting the nodes  {@code a}
     * and  {@code b}
     * @param succProb a probability of success of traversing that edge  {@code succProb[i]}.
     * @param start node from
     * @param end node to
     * @return the path with the maximum probability of success to go from {@code start} to {@code end} and return its
     * success probability.
     */
    double maxProbability(int n, int[][] edges, double[] succProb, int start, int end);
}
