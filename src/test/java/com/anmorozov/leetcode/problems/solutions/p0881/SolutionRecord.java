package com.anmorozov.leetcode.problems.solutions.p0881;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Use for {@link com.anmorozov.leetcode.problems.solutions.p0881.Solution#numRescueBoats(int[] people, int limit)}
 *
 * @param message case name
 * @param people  an array where people[i] is the weight of the iᵗʰ person
 * @param limit   a maximum weight each boat can carry
 * @param output  expected result
 */
public record SolutionRecord(String message, int[] people, int limit, int output) {

    /**
     * for {@link com.anmorozov.leetcode.problems.solutions.p0881.SolutionTest }
     *
     * @param s SolutionRecord
     * @return arguments
     */
    public static Arguments getArguments(SolutionRecord s) {
        return arguments(s.message(), s.people(), s.limit(), s.output());
    }
}
