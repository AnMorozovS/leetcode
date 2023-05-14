package com.anmorozov.leetcode.problems.p1697;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Solution {

    // Sort in increasing order based on the 3rd element of the array.
    private void sort(int[][] array) {
        Arrays.sort(array, Comparator.comparingInt(a -> a[2]));
    }

    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        UnionFind uf = new UnionFind(n);
        int queriesCount = queries.length;
        boolean[] answer = new boolean[queriesCount];

        // Store original indices with all queries.
        int[][] queriesWithIndex = new int[queriesCount][4];
        for (int i = 0; i < queriesCount; ++i) {
            queriesWithIndex[i][0] = queries[i][0];
            queriesWithIndex[i][1] = queries[i][1];
            queriesWithIndex[i][2] = queries[i][2];
            queriesWithIndex[i][3] = i;
        }

        // Sort all edges in increasing order of their edge weights.
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
        // Sort all queries in increasing order of the limit of edge allowed.
//        sort(queriesWithIndex);
//
//        int edgesIndex = 0;
//
//        // Iterate on each query one by one.
//        for (int queryIndex = 0; queryIndex < queriesCount; queryIndex += 1) {
//            int p = queriesWithIndex[queryIndex][0];
//            int q = queriesWithIndex[queryIndex][1];
//            int limit = queriesWithIndex[queryIndex][2];
//            int queryOriginalIndex = queriesWithIndex[queryIndex][3];
//
//            // We can attach all edges which satisfy the limit given by the query.
//            while (edgesIndex < edgeList.length && edgeList[edgesIndex][2] < limit) {
//                int node1 = edgeList[edgesIndex][0];
//                int node2 = edgeList[edgesIndex][1];
//                uf.join(node1, node2);
//                edgesIndex += 1;
//            }
//
//            // If both nodes belong to the same component, it means we can reach them.
//            answer[queryOriginalIndex] = uf.areConnected(p, q);
//        }
//        System.out.println(Arrays.toString(uf.group));
//        System.out.println(Arrays.toString(uf.rank));
        return answer;
    }
}