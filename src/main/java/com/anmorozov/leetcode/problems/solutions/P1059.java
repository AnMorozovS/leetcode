package com.anmorozov.leetcode.problems.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class P1059 {

    private Map<Integer, List<Integer>> graph;
    private Map<Integer, Boolean> cashResult;

    /**
     * Given the edges of a directed graph where {@code edges[i] = [ai, bi] } indicates there is an edge between nodes
     * {@code ai} and {@code bi}, and two nodes source and destination of this graph, determine whether all paths
     * starting from source eventually, end at destination, that is:
     * <p> * At least one path exists from the source node to the destination node
     * <p> * If a path exists from the source node to a node with no outgoing edges, then that node is equal to
     * destination.
     * <p> * The number of possible paths from source to destination is a finite number.
     *
     * @param edges the array where {@code edge[][0]} from {@code edge[][1]} to
     * @param source start node
     * @param destination end node
     * @return {@code true} if and only if all roads from source lead to destination.
     */
    public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {
        graph = new HashMap<>();
        cashResult = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], x -> new ArrayList<>()).add(edge[1]);
        }

        return goToTheGraph(new HashSet<>(), source, destination);
    }

    public boolean goToTheGraph(Set<Integer> alreadyVisited, int node, int destination) {
        List<Integer> nextNodes = graph.get(node);
        if (node == destination) {
            return nextNodes == null || nextNodes.isEmpty();
        }
        if (alreadyVisited.contains(node)) {
            return false;
        }
        alreadyVisited.add(node);

        if (nextNodes == null || nextNodes.isEmpty()) {
            return false;
        }
        for (int nextNode : nextNodes) {
            boolean result;
            if (cashResult.containsKey(nextNode)) {
                result = cashResult.get(nextNode);
            } else {
                result = goToTheGraph(alreadyVisited, nextNode, destination);
                cashResult.put(nextNode, result);
            }
            if (!result) {
                return false;
            }
        }
        alreadyVisited.remove(node);
        return true;
    }

}
