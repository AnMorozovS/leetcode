package com.anmorozov.leetcode.problems.solutions.p0210;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * My realisation of Kahn's Algorithm
 */
public class MyApproach1 implements Solution {

    @Override
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> courseRequiredFor = new HashMap<>();
        Map<Integer, Set<Integer>> courseRequirement = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            int coreCourse = prerequisite[1];
            int advanceCourse = prerequisite[0];
            courseRequiredFor.computeIfAbsent(coreCourse, HashSet::new).add(advanceCourse);
            courseRequirement.computeIfAbsent(advanceCourse, HashSet::new).add(coreCourse);
        }
        Queue<Integer> availableCourses = new PriorityQueue<>();
        for (int i = 0; i < numCourses; i++) {
            if (!courseRequirement.containsKey(i)) {
                availableCourses.add(i);
            }
        }
        Set<Integer> passedCourses = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        while (!availableCourses.isEmpty()) {
            int currentCourse = availableCourses.poll();
            result.add(currentCourse);
            passedCourses.add(currentCourse);
            for (int nextCourse : courseRequiredFor.getOrDefault(currentCourse, new HashSet<>())) {
                Set<Integer> nextCourseRequirement = courseRequirement.get(nextCourse);
                if (passedCourses.containsAll(nextCourseRequirement)) {
                    availableCourses.add(nextCourse);
                }
            }
        }
        return result.size() == numCourses ? result.stream().mapToInt(Integer::intValue).toArray() : new int[] {};
    }

}
