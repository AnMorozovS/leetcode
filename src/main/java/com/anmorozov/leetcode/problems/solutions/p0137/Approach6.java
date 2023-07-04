package com.anmorozov.leetcode.problems.solutions.p0137;

/**
 * Approach 6: Boolean Algebra and Karnaugh Map
 */
public class Approach6 implements Solution {

    @Override
    public int singleNumber(int[] nums) {

        // Count (modulo 3) bits
        int msb = 0;
        int lsb = 0;

        // Process Every Num and update count bits
        for (int num : nums) {
            int newLsb = (~msb & ~lsb & num) | (lsb & ~num);
            int newMsb = (lsb & num) | (msb & ~num);
            lsb = newLsb;
            msb = newMsb;
        }

        // Return lsb as answer
        return lsb;
    }
}
