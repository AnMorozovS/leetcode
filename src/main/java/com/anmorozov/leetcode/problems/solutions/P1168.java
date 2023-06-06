package com.anmorozov.leetcode.problems.solutions;

import java.util.HashSet;
import java.util.Set;

public class P1168 {

    public static final int WELL_INDEX = 0;
    private int[] connections;
    private int[] connectionCost;

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        connections = new int[n + 1];
        connectionCost = new int[n + 1];
        for (int i = 0; i < wells.length; i++) {
            connections[i + 1] = WELL_INDEX;
            connectionCost[i + 1] = wells[i];
        }
        for (int[] pipe : pipes) {
            union(pipe[0], pipe[1], pipe[2]);
        }
        int result = 0;
        for (int j : connectionCost) {
            result = result + j;
        }
        return result;
    }

    public void union(int first, int second, int cost) {

        int last = getFirstCommonIndex(first, second);
        int firstMaxCostIndex = getMaxCostIndex(first, first, last);
        int secondMaxCostIndex = getMaxCostIndex(second, second, last);
        int maxCostIndex;
        int attachedIndex;
        int toAttachIndex;
        if (connectionCost[firstMaxCostIndex] >= connectionCost[secondMaxCostIndex]) {
            maxCostIndex = firstMaxCostIndex;
            attachedIndex = first;
            toAttachIndex = second;
        } else {
            maxCostIndex = secondMaxCostIndex;
            attachedIndex = second;
            toAttachIndex = first;
        }
        if (cost < connectionCost[maxCostIndex]) {
            reverse(toAttachIndex, attachedIndex, cost, maxCostIndex);
        }
    }

    public int getMaxCostIndex(int current, int maxCostIndex, int last) {
        if (current == last) {
            return maxCostIndex;
        }
        int next = connections[current];
        if (connectionCost[current] > connectionCost[maxCostIndex]) {
            maxCostIndex = current;
        }
        return getMaxCostIndex(next, maxCostIndex, last);
    }

    public int getFirstCommonIndex(int first, int second) {
        Set<Integer> set = new HashSet<>();
        int current = first;
        while (current != connections[current]) {
            set.add(current);
            current = connections[current];
        }
        current = second;
        while (current != connections[current]) {
            if (set.contains(current)) {
                return current;
            }
            current = connections[current];
        }
        return current;
    }

    public void reverse(int previous, int current, int cost, int maxCostIndex) {
        if (current != maxCostIndex) {
            reverse(current, connections[current], connectionCost[current], maxCostIndex);
        }
        connections[current] = previous;
        connectionCost[current] = cost;
    }
}
