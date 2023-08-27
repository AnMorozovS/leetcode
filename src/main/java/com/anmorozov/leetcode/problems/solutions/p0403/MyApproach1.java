package com.anmorozov.leetcode.problems.solutions.p0403;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MyApproach1 implements Solution {

    Map<Integer, Map<Integer, Boolean>> cache;
    private Set<Integer> stones;
    private int lastStone;

    @Override
    public boolean canCross(int[] stones) {
        this.stones = Arrays.stream(stones).boxed().collect(Collectors.toSet());
        this.lastStone = stones[stones.length - 1];
        this.cache = new HashMap<>();
        return useCache(stones[0], 1);
    }

    private boolean useCache(int fromStone, int jumpLength) {
        Map<Integer, Boolean> levelTwo = this.cache.computeIfAbsent(fromStone, HashMap::new);
        if (!levelTwo.containsKey(jumpLength)) {
            levelTwo.put(jumpLength, jump(fromStone, jumpLength));
        }
        return this.cache.get(fromStone).get(jumpLength);
    }

    private boolean jump(int fromStone, int jumpLength) {
        if (jumpLength < 1) {
            return false;
        }
        int currentStone = fromStone + jumpLength;
        if (currentStone == lastStone) {
            return true;
        } else if (currentStone > lastStone) {
            return false;
        }
        if (!stones.contains(currentStone)) {
            return false;
        } else {
            return useCache(currentStone, jumpLength + 1) || useCache(currentStone, jumpLength) || useCache(currentStone, jumpLength - 1);
        }
    }

}
