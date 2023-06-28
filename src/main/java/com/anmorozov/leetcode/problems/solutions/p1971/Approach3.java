package com.anmorozov.leetcode.problems.solutions.p1971;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Approach 3: Depth First Search (DFS): Iterative
 */
public class Approach3 implements Solution {

    @Override
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Store all edges according to nodes in 'graph'.
        Map<Integer, List<Integer>> graph = getGraph(edges);

        // Start from source node, add it to stack.
        boolean[] seen = new boolean[n];
        seen[source] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()) {
            int currNode = stack.pop();
            if (currNode == destination) {
                return true;
            }
            // Add all unvisited neighbors of the current node to stack'
            // and mark it as visited.
            for (int nextNode : graph.get(currNode)) {
                if (!seen[nextNode]) {
                    seen[nextNode] = true;
                    stack.push(nextNode);
                }
            }
        }

        return false;
    }
}
