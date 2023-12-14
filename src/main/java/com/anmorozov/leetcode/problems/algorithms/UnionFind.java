package com.anmorozov.leetcode.problems.algorithms;

import lombok.Getter;

public class UnionFind {

    private final int[] root;
    private final int[] rank;
    @Getter
    private int count;

    public UnionFind(int size) {
        root = new int[size];
        rank = new int[size];
        count = size;
        for (int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int vertex) {
        if (vertex == root[vertex]) {
            return vertex;
        }
        return root[vertex] = find(root[vertex]);
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }
            count--;
        }
    }

}