package com.anmorozov.leetcode.problems.solutions.p0137;

/**
 * Approach 5: Equation for Bitmask
 */
public class Approach5 implements Solution {

    @Override
    public int singleNumber(int[] nums) {

        // Initialize seenOnce and seenTwice to 0
        int seenOnce = 0;
        int seenTwice = 0;

        // Iterate through nums
        for (int num : nums) {
            // Update using derived equations
            seenOnce = (seenOnce ^ num) & (~seenTwice);
            seenTwice = (seenTwice ^ num) & (~seenOnce);
        }

        // Return integer which appears exactly once
        return seenOnce;
    }
}
