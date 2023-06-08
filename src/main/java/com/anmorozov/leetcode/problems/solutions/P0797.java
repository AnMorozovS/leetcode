package com.anmorozov.leetcode.problems.solutions;

import java.util.ArrayList;
import java.util.List;

public class P0797 {

    List<List<Integer>> resultList;
    private int[][] graph;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        this.resultList = new ArrayList<>();
        getPath(0, new ArrayList<>());
        return resultList;
    }

    public void getPath(int node, List<Integer> result) {
        result.add(node);
        if (node == (graph.length - 1)) {
            resultList.add(result);
        } else {
            for (int next : graph[node]) {
                getPath(next, new ArrayList<>(result));
            }
        }
    }
}
