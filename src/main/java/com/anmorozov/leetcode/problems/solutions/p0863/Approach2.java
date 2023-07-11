package com.anmorozov.leetcode.problems.solutions.p0863;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Approach 2: Depth-First Search on Equivalent Graph
 */
public class Approach2 implements Solution {

    Map<Integer, List<Integer>> graph;
    List<Integer> answer;
    Set<Integer> visited;

    @Override
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        graph = new HashMap<>();
        buildGraph(root, null);

        answer = new ArrayList<>();
        visited = new HashSet<>();
        visited.add(target.value);

        depthFirstSearch(target.value, 0, k);

        return answer;
    }

    // Recursively build the undirected graph from the given binary tree.
    private void buildGraph(TreeNode cur, TreeNode parent) {
        if (cur != null && parent != null) {
            graph.computeIfAbsent(cur.value, k -> new ArrayList<>()).add(parent.value);
            graph.computeIfAbsent(parent.value, k -> new ArrayList<>()).add(cur.value);
        }
        assert cur != null;
        if (cur.left != null) {
            buildGraph(cur.left, cur);
        }
        if (cur.right != null) {
            buildGraph(cur.right, cur);
        }
    }

    private void depthFirstSearch(int cur, int distance, int k) {
        if (distance == k) {
            answer.add(cur);
            return;
        }
        for (int neighbor : graph.getOrDefault(cur, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                depthFirstSearch(neighbor, distance + 1, k);
            }
        }
    }
}
