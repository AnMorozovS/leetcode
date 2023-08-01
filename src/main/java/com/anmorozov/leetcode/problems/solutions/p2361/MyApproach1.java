package com.anmorozov.leetcode.problems.solutions.p2361;

public class MyApproach1 implements Solution {

    private long[] result;
    private int[] regular;
    private int[] express;
    private int expressCost;

    @Override
    public long[] minimumCosts(int[] regular, int[] express, int expressCost) {
        this.result = new long[regular.length];
        this.regular = regular;
        this.express = express;
        this.expressCost = expressCost;
        nextStop(0, 0, expressCost);
        return result;
    }

    private void nextStop(int index, long previousRegular, long previousExpress) {
        if (index >= result.length) {
            return;
        }
        long currentExpress = Math.min(previousRegular + expressCost + express[index],
                previousExpress + express[index]);
        long currentRegular = Math.min(previousRegular + regular[index], currentExpress);
        this.result[index] = currentRegular;
        nextStop(index + 1, currentRegular, currentExpress);
    }

}
