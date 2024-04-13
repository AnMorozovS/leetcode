package com.anmorozov.leetcode.problems.solutions.p1349;

/**
 * <p><strong>1349.</strong> Maximum Students Taking Exam.</p>
 * <em>Hard</em>
 */
public interface Solution {

    /**
     * <p>Given a {@code m * n} matrix seats  that represent seats distributions in a classroom. If a seat is broken, it is denoted by {@code '#'} character otherwise it is denoted by a {@code '.'} character.</p>
     * <p>Students can see the answers of those sitting next to the left, right, upper left and upper right, but he cannot see the answers of the student sitting directly in front or behind him. Return the maximum number of students that can take the exam together without any cheating being possible.</p>
     * <p>Students must be placed in seats in good condition.</p>
     *
     * <p><strong>Constraints</strong></p>
     * <ul>
     * <li>seats contains only characters {@code '.'} and {@code '#'}.</li>
     * <li>{@code m == seats.length}</li>
     * <li>{@code n == seats[i].length}</li>
     * <li>{@code 1 <= m <= 8}</li>
     * <li>{@code 1 <= n <= 8}</li>
     * </ul>
     *
     * @param seats a {@code m * n} matrix
     * @return the <strong>maximum</strong> number of students that can take the exam together without any cheating being possible.
     */
    int maxStudents(char[][] seats);
}
