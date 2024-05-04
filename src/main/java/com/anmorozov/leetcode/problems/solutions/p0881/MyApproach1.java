package com.anmorozov.leetcode.problems.solutions.p0881;

import java.util.Arrays;
import java.util.NavigableMap;
import java.util.Optional;
import java.util.TreeMap;

public class MyApproach1 implements Solution {

    @Override
    public int numRescueBoats(int[] people, int limit) {

        NavigableMap<Integer, Integer> boatsByCapacity = new TreeMap<>();
        Arrays.sort(people);
        int fullBoatsCount = 0;
        for (int i = people.length - 1; i >= 0; i--) {
            int weightNeed = people[i];
            Integer oldBoatCapacity = boatsByCapacity.ceilingKey(weightNeed);
            if (oldBoatCapacity == null) {
                boatsByCapacity.compute(limit - weightNeed, (k, v) -> v == null ? 1 : v + 1);
            } else {
                boatsByCapacity.compute(oldBoatCapacity, (k, v) -> Optional.ofNullable(v).orElse(1) == 1 ? null : v - 1);
                fullBoatsCount++;
            }
        }
        return fullBoatsCount + boatsByCapacity.values().stream().reduce(0, Integer::sum);
    }
}
