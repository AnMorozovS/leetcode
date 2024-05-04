package com.anmorozov.leetcode.problems.solutions.p0435;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyApproach1 implements Solution {

    @Override
    public int eraseOverlapIntervals(int[][] intervals) {
        Map<Integer, List<Integer>> intervalMap = new HashMap<>();
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int newIntervalStart = intervals[i][0];
            int newIntervalEnd = intervals[i][1];
            for (Map.Entry<Integer, List<Integer>> entry : intervalMap.entrySet()) {
                int intervalIndex = entry.getKey();
                int intervalStart = entry.getValue().get(0);
                int intervalEnd = entry.getValue().get(1);
                if ((intervalStart < newIntervalEnd && intervalEnd > newIntervalStart) || (
                        intervalStart == newIntervalStart && intervalEnd == newIntervalEnd)) {
                    edges.add(List.of(intervalIndex, i));
                }
            }
            intervalMap.put(i, List.of(newIntervalStart, newIntervalEnd));
        }
        return deleteEdge(edges);
    }

    private int deleteEdge(List<List<Integer>> edges) {
        if (edges.isEmpty()) {
            return 0;
        }
        List<List<Integer>> edges1 = deleteNode(edges, edges.getFirst().getFirst());
        int count1 = deleteEdge(edges1) + 1;
        List<List<Integer>> edges2 = deleteNode(edges, edges.getFirst().get(1));
        int count2 = deleteEdge(edges2) + 1;
        return Math.min(count1, count2);
    }

    private List<List<Integer>> deleteNode(List<List<Integer>> edges, int node) {
        List<List<Integer>> edges1 = new ArrayList<>();
        for (List<Integer> edge : edges) {
            if (edge.get(0) != node && edge.get(1) != node) {
                edges1.add(edge);
            }
        }
        return edges1;
    }

}
