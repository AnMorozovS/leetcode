package com.anmorozov.leetcode.problems.solutions.p0743;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class MyApproach1 implements Solution {

    @Override
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> nodeEdges = new HashMap<>();
        for (int[] time : times) {
            nodeEdges.computeIfAbsent(time[0], HashMap::new).put(time[1], time[2]);
        }

        Map<Integer, Integer> nodeShortestDistance = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            nodeShortestDistance.put(i, Integer.MAX_VALUE);
        }
        nodeShortestDistance.put(k, 0);
        Queue<List<Integer>> nodeToVisit = new PriorityQueue<>(Comparator.comparingInt(x -> x.get(1)));
        nodeToVisit.add(List.of(k, 0));
        Set<Integer> visitedNode = new HashSet<>();
        while (!nodeToVisit.isEmpty()) {
            int node = nodeToVisit.poll().get(0);
            if (visitedNode.contains(node)) {
                continue;
            }
            int weighFromParent = nodeShortestDistance.get(node);
            for (Map.Entry<Integer, Integer> entry : nodeEdges.getOrDefault(node, new HashMap<>()).entrySet()) {
                int childNode = entry.getKey();
                int weight = entry.getValue();

                int currentWeight = nodeShortestDistance.get(childNode);
                int calculatedWeight = weighFromParent + weight;
                if (calculatedWeight < currentWeight) {
                    nodeShortestDistance.put(childNode, calculatedWeight);
                    if (!visitedNode.contains(childNode)) {
                        nodeToVisit.add(List.of(childNode, calculatedWeight));
                    }
                }
            }
            visitedNode.add(node);
        }
        int maxTime = 0;
        for (int time : nodeShortestDistance.values()) {
            if (maxTime < time) {
                maxTime = time;
            }
        }
        return maxTime == Integer.MAX_VALUE ? -1 : maxTime;
    }
}
