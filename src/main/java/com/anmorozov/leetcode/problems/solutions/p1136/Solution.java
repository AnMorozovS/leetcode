package com.anmorozov.leetcode.problems.solutions.p1136;

/**
 * <p><b>1136.</b> Parallel Courses.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>You are given an integer {@code n}, which indicates that there are {@code n} courses labeled from {@code 1}
     * to {@code n}. You are also given an array {@code relations} where {@code relations[i] =
     * [prevCourse}<sub>i</sub>{@code , nextCourse}<sub>i</sub>{@code ]}, representing a prerequisite relationship
     * between course {@code prevCourse}<sub>i</sub> and course {@code nextCourse}<sub>i</sub>: course {@code
     * prevCourse}<sub>i</sub> has to be taken before course {@code nextCourse}<sub>i</sub>.</p>
     *
     * <p>In one semester, you can take <strong>any number</strong> of courses as long as you have taken all the
     * prerequisites in the <strong>previous</strong> semester for the courses you are taking.</p>
     *
     * <p>Return <em>the <strong>minimum</strong> number of semesters needed to take all courses</em>. If there is no
     * way to take all the courses, return {@code -1}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= n <= 5000}</li>
     * 	<li>{@code 1 <= relations.length <= 5000}</li>
     * 	<li>{@code relations[i].length == 2}</li>
     * 	<li>{@code 1 <= prevCourse}<sub>i</sub>{@code , nextCourse}<sub>i</sub>{@code  <= n}</li>
     * 	<li>{@code prevCourse}<sub>i</sub>{@code  != nextCourse}<sub>i</sub></li>
     * 	<li>All the pairs {@code [prevCourse}<sub>i</sub>{@code , nextCourse}<sub>i</sub>{@code ]} are <strong>unique</strong>.</li>
     * </ul>
     *
     * @param n courses
     * @param relations representing a prerequisite relationship between course
     * @return <em>the <strong>minimum</strong> number of semesters needed to take all courses</em>
     */
    int minimumSemesters(int n, int[][] relations);
}
