package com.anmorozov.leetcode.problems.solutions.p1514;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MyApproach2 implements Solution {

    @Override
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Map<Integer, Map<Integer, Double>> edgeMap = new HashMap<>();
        Map<Integer, Double> empty = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int nodeFrom = edges[i][0];
            int nodeTo = edges[i][1];
            double chance = succProb[i];
            edgeMap.computeIfAbsent(nodeFrom, HashMap::new).put(nodeTo, chance);
            edgeMap.computeIfAbsent(nodeTo, HashMap::new).put(nodeFrom, chance);
        }
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingDouble(x -> -x.chance));
        queue.add(new Node(start, 1));
        int[][] visited = new int[n][1];
        double maxChance = 0;
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int currentNumber = currentNode.number;
            if (currentNumber == end) {
                maxChance = currentNode.chance();
                break;
            }
            if (visited[currentNumber][0] == 0) {
                visited[currentNumber][0] = 1;
                for (Map.Entry<Integer, Double> entry : edgeMap.getOrDefault(currentNumber, empty).entrySet()) {
                    int key = entry.getKey();
                    if (visited[key][0] == 0) {
                        queue.add(new Node(key, currentNode.chance() * entry.getValue()));
                    }
                }
            }

        }
        return maxChance;
    }

    record Node(int number, double chance) {

    }
}
