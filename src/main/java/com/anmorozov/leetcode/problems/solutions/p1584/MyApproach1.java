package com.anmorozov.leetcode.problems.solutions.p1584;

import com.anmorozov.leetcode.problems.algorithms.UnionFind;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MyApproach1 implements Solution {

    @Override
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                queue.add(
                        new Edge(i, j, Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1])));
            }
        }
        UnionFind unionFind = new UnionFind(points.length);

        int edgesLeft = points.length - 1;
        int minimumCost = 0;
        while (!queue.isEmpty() && edgesLeft > 0) {
            Edge edge = queue.poll();
            if (unionFind.find(edge.node1) != unionFind.find(edge.node2)) {
                minimumCost += edge.weight;
                edgesLeft--;
                unionFind.union(edge.node1, edge.node2);
            }
        }
        return minimumCost;
    }

    record Edge(int node1, int node2, int weight) {

    }
}
