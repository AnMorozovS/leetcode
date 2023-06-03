package com.anmorozov.leetcode.problems.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1376 {

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        Map<Integer, List<Integer>> graphById = new HashMap<>();
        for (int i = 0; i < manager.length; i++) {
            if (manager[i] != -1) {
                graphById.computeIfAbsent(manager[i], x -> new ArrayList<>()).add(i);
            }
        }
        System.out.print(graphToLevelToString(graphById, headID));
        return depthFirstSearchRecursive(headID, graphById, informTime);
    }

    private int depthFirstSearchRecursive(int cur, Map<Integer, List<Integer>> graph, int[] informTime) {
        int maxTime = 0;
        for (int employee : graph.getOrDefault(cur, new ArrayList<>())) {
            int currentTime = depthFirstSearchRecursive(employee, graph, informTime);
            if (currentTime > maxTime) {
                maxTime = currentTime;
            }
        }
        return maxTime + informTime[cur];
    }

    public void graphToLevel(Map<Integer, List<Integer>> graphById, int headID,
                             Map<Integer, List<Integer>> graphByLevel, int level) {
        graphByLevel.computeIfAbsent(level, x -> new ArrayList<>()).add(headID);
        for (int employeeId : graphById.getOrDefault(headID, new ArrayList<>())) {
            graphToLevel(graphById, employeeId, graphByLevel, level + 1);
        }
    }

    public String graphToLevelToString(Map<Integer, List<Integer>> graphById, int headID) {
        Map<Integer, List<Integer>> graphByLevel = new HashMap<>();
        graphToLevel(graphById, headID, graphByLevel, 0);
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Integer, List<Integer>> entry : graphByLevel.entrySet()) {
            builder.append(entry.getKey()).append(':').append('\t');
            boolean flag = false;
            for (int value : entry.getValue()) {
                if (flag) {
                    builder.append(", ");
                } else {
                    flag = true;
                }
                builder.append(value);
            }
            builder.append('\n');
        }
        return builder.toString();
    }
}
