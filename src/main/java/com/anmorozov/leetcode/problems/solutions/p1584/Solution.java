package com.anmorozov.leetcode.problems.solutions.p1584;

/**
 * <p><b>1584.</b> Min Cost to Connect All Points.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>You are given an array {@code points} representing integer coordinates of some points on a 2D-plane, where
     * points[i] = [x<sub>i</sub>, y<sub>i</sub>].</p>
     *
     * <p>The cost of connecting two points [x<sub>i</sub>, y<sub>i</sub>] and [x<sub>j</sub>, y<sub>j</sub>] is the
     * <strong>manhattan distance</strong> between them: |x<sub>i</sub> - x<sub>j</sub>| + |y<sub>i</sub> -
     * y<sub>j</sub>|, where |val| denotes the absolute value of val.</p>
     *
     * <p>Return <em>the minimum cost to make all points connected.</em> All points are connected if there is
     * <strong>exactly one</strong> simple path between any two points.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= points.length <= 1000}</li>
     * 	<li>{@code -10}<sup>6</sup>{@code  <= x}<sub>i</sub>{@code , y}<sub>i</sub>{@code  <= 10}<sup>6</sup></li>
     * 	<li>All pairs (x<sub>i</sub>, y<sub>i</sub>) are distinct.</li>
     * </ul>
     *
     * @param points representing integer coordinates of some points on a 2D-plane
     * @return <em>the minimum cost to make all points connected.</em>
     */
    int minCostConnectPoints(int[][] points);

}
