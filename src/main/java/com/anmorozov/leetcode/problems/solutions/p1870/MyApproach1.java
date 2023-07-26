package com.anmorozov.leetcode.problems.solutions.p1870;

/**
 * My Approach 1: Binary Search
 */
public class MyApproach1 implements Solution {

    double timeRequired(int[] dist, long speed) {
        double totalTime = 0.0;
        for (int i = 0; i < dist.length; i++) {
            double time = (double) dist[i] / (double) speed;
            totalTime += (i == dist.length - 1 ? time : Math.ceil(time));
        }
        return totalTime;
    }

    @Override
    public int minSpeedOnTime(int[] dist, double hour) {
        long minSpeed = 1;
        long maxSpeed = Integer.MAX_VALUE;
        long resultSpeed = -1;
        while (minSpeed <= maxSpeed) {
            long mid = (minSpeed + maxSpeed) / 2;
            if (timeRequired(dist, mid) <= hour) {
                resultSpeed = mid;
                maxSpeed = mid - 1;
            } else {
                minSpeed = mid + 1;
            }
        }
        return (int) resultSpeed;
    }
}
