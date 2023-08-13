package com.anmorozov.leetcode.problems.solutions.p2343;

import com.anmorozov.leetcode.common.Cache;
import java.util.Arrays;

/**
 * My Approach 1 : radix sort
 */
public class MyApproach1 implements Solution {

    private String[] nums;
    private int wordLength;

    @Override
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        this.nums = nums;
        this.wordLength = nums[0].length();
        Cache<Integer, TrimmedNumber[]> cache = new Cache<>();

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int trim = queries[i][1];
            int kIndex = queries[i][0] - 1;
            result[i] = cache.useCache(trim, this::getSortedTrimmedArray)[kIndex].index();
        }
        return result;
    }

    private TrimmedNumber[] getSortedTrimmedArray(int trim) {
        TrimmedNumber[] result = new TrimmedNumber[nums.length];
        for (int i = 0; i < nums.length; i++) {
            String value = nums[i].substring(wordLength - trim);
            result[i] = new TrimmedNumber(i, value);
        }
        Arrays.sort(result);
        return result;
    }
}
