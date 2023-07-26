package com.anmorozov.leetcode.problems.solutions.p1466;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Approach 2: Breadth First Search
 */
public class Approach2 implements Solution {

    int count = 0;

    public void breathFirstSearch(int node, int n, Map<Integer, List<List<Integer>>> adj) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[n];
        q.offer(node);
        visit[node] = true;

        while (!q.isEmpty()) {
            node = q.poll();
            for (List<Integer> nei : adj.get(node)) {
                int neighbor = nei.get(0);
                int sign = nei.get(1);
                if (!visit[neighbor]) {
                    count += sign;
                    visit[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }
    }

    @Override
    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<List<Integer>>> adj = new HashMap<>();
        for (int[] connection : connections) {
            adj.computeIfAbsent(connection[0], k -> new ArrayList<>()).add(
                    Arrays.asList(connection[1], 1));
            adj.computeIfAbsent(connection[1], k -> new ArrayList<>()).add(
                    Arrays.asList(connection[0], 0));
        }
        breathFirstSearch(0, n, adj);
        return count;
    }
}
