package com.anmorozov.leetcode.problems.solutions.p1514;

import java.util.*;

public class Approach2 implements Solution {
    @Override
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Map<Integer, List<Pair>> graph = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double pathProb = succProb[i];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new Pair(v, pathProb));
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new Pair(u, pathProb));
        }

        double[] maxProb = new double[n];
        maxProb[start] = 1d;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int curNode = queue.poll();
            for (Pair neighbor : graph.getOrDefault(curNode, new ArrayList<>())) {
                int nxtNode = neighbor.key();
                double pathProb = neighbor.value();

                if (maxProb[curNode] * pathProb > maxProb[nxtNode]) {
                    maxProb[nxtNode] = maxProb[curNode] * pathProb;
                    queue.offer(nxtNode);
                }
            }
        }

        return maxProb[end];
    }

    record Pair(Integer key, Double value) {
    }
}
