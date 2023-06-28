package com.anmorozov.leetcode.problems.solutions.p1514;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import javafx.util.Pair;

public class Approach2 implements Solution {

    @Override
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Map<Integer, List<Pair<Integer, Double>>> graph = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double pathProb = succProb[i];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new Pair<>(v, pathProb));
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new Pair<>(u, pathProb));
        }

        double[] maxProb = new double[n];
        maxProb[start] = 1d;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int curNode = queue.poll();
            for (Pair<Integer, Double> neighbor : graph.getOrDefault(curNode, new ArrayList<>())) {
                int nxtNode = neighbor.getKey();
                double pathProb = neighbor.getValue();

                if (maxProb[curNode] * pathProb > maxProb[nxtNode]) {
                    maxProb[nxtNode] = maxProb[curNode] * pathProb;
                    queue.offer(nxtNode);
                }
            }
        }

        return maxProb[end];
    }
}
