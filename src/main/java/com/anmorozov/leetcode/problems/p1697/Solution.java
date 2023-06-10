package com.anmorozov.leetcode.problems.p1697;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Solution {

    private void sort(int[][] array) {
        Arrays.sort(array, Comparator.comparingInt(a -> a[2]));
    }

    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        UnionFind uf = new UnionFind(n);
        int queriesCount = queries.length;
        boolean[] answer = new boolean[queriesCount];

        int[][] queriesWithIndex = new int[queriesCount][4];
        for (int i = 0; i < queriesCount; ++i) {
            queriesWithIndex[i][0] = queries[i][0];
            queriesWithIndex[i][1] = queries[i][1];
            queriesWithIndex[i][2] = queries[i][2];
            queriesWithIndex[i][3] = i;
        }

        sort(edgeList);

        TreeMap<Integer, Map<Integer, Integer>> treeSet = new TreeMap<>();
        treeSet.put(0, uf.getCurrentMap());
        for (int[] edge : edgeList) {
            if (uf.join(edge[0], edge[1])) {
                treeSet.put(edge[2], uf.getCurrentMap());
            }
        }
        for (int q = 0; q < queries.length; q++) {
            Map<Integer, Integer> innerMap = treeSet.get(treeSet.lowerKey(queries[q][2]));
            answer[q] = (Objects.equals(innerMap.get(queries[q][0]), innerMap.get(queries[q][1])));
        }
        return answer;
    }
}