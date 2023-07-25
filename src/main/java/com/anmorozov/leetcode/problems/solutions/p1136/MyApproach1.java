package com.anmorozov.leetcode.problems.solutions.p1136;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * My Approach of topological sort
 */
public class MyApproach1 implements Solution {

    @Override
    public int minimumSemesters(int n, int[][] relations) {
        Map<Integer, Set<Integer>> coursePrevCourses = new HashMap<>();
        Map<Integer, Set<Integer>> courseNextCourses = new HashMap<>();
        for (int[] relation : relations) {
            int prevCourse = relation[0];
            int nextCourse = relation[1];
            coursePrevCourses.computeIfAbsent(nextCourse, HashSet::new).add(prevCourse);
            courseNextCourses.computeIfAbsent(prevCourse, HashSet::new).add(nextCourse);
        }
        Queue<StudyPlan> availableCourses = new LinkedList<>();
        for (int course = 1; course <= n; course++) {
            if (!coursePrevCourses.containsKey(course)) {
                availableCourses.add(new StudyPlan(course, 1));
            }
        }
        int lastSemester = 0;
        Set<Integer> passedCourses = new HashSet<>();
        while (!availableCourses.isEmpty()) {
            StudyPlan studyPlan = availableCourses.poll();
            int course = studyPlan.course();
            int semester = studyPlan.semester();
            if (lastSemester < semester) {
                lastSemester = semester;
            }
            passedCourses.add(course);
            for (int nextCourse : courseNextCourses.getOrDefault(course, new HashSet<>())) {
                if (!passedCourses.contains(nextCourse)) {
                    if (passedCourses.containsAll(coursePrevCourses.get(nextCourse))) {
                        availableCourses.add(new StudyPlan(nextCourse, semester + 1));
                    }
                }
            }
        }
        return passedCourses.size() != n ? -1 : lastSemester;
    }

    record StudyPlan(int course, int semester) {

    }
}
