package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.problems.algorithms.UnionFind;

public class P0547 {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && unionFind.find(i) != unionFind.find(j)) {
                    unionFind.union(i, j);
                }
            }
        }
        return unionFind.getCount();
    }
}
