package com.anmorozov.leetcode.problems.solutions.p0787;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * My Approach 1: use Bellman Ford Algorithm.
 */
public class MyApproach1 implements Solution {

    @Override
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        if (src == dst) {
            return 0;
        }
        Map<Integer, List<Flight>> destinationsByCity = new HashMap<>();
        for (int[] flight : flights) {
            destinationsByCity.computeIfAbsent(flight[0], ArrayList::new).add(new Flight(flight));
        }
        Map<Integer, Integer> cheapestPrices = new HashMap<>();
        cheapestPrices.put(src, 0);

        for (int stop = 0; stop <= k; stop++) {
            Map<Integer, Integer> newArray = new HashMap<>();
            for (Map.Entry<Integer, Integer> priceByCity : cheapestPrices.entrySet()) {
                int city = priceByCity.getKey();
                int currentPrice = priceByCity.getValue();
                for (Flight flight : destinationsByCity.getOrDefault(city, List.of())) {
                    newArray.put(flight.to(), Math.min(newArray.getOrDefault(flight.to(),
                                    cheapestPrices.getOrDefault(flight.to(), Integer.MAX_VALUE)),
                            currentPrice + flight.price()));
                }

            }
            cheapestPrices = newArray;
        }
        return cheapestPrices.getOrDefault(dst, -1);
    }
}
