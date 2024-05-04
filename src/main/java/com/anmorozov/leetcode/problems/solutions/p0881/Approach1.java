package com.anmorozov.leetcode.problems.solutions.p0881;

import java.util.Arrays;

/**
 * Approach 1: Greedy (Two Pointer)
 */
public class Approach1 implements Solution {
    @Override
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int ans = 0;

        while (i <= j) {
            ans++;
            if (people[i] + people[j] <= limit)
                i++;
            j--;
        }

        return ans;
    }
}
