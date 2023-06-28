package com.anmorozov.leetcode.problems.solutions.p1971;

import java.util.List;
import java.util.Map;

/**
 * Approach 2: Depth First Search (DFS): Recursive
 */
public class Approach2 implements Solution {

    @Override
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = getGraph(edges);

        boolean[] seen = new boolean[n];
        return depthFirstSearch(graph, seen, source, destination);
    }

    private boolean depthFirstSearch(Map<Integer, List<Integer>> graph, boolean[] seen, int currNode, int destination) {
        if (currNode == destination) {
            return true;
        }
        if (!seen[currNode]) {
            seen[currNode] = true;
            for (int nextNode : graph.get(currNode)) {
                if (depthFirstSearch(graph, seen, nextNode, destination)) {
                    return true;
                }
            }
        }
        return false;
    }
}
