package com.anmorozov.leetcode.problems.solutions.p0787;

/**
 * 787. Cheapest Flights Within K Stops.
 */
public interface Solution {

    /**
     * <p>There are {@code n} cities connected by some number of flights. You are given an array {@code flights} where
     * flights[i] = [from<sub>i</sub>, to<sub>i</sub>, price<sub>i</sub>] indicates that there is a flight from city
     * {@code from}<sub>i</sub> to city {@code to}<sub>i</sub> with cost {@code price}<sub>i</sub>.</p>
     *
     * <p>You are also given three integers {@code src}, {@code dst}, and {@code k}, return <em><strong>the cheapest
     * price</strong> from </em>{@code src}<em> to </em>{@code dst}<em> with at most </em>{@code k}<em> stops. </em>If
     * there is no such route, return<em> </em>{@code -1}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= n <= 100}</li>
     * 	<li>{@code 0 <= flights.length <= (n * (n - 1) / 2)}</li>
     * 	<li>{@code flights[i].length == 3}</li>
     * 	<li>{@code 0 <= from}<sub>i</sub>{@code , to}<sub>i</sub>{@code  < n}</li>
     * 	<li>{@code from}<sub>i</sub>{@code  != to}<sub>i</sub></li>
     * 	<li>{@code 1 <= price}<sub>i</sub>{@code  <= 10}<sup>4</sup></li>
     * 	<li>There will not be any multiple flights between two cities.</li>
     * 	<li>{@code 0 <= src, dst, k < n}</li>
     * 	<li>{@code src != dst}</li>
     * </ul>
     *
     * @param n cities
     * @param flights an array
     * @param src source
     * @param dst destination
     * @param k stops number
     * @return the cheapest price
     */
    int findCheapestPrice(int n, int[][] flights, int src, int dst, int k);
}
