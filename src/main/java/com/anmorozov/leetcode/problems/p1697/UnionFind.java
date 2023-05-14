package com.anmorozov.leetcode.problems.p1697;

import java.util.HashMap;
import java.util.Map;

public class UnionFind {

    public final int[] group;
    public final int[] rank;

    private final Map<Integer, Integer> currentMap;

    public UnionFind(int size) {
        this.group = new int[size];
        this.rank = new int[size];
        this.currentMap = new HashMap<>();
        for (int i = 0; i < size; ++i) {
            this.group[i] = i;
            this.currentMap.put(i, i);
        }
    }

    public Map<Integer, Integer> getCurrentMap() {
        return Map.copyOf(this.currentMap);
    }


    public int find(int node) {
        int value = this.group[node];
        if (value != node) {
            value = find(value);
        }
        return value;
    }

    public boolean join(int node1, int node2) {
        int group1 = find(node1);
        int group2 = find(node2);

        // node1 and node2 already belong to same group.
        if (group1 == group2) {
            return false;
        }

        if (this.rank[group1] > this.rank[group2]) {
            this.group[group2] = group1;
            this.currentMap.put(group2, group1);
        } else if (this.rank[group1] < this.rank[group2]) {
            this.group[group1] = group2;
            this.currentMap.put(group1, group2);
        } else {
            this.group[group1] = group2;
            this.currentMap.put(group1, group2);
            rank[group2] += 1;
        }
        return true;
    }

    public boolean areConnected(int node1, int node2) {
        int group1 = find(node1);
        int group2 = find(node2);
        return group1 == group2;
    }
}
