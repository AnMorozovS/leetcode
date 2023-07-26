package com.anmorozov.leetcode.problems.solutions.p1970;

import java.util.Arrays;

class DisjointSetUnion {

    final int[] root;
    final int[] size;

    public DisjointSetUnion(int n) {
        root = new int[n];
        for (int i = 0; i < n; i++) {
            root[i] = i;
        }
        size = new int[n];
        Arrays.fill(size, 1);
    }

    public int find(int index) {
        if (root[index] != index) {
            root[index] = find(root[index]);
        }
        return root[index];
    }

    public void union(int x, int y) {
        int rootFirst = find(x);
        int rootSecond = find(y);
        if (rootFirst == rootSecond) {
            return;
        }

        if (size[rootFirst] > size[rootSecond]) {
            int tmp = rootFirst;
            rootFirst = rootSecond;
            rootSecond = tmp;
        }
        root[rootFirst] = rootSecond;
        size[rootSecond] += size[rootFirst];
    }
}
