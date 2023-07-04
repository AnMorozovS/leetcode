package com.anmorozov.leetcode.problems.solutions.p0137;

import java.util.HashMap;
import java.util.Map;

public class MyApproach1 implements Solution {

    @Override
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> usedNumbers = new HashMap<>();
        for (Integer number : nums) {
            int count = usedNumbers.getOrDefault(number, 0);
            count += 1;
            usedNumbers.put(number, count);
        }
        for (Map.Entry<Integer, Integer> entry : usedNumbers.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
