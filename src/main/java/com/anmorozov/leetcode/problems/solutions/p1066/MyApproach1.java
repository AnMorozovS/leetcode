package com.anmorozov.leetcode.problems.solutions.p1066;

/**
 * My Approach 1 :
 */
public class MyApproach1 implements Solution {

    private int[][] workerBikeDistances;
    private int minDistance;

    @Override
    public int assignBikes(int[][] workers, int[][] bikes) {
        this.workerBikeDistances = new int[workers.length][bikes.length];
        for (int i = 0; i < workers.length; i++) {
            for (int j = 0; j < bikes.length; j++) {
                workerBikeDistances[i][j] = findDistance(workers[i], bikes[j]);
            }
        }
        this.minDistance = Integer.MAX_VALUE;
        getMinDistance(0, 0, 0);
        return this.minDistance;
    }

    public void getMinDistance(int passedDistance, int lastWorkerIndex, int mask) {
        if (passedDistance >= this.minDistance) {
            return;
        }
        if (lastWorkerIndex >= this.workerBikeDistances.length) {
            this.minDistance = passedDistance;
            return;
        }
        for (int bikeNumber = 0; bikeNumber < this.workerBikeDistances[lastWorkerIndex].length; bikeNumber++) {
            int newPassedDistance = passedDistance + this.workerBikeDistances[lastWorkerIndex][bikeNumber];
            if ((mask & (1 << bikeNumber)) == 0) {
                getMinDistance(newPassedDistance, lastWorkerIndex + 1, mask | (1 << bikeNumber));
            }
        }
    }
}
