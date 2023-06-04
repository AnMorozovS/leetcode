package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.problems.algorithms.UnionFind;

public class P0261 {

    public boolean validTree(int n, int[][] edges) {
        UnionFind unionFind = new UnionFind(n);
        for (int[] edge : edges) {
            int i = edge[0];
            int j = edge[1];
            if (unionFind.find(i) != unionFind.find(j)) {
                unionFind.union(i, j);
            } else {
                return false;
            }
        }
        return unionFind.getCount() == 1;
    }
}
