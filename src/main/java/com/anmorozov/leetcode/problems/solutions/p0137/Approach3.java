package com.anmorozov.leetcode.problems.solutions.p0137;

import java.util.HashSet;
import java.util.Set;

/**
 * Approach 3: Mathematics
 */
public class Approach3 implements Solution {

    @Override
    public int singleNumber(int[] nums) {
        Set<Long> numsSet = new HashSet<>();
        long sumNums = 0;
        for (int num : nums) {
            numsSet.add((long) num);
            sumNums += num;
        }

        long sumSet = 0;
        for (long num : numsSet) {
            sumSet += num;
        }

        return (int) ((3 * sumSet - sumNums) / 2);
    }
}
