package com.anmorozov.leetcode.problems.solutions.p1466;

/**
 * <p><strong>1466.</strong> Reorder Routes to Make All Paths Lead to the City Zero.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>There are {@code n} cities numbered from {@code 0} to {@code n - 1} and {@code n - 1} roads such that there
     * is
     * only one way to travel between two different cities (this network form a tree). Last year, The ministry of
     * transport decided to orient the roads in one direction because they are too narrow.</p>
     *
     * <p>Roads are represented by {@code connections} where {@code connections[i] = [a}<sub>i</sub>{@code ,
     * b}<sub>i</sub>{@code ]} represents a road from city {@code a}<sub>i</sub> to city {@code b}<sub>i</sub>.</p>
     *
     * <p>This year, there will be a big event in the capital (city {@code 0}), and many people want to travel to this
     * city.</p>
     *
     * <p>Your task consists of reorienting some roads such that each city can visit the city {@code 0}. Return the
     * <strong>minimum</strong> number of edges changed.</p>
     *
     * <p>It's <strong>guaranteed</strong> that each city can reach city {@code 0} after reorder.</p>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     * 	<li>{@code 2 <= n <= 5 * 10}<sup>4</sup></li>
     * 	<li>{@code connections.length == n - 1}</li>
     * 	<li>{@code connections[i].length == 2}</li>
     * 	<li>{@code 0 <= a}<sub>i</sub>{@code , b}<sub>i</sub>{@code  <= n - 1}</li>
     * 	<li>{@code a}<sub>i</sub>{@code  != b}<sub>i</sub></li>
     * </ul>
     *
     * @param n cities
     * @param connections roads
     * @return <strong>minimum</strong> number of edges changed
     */
    int minReorder(int n, int[][] connections);

}
