package com.anmorozov.leetcode.problems.solutions.p1971;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Map;

public class MyApproach1 implements Solution {

    @Override
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = getGraph(edges);

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(source);
        boolean[] seen = new boolean[n];
        Arrays.fill(seen, false);

        while (!stack.isEmpty()) {
            // Get the current node.
            int node = stack.pop();

            // Check if we have reached the target node.
            if (node == destination) {
                return true;
            }

            // Check if we've already visited this node.
            if (seen[node]) {
                continue;
            }
            seen[node] = true;

            // Add all neighbors to the stack.
            for (int neighbor : graph.get(node)) {
                stack.push(neighbor);
            }
        }

        return false;
    }
}
