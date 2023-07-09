package com.anmorozov.leetcode.problems.solutions.p2272;

import java.util.HashMap;
import java.util.Map;

public class MyApproach1 implements Solution {

    private Map<String, Integer> cash;

    @Override
    public int largestVariance(String s) {
        cash = new HashMap<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                int result = useCash(s.substring(i, j));
                if (result > max) {
                    max = result;
                }
            }
        }
        return max;
    }

    private int useCash(String s) {
        if (!cash.containsKey(s)) {
            cash.put(s, getMaxVariance(s));
        }
        return cash.get(s);
    }

    private int getMaxVariance(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (char aChar : chars) {
            int count = map.getOrDefault(aChar, 0);
            map.put(aChar, count + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (min > value) {
                min = value;
            }
            if (max < value) {
                max = value;
            }
        }
        return max - min;
    }
}
