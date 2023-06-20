package com.anmorozov.leetcode.problems.solutions;

/**
 * <h3>2090. K Radius Subarray Averages.</h3>
 * <p>Medium</p>
 */
public class P2090 {

    /**
     * <p>You are given a <b>0-indexed</b> array nums of {@code n} integers, and an integer {@code k}.</p>
     *
     * <p>The <b>k-radius average</b> for a subarray of {@code nums} <b>centered</b> at some index {@code i} with the
     * <b>radius</b> {@code k} is the average of <b>all</b> elements in nums between the indices {@code i - k} and
     * {@code i + k} (<b>inclusive</b>). If there are less than {@code k} elements before <b>or</b> after the index
     * {@code i}, then the k-radius average is {@code -1}.</p>
     *
     * <p>Build and return an array {@code avgs} of length {@code n} where {@code avgs[i]} is the <b>k-radius
     * average</b> for the subarray centered at index {@code i}.</p>
     *
     * <p>The <b>average</b> of {@code x} elements is the sum of the {@code x} elements divided by {@code x}, using
     * <b>integer division</b>. The integer division truncates toward zero, which means losing its fractional part.</p>
     *
     * @param nums <b>0-indexed</b> array nums of {@code n} integers
     * @param k radius average
     * @return {@code avgs} of length {@code n} where {@code avgs[i]} is the k-radius average for the subarray centered
     * at index {@code i}.
     */
    public int[] getAverages(int[] nums, int k) {
        long sumOfRadius = 0;
        int[] avgs = new int[nums.length];
        int radius = 2 * k;
        for (int i = 0; i < nums.length; i++) {
            avgs[i] = -1;
            sumOfRadius = sumOfRadius + nums[i];
            if (i > radius) {
                sumOfRadius = sumOfRadius - nums[i - radius - 1];
            }
            if (i >= radius) {
                avgs[i - k] = (int) (sumOfRadius / (radius + 1));
            }
        }
        return avgs;
    }
}
