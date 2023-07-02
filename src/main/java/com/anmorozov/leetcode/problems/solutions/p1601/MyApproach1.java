package com.anmorozov.leetcode.problems.solutions.p1601;

import java.util.Arrays;

public class MyApproach1 implements Solution {

    private int buildingNumber;
    private int[][] requests;

    @Override
    public int maximumRequests(int n, int[][] requests) {
        this.buildingNumber = n;
        this.requests = requests;

        return recurse(0, new int[0][]);
    }

    private int recurse(int index, int[][] requests) {
        if (index == this.requests.length) {
            if (maxDifference(requests)) {
                return requests.length;
            } else {
                return 0;
            }
        }
        int[][] newArray1 = Arrays.copyOf(requests, requests.length + 1);
        newArray1[requests.length] = this.requests[index];
        int result1 = recurse(index + 1, newArray1);
        int[][] newArray2 = Arrays.copyOf(requests, requests.length);
        int result2 = recurse(index + 1, newArray2);
        return Math.max(result1, result2);
    }

    private boolean maxDifference(int[][] requests) {
        int[] buildingDiff = new int[buildingNumber];
        for (int[] request : requests) {
            buildingDiff[request[0]] -= 1;
            buildingDiff[request[1]] += 1;
        }
        int sum = 0;
        for (int employersInBuilding : buildingDiff) {
            if (employersInBuilding > 0) {
                sum += employersInBuilding;
            }
        }
        return sum == 0;
    }
}
