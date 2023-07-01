package com.anmorozov.leetcode.problems.solutions.p2305;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyApproach1 implements Solution {

    private int childrenCount;
    private int[] cookiesBags;
    private Map<Integer, Map<String, Integer>> cash;

    @Override
    public int distributeCookies(int[] cookies, int k) {
        this.childrenCount = k;
        this.cookiesBags = cookies;
        this.cash = new HashMap<>();
        int[] childBags = new int[k];
        return useCash(0, childBags);
    }

    private int useCash(int index, int[] childBags) {
        String keyArray = Arrays.toString(childBags);
        Map<String, Integer> map = cash.computeIfAbsent(index, HashMap::new);
        if (!map.containsKey(keyArray)) {
            int result = distribute(index, childBags);
            map.put(keyArray, result);
        }
        return cash.get(index).get(keyArray);
    }


    private int distribute(int index, int[] childBags) {
        if (index >= cookiesBags.length) {
            int maxInBag = 0;
            for (int cookiesInBag : childBags) {
                if (maxInBag < cookiesInBag) {
                    maxInBag = cookiesInBag;
                }
            }
            return maxInBag;
        }

        int max = Integer.MAX_VALUE;
        int tmp;
        for (int i = 0; i < childrenCount; i++) {
            int[] newArray = Arrays.copyOf(childBags, childBags.length);
            newArray[i] += cookiesBags[index];
            Arrays.sort(newArray);
            tmp = useCash(index + 1, newArray);
            max = Math.min(max, tmp);
        }
        return max;
    }
}
