package com.anmorozov.leetcode.problems.solutions.p2551;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2551. Put Marbles in Bags.")
class SolutionTest {

    static Stream<Arguments> putMarbles() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.putMarbles")
    @ParameterizedTest(name = "{0}: weights = {1}, k = {2}, output = {3}")
    @MethodSource("putMarbles")
    @Disabled("Strange task")
    void testMyApproach1(String message, int[] weights, int k, long output) {

        Solution solution = new MyApproach1();
        long actual = solution.putMarbles(weights, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Sorting")
    @ParameterizedTest(name = "{0}: weights = {1}, k = {2}, output = {3}")
    @MethodSource("putMarbles")
    void testApproach1(String message, int[] weights, int k, long output) {

        Solution solution = new Approach1();
        long actual = solution.putMarbles(weights, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}