package com.anmorozov.leetcode.problems.solutions.p0518;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * My Approach 1 : Use cache
 */
public class MyApproach1 implements Solution {

    private int[] coins;
    private Map<Integer, Map<Integer, Integer>> cache;


    public int useCache(int coinsSum, int minCoinIndex) {
        Map<Integer, Integer> secondLevel = cache.computeIfAbsent(coinsSum, HashMap::new);
        if (!secondLevel.containsKey(minCoinIndex)) {
            secondLevel.put(minCoinIndex, changeNext(coinsSum, minCoinIndex));
        }
        return cache.get(coinsSum).get(minCoinIndex);
    }


    @Override
    public int change(int amount, int[] coins) {
        if (amount == 0) {
            return 1;
        }
        cache = new HashMap<>();
        Arrays.sort(coins);
        this.coins = coins;
        return useCache(amount, 0);

    }

    public int changeNext(int coinsSum, int minCoinIndex) {
        int result = 0;
        for (int i = minCoinIndex; i < this.coins.length; i++) {
            if (coinsSum == coins[i]) {
                result += 1;
            } else if (coinsSum > coins[i]) {
                result += useCache(coinsSum - coins[i], i);
            }
        }
        return result;

    }

}
