package com.anmorozov.leetcode.problems.solutions.p1584;

import java.util.PriorityQueue;

/**
 * My Approach 2: Prim's Algorithm
 */
public class MyApproach2 implements Solution {

    @Override
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        boolean[] visited = new boolean[points.length];

        visited[0] = true;
        for (int i = 1; i < points.length; i++) {
            queue.add(
                    new Edge(i, 0, Math.abs(points[i][0] - points[0][0]) + Math.abs(points[i][1] - points[0][1])));
        }

        int edgesLeft = points.length - 1;
        int minimumCost = 0;
        while (!queue.isEmpty() && edgesLeft > 0) {
            Edge edge = queue.poll();
            int newNode;
            if (!visited[edge.node1()] || !visited[edge.node2()]) {
                minimumCost += edge.weight();
                edgesLeft--;
                if (!visited[edge.node1()]) {
                    newNode = edge.node1();
                } else {
                    newNode = edge.node2();
                }
                visited[newNode] = true;
                for (int i = 0; i < points.length; i++) {
                    if (!visited[i]) {
                        queue.add(
                                new Edge(i, newNode, Math.abs(points[i][0] - points[newNode][0]) + Math.abs(
                                        points[i][1] - points[newNode][1])));
                    }
                }
            }

        }
        return minimumCost;
    }
}
