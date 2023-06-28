package com.anmorozov.leetcode.problems.solutions.p1514;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyApproach1 implements Solution {

    Map<Integer, Map<Integer, Double>> edgeMap;
    private int endPosition;

    @Override
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        this.endPosition = end;
        this.edgeMap = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int nodeFrom = edges[i][0];
            int nodeTo = edges[i][1];
            double chance = succProb[i];
            this.edgeMap.computeIfAbsent(nodeFrom, HashMap::new).put(nodeTo, chance);
            this.edgeMap.computeIfAbsent(nodeTo, HashMap::new).put(nodeFrom, chance);
        }
        Set<Integer> visited = new HashSet<>();
        return throughAllPaths(visited, start);
    }


    public double throughAllPaths(Set<Integer> visited, int nodeNumber) {
        if (this.endPosition == nodeNumber) {
            return 1;
        }
        double maxChance = 0;
        visited.add(nodeNumber);
        for (Map.Entry<Integer, Double> entry : edgeMap.getOrDefault(nodeNumber, new HashMap<>()).entrySet()) {
            int nextNode = entry.getKey();
            double chance = entry.getValue();
            if (visited.contains(nextNode)) {
                continue;
            }
            chance = chance * throughAllPaths(visited, nextNode);
            maxChance = Math.max(maxChance, chance);
        }
        visited.remove(nodeNumber);
        return maxChance;
    }

}
