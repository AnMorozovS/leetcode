package com.anmorozov.leetcode.problems.solutions.p0881;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("881. Boats to Save People.")
class SolutionTest {

    static Stream<Arguments> numRescueBoats() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: ")
    @ParameterizedTest(name = "{0}: people = {1}, limit = {2}, output = {3}")
    @MethodSource("numRescueBoats")
    void testMyApproach1(String ignoredMessage, int[] people, int limit, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.numRescueBoats(people, limit);
        assertEquals(output, actual);
    }

    @DisplayName("Approach 1: Greedy (Two Pointer)")
    @ParameterizedTest(name = "{0}: people = {1}, limit = {2}, output = {3}")
    @MethodSource("numRescueBoats")
    void testApproach1(String ignoredMessage, int[] people, int limit, int output) {
        Solution solution = new Approach1();
        int actual = solution.numRescueBoats(people, limit);
        assertEquals(output, actual);
    }
}