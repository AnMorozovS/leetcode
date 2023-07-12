package com.anmorozov.leetcode.problems.solutions.p0802;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * My Approach 1: Brute force with cash result.
 */
public class MyApproach1 implements Solution {

    private int[][] graph;
    private Map<Integer, Boolean> cashMap;

    @Override
    public List<Integer> eventualSafeNodes(int[][] graph) {
        this.graph = graph;
        cashMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            if (useCash(i, new HashSet<>())) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean useCash(int node, Set<Integer> passed) {
        if (!cashMap.containsKey(node)) {
            cashMap.put(node, isNodeSafe(node, passed));
        }
        return cashMap.get(node);
    }

    private boolean isNodeSafe(int node, Set<Integer> passed) {
        if (this.graph[node].length == 0) {
            return true;
        }
        if (passed.contains(node)) {
            return false;
        }
        for (Integer nodeTo : this.graph[node]) {
            Set<Integer> newPassed = new HashSet<>(passed);
            newPassed.add(node);
            if (!useCash(nodeTo, newPassed)) {
                return false;
            }
        }
        return true;
    }
}
