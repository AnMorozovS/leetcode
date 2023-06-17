package com.anmorozov.leetcode.problems.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class P1187 {

    private NavigableSet<Integer> arr2Set;

    private int[] array;

    private Map<Integer, Map<Integer, Integer>> cash;

    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        array = arr1;
        arr2Set = Arrays.stream(arr2).boxed().collect(TreeSet::new, Set::add, (x, y) -> {
        });

        cash = new HashMap<>();
        return cash(0, Integer.MIN_VALUE);
    }

    public int recurseArrayIncreasing(int i, int previousValue) {
        if (i >= array.length) {
            return 0;
        }
        int currentValue = array[i];
        int tmp1 = -1;
        if (currentValue > previousValue) {
            tmp1 = cash(i + 1, currentValue);
        }

        int tmp2 = -1;
        Integer minArr2Element = arr2Set.higher(previousValue);
        if (minArr2Element != null) {
            tmp2 = cash(i + 1, minArr2Element);
            if (tmp2 != -1) {
                tmp2 = tmp2 + 1;
            }
        }
        if (tmp1 == -1 && tmp2 == -1) {
            return -1;
        } else if (tmp1 == -1) {
            return tmp2;
        } else if (tmp2 == -1) {
            return tmp1;
        } else {
            return Math.min(tmp1, tmp2);
        }
    }

    public int cash(int i, int previousValue) {
        Map<Integer, Integer> currentMap;
        if (cash.containsKey(i)) {
            currentMap = cash.get(i);
            if (currentMap.containsKey(previousValue)) {
                return currentMap.get(previousValue);
            }
        }
        int currenCounter = recurseArrayIncreasing(i, previousValue);
        cash.computeIfAbsent(i, HashMap::new).put(previousValue, currenCounter);
        return currenCounter;
    }


}
