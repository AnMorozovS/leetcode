package com.anmorozov.leetcode.problems.solutions.p1192;

import com.anmorozov.leetcode.problems.algorithms.UnionFind;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyApproach1 implements Solution {

    @Override
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        Map<Integer, List<Integer>> minimalConnection = new HashMap<>();
        Map<Integer, Set<Integer>> uncriticalConnections = new HashMap<>();

        UnionFind unionFind = new UnionFind(n);
        for (List<Integer> connection : connections) {
            int node1 = connection.get(0);
            int node2 = connection.get(1);
            if (unionFind.find(node1) == unionFind.find(node2)) {
                uncriticalConnections.computeIfAbsent(node1, HashSet::new).add(node2);
                uncriticalConnections.computeIfAbsent(node2, HashSet::new).add(node1);
            } else {
                minimalConnection.computeIfAbsent(node1, ArrayList::new).add(node2);
                minimalConnection.computeIfAbsent(node2, ArrayList::new).add(node1);
                unionFind.union(node1, node2);
            }
        }
        Set<Integer> firstPartNodes = new HashSet<>();
        Set<Integer> secondPartNodes = new HashSet<>();
        Deque<DirectedEdge> queue = new LinkedList<>();
        for (Map.Entry<Integer, List<Integer>> entry : minimalConnection.entrySet()) {
            if (entry.getValue().size() == 1) {
                queue.add(new DirectedEdge(entry.getKey(), entry.getValue().get(0)));
                secondPartNodes.add(entry.getKey());
                secondPartNodes.add(entry.getValue().get(0));
                break;
            }
        }

        while (queue.size() < n - 1) {
            DirectedEdge currentEdge = queue.peekLast();
            if (currentEdge == null) {
                break;
            }
            int nodeVisited = currentEdge.node1;
            int nodeLast = currentEdge.node2;
            for (Integer cycleNode : minimalConnection.get(nodeLast)) {
                if (cycleNode != nodeVisited) {
                    queue.add(new DirectedEdge(nodeLast, cycleNode));
                    secondPartNodes.add(cycleNode);
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            DirectedEdge edge = queue.poll();
            int nodeFrom = edge.node1();
            int nodeTo = edge.node2();
            firstPartNodes.add(nodeFrom);
            secondPartNodes.remove(nodeFrom);
            boolean criticalFlag = true;
            for (Integer firstPartNode : firstPartNodes) {
                for (Integer variant : uncriticalConnections.getOrDefault(firstPartNode, new HashSet<>())) {
                    if (secondPartNodes.contains(variant)) {
                        criticalFlag = false;
                        break;
                    }
                }
                if (!criticalFlag) {
                    break;
                }
            }
            if (criticalFlag) {
                result.add(List.of(nodeFrom, nodeTo));
            }
        }
        return result;
    }

    record DirectedEdge(int node1, int node2) {

    }
}
