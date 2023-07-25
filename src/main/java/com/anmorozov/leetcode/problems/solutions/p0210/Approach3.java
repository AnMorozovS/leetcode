package com.anmorozov.leetcode.problems.solutions.p0210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Approach 3: Topological Sorting - Kahn's Algorithm
 */
public class Approach3 implements Solution {

    @Override
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; ++i) {
            graph.add(new ArrayList<>());
        }

        int[] inDegree = new int[numCourses];

        for (var p : prerequisites) {
            int from = p[1];
            int to = p[0];
            graph.get(from).add(to);
            ++inDegree[to];
        }

        Queue<Integer> zeroDegree = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                zeroDegree.add(i);
            }
        }

        int[] result = new int[numCourses];
        int index = 0;
        while (!zeroDegree.isEmpty()) {
            int course = zeroDegree.poll();
            result[index] = course;
            index++;
            for (var child : graph.get(course)) {
                --inDegree[child];
                if (inDegree[child] == 0) {
                    zeroDegree.add(child);
                }
            }
        }

        for (int in : inDegree) {
            if (in != 0) {
                return new int[0];
            }
        }

        return result;
    }
}
