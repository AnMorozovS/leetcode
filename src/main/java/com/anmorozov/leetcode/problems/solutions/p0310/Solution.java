package com.anmorozov.leetcode.problems.solutions.p0310;

import java.util.List;

/**
 * <p><strong>310.</strong> Minimum Height Trees</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>A tree is an undirected graph in which any two vertices are connected by <i>exactly</i> one path. In other
     * words, any connected graph without simple cycles is a tree.</p>
     *
     * <p>Given a tree of {@code n} nodes labelled from {@code 0} to {@code n - 1}, and an array of
     * {@code n - 1 edges} where {@code edges[i] = [a}<sub>i</sub>{@code , b}<sub>i</sub>{@code ]} indicates that there
     * is an undirected edge between the two nodes {@code a}<sub>i</sub> and {@code b}<sub>i</sub> in the tree, you can
     * choose any node of the tree as the root. When you select a node {@code x} as the root, the result tree has height
     * {@code h}. Among all possible rooted trees, those with minimum height (i.e. {@code min(h)}) are called
     * <strong>minimum height trees</strong> (MHTs).</p>
     *
     * <p>Return <em>a list of all <strong>MHTs'</strong> root labels</em>. You can return the answer in <strong>any
     * order</strong>.</p>
     *
     * <p>The <strong>height</strong> of a rooted tree is the number of edges on the longest downward path between the
     * root and a leaf.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= n <= 2 * 10}<sup>4</sup></li>
     * 	<li>{@code edges.length == n - 1}</li>
     * 	<li>{@code 0 <= a}<sub>i</sub>{@code , b}<sub>i</sub>{@code  < n}</li>
     * 	<li>{@code a}<sub>i</sub>{@code  != b}<sub>i</sub></li>
     * 	<li>All the pairs {@code (a}<sub>i</sub>{@code , b}<sub>i</sub>{@code )} are distinct.</li>
     * 	<li>The given input is <strong>guaranteed</strong> to be a tree and there will be <strong>no repeated</strong> edges.</li>
     * </ul>
     *
     * @param n nodes of tree
     * @param edges array of edges
     * @return <em>a list of all <strong>MHTs'</strong> root labels</em>
     */
    List<Integer> findMinHeightTrees(int n, int[][] edges);
}
