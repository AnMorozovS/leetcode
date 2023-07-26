package com.anmorozov.leetcode.problems.solutions.p1129;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import static com.anmorozov.leetcode.problems.solutions.p1129.EdgeColor.BLUE_COLOR;
import static com.anmorozov.leetcode.problems.solutions.p1129.EdgeColor.RED_COLOR;

/**
 * My Approach 1 : of Breadth First Search
 */
public class MyApproach1 implements Solution {

    @Override
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        Map<Integer, Map<EdgeColor, Set<Integer>>> connectedWithColor = new HashMap<>();
        for (int[] redEdge : redEdges) {
            connectedWithColor.computeIfAbsent(redEdge[0], HashMap::new)
                    .computeIfAbsent(RED_COLOR, x -> new HashSet<>()).add(redEdge[1]);
        }
        for (int[] blueEdge : blueEdges) {
            connectedWithColor.computeIfAbsent(blueEdge[0], HashMap::new)
                    .computeIfAbsent(BLUE_COLOR, x -> new HashSet<>()).add(blueEdge[1]);
        }
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Queue<Step> previousNodes = new LinkedList<>();
        previousNodes.add(new Step(0, RED_COLOR));
        previousNodes.add(new Step(0, BLUE_COLOR));
        Set<Step> visited = new HashSet<>();
        int path = 0;
        while (!previousNodes.isEmpty()) {
            Queue<Step> newNodes = new LinkedList<>();
            while (!previousNodes.isEmpty()) {
                Step step = previousNodes.poll();
                visited.add(step);
                int node = step.node();
                result[node] = result[node] == -1 ? path : Math.min(path, result[node]);
                EdgeColor fromColor = step.previousColor();
                for (int nextNode : connectedWithColor.getOrDefault(node, new HashMap<>())
                        .getOrDefault(fromColor.nextColor(), new HashSet<>())) {
                    Step nextStep = new Step(nextNode, fromColor.nextColor());
                    if (!visited.contains(nextStep)) {
                        newNodes.add(nextStep);
                    }
                }
            }
            previousNodes = newNodes;
            path++;
        }
        return result;
    }
}
