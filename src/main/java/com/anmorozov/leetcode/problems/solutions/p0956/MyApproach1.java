package com.anmorozov.leetcode.problems.solutions.p0956;

import java.util.HashMap;
import java.util.Map;

public class MyApproach1 implements Solution {

    private int[] rods;
    private Map<Integer, Map<Integer, Map<Integer, Integer>>> cashMap;

    @Override
    public int tallestBillboard(int[] rods) {
        this.rods = rods;
        this.cashMap = new HashMap<>();
        return useCash(0, 0, 0);
    }

    public int useCash(int index, int firstRod, int secondRod) {
        Map<Integer, Integer> map = this.cashMap.computeIfAbsent(index, HashMap::new)
                .computeIfAbsent(firstRod, HashMap::new);
        if (!map.containsKey(secondRod)) {
            map.put(secondRod, tallestBillboard(index, firstRod, secondRod));
        }
        return map.get(secondRod);
    }

    public int tallestBillboard(int index, int firstRod, int secondRod) {
        if (firstRod > secondRod) {
            int tmp = firstRod;
            firstRod = secondRod;
            secondRod = tmp;
        }

        if (index >= rods.length) {
            if (firstRod != secondRod) {
                return 0;
            } else {
                return firstRod;
            }
        }
        int rod = rods[index];
        int sum1 = useCash(index + 1, firstRod + rod, secondRod);
        int sum2 = useCash(index + 1, firstRod, secondRod + rod);
        int sum3 = useCash(index + 1, firstRod, secondRod);
        return Math.max(sum1, Math.max(sum2, sum3));
    }
}
