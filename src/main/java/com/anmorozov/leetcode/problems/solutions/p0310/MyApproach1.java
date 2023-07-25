package com.anmorozov.leetcode.problems.solutions.p0310;

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
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            return List.of(0);
        }
        Map<Integer, Set<Integer>> nodeConnectedNodes = new HashMap<>();
        for (int[] edge : edges) {
            nodeConnectedNodes.computeIfAbsent(edge[0], HashSet::new).add(edge[1]);
            nodeConnectedNodes.computeIfAbsent(edge[1], HashSet::new).add(edge[0]);
        }
        Queue<NodeVisit> actualNodes = new PriorityQueue<>(Comparator.comparingInt(NodeVisit::level));
        for (int i = 0; i < n; i++) {
            if (nodeConnectedNodes.get(i).size() == 1) {
                actualNodes.add(new NodeVisit(i, 1));
            }
        }
        Set<Integer> visitedNodes = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        int maxLevel = 0;
        while (!actualNodes.isEmpty() && visitedNodes.size() < n) {
            NodeVisit nodeVisit = actualNodes.poll();
            int node = nodeVisit.node();
            int level = nodeVisit.level();
            visitedNodes.add(node);
            if (maxLevel < level) {
                maxLevel = level;
                resultSet = new HashSet<>();
                resultSet.add(node);
            }
            if (maxLevel == level) {
                resultSet.add(node);
            }
            for (int nextNode : nodeConnectedNodes.getOrDefault(node, new HashSet<>())) {
                int freeConnection = 0;
                for (int nodeToCheck : nodeConnectedNodes.get(nextNode)) {
                    if (!visitedNodes.contains(nodeToCheck)) {
                        freeConnection++;
                    }
                }
                if (freeConnection < 2 && !visitedNodes.contains(nextNode)) {
                    actualNodes.add(new NodeVisit(nextNode, level + 1));
                }
            }
        }
        return resultSet.stream().sorted().toList();
    }

    record NodeVisit(int node, int level) {

    }
}
