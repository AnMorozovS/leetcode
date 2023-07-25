package com.anmorozov.leetcode.problems.solutions.p0210;

/**
 * <p>210. Course Schedule II.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>There are a total of {@code numCourses} courses you have to take, labeled from {@code 0} to {@code numCourses
     * - 1}. You are given an array {@code prerequisites} where {@code prerequisites[i] = [a}<sub>i</sub>{@code ,
     * b}<sub>i</sub>{@code ]} indicates that you <strong>must</strong> take course {@code b}<sub>i</sub> first if you
     * want to take course {@code a}<sub>i</sub>.</p>
     *
     * <ul>
     * 	<li>For example, the pair {@code [0, 1]}, indicates that to take course {@code 0} you have to first take course {@code 1}.</li>
     * </ul>
     *
     * <p>Return <em>the ordering of courses you should take to finish all courses</em>. If there are many valid answers, return <strong>any</strong> of them. If it is impossible to finish all courses, return <strong>an empty array</strong>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= numCourses <= 2000}</li>
     * 	<li>{@code 0 <= prerequisites.length <= numCourses * (numCourses - 1)}</li>
     * 	<li>{@code prerequisites[i].length == 2}</li>
     * 	<li>{@code 0 <= a}<sub>i</sub>{@code , b}<sub>i</sub>{@code  < numCourses}</li>
     * 	<li>{@code a}<sub>i</sub>{@code  != b}<sub>i</sub></li>
     * 	<li>All the pairs {@code [a}<sub>i</sub>{@code , b}<sub>i</sub>{@code ]} are <strong>distinct</strong>.</li>
     * </ul>
     *
     * @param numCourses a total of courses you have to take
     * @param prerequisites {@code [a}<sub>i</sub>{@code , b}<sub>i</sub>{@code ]} indicates that you
     * <strong>must</strong> take course {@code b}<sub>i</sub> first if you want to take course {@code a}<sub>i</sub>
     * @return <em>the ordering of courses you should take to finish all courses</em>
     */
    int[] findOrder(int numCourses, int[][] prerequisites);
}
