package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.problems.algorithms.UnionFind;
import java.util.Arrays;
import java.util.Comparator;

public class P1101 {

    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs, Comparator.comparingInt(a -> a[0]));
        UnionFind unionFind = new UnionFind(n);
        for (int[] log : logs) {
            int timestamp = log[0];
            int i = log[1];
            int j = log[2];
            if (unionFind.find(i) != unionFind.find(j)) {
                unionFind.union(i, j);
            }
            if (unionFind.getCount() == 1) {
                return timestamp;
            }
        }
        return -1;
    }
}
