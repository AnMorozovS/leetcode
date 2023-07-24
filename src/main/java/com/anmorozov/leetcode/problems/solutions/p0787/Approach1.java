package com.anmorozov.leetcode.problems.solutions.p0787;

/**
 * Approach 1: Bellman Ford Algorithm
 */
public class Approach1 implements Solution {

    @Override
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        if (src == dst) {
            return 0;
        }

        int[] previous = new int[n];
        int[] current = new int[n];
        for (int i = 0; i < n; i++) {
            previous[i] = Integer.MAX_VALUE;
            current[i] = Integer.MAX_VALUE;
        }
        previous[src] = 0;
        for (int i = 1; i < k + 2; i++) {
            current[src] = 0;
            for (int[] flight : flights) {
                int previousFlight = flight[0];
                int currentFlight = flight[1];
                int cost = flight[2];

                if (previous[previousFlight] < Integer.MAX_VALUE) {
                    current[currentFlight] = Math.min(current[currentFlight],
                            previous[previousFlight] + cost);
                }
            }
            previous = current.clone();
        }
        return current[dst] == Integer.MAX_VALUE ? -1 : current[dst];
    }
}
