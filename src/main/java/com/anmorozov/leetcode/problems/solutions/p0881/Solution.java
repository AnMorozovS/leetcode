package com.anmorozov.leetcode.problems.solutions.p0881;

/**
 * <p><strong>881.</strong> Boats to Save People.</p>
 * <em>Easy</em>
 */
public interface Solution {

    /**
     * You are given an array people where people[i] is the weight of the ith person,
     * and an infinite number of boats where each boat can carry a maximum weight of limit.
     * Each boat carries at most two people at the same time,
     * provided the sum of the weight of those people is at most limit.
     * <p>Constraints:</p>
     * <pre>
     * {@code 1 <= people.length <= 5 * 104 }
     * {@code 1 <= people[i] <= limit <= 3 * 104 }
     * </pre>
     *
     * @param people an array where people[i] is the weight of the iᵗʰ person
     * @param limit  a maximum weight each boat can carry
     * @return the minimum number of boats to carry every given person.
     */
    int numRescueBoats(int[] people, int limit);
}
