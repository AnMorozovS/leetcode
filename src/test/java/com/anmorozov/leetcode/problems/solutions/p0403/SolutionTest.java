package com.anmorozov.leetcode.problems.solutions.p0403;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("403. Frog Jump.")
class SolutionTest {

    static Stream<Arguments> canCross() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 use cache")
    @ParameterizedTest(name = "{0}: stones = {1}, output = {2}")
    @MethodSource("canCross")
    void testMyApproach1(String ignoredMessage, int[] stones, boolean output) {
        Solution solution = new MyApproach1();
        boolean actual = solution.canCross(stones);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Top-Down Dynamic Programming")
    @ParameterizedTest(name = "{0}: stones = {1}, output = {2}")
    @MethodSource("canCross")
    void testApproach1(String ignoredMessage, int[] stones, boolean output) {
        Solution solution = new Approach1();
        boolean actual = solution.canCross(stones);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 2: Bottom-up Dynamic Programming")
    @ParameterizedTest(name = "{0}: stones = {1}, output = {2}")
    @MethodSource("canCross")
    void testApproach2(String ignoredMessage, int[] stones, boolean output) {
        Solution solution = new Approach2();
        boolean actual = solution.canCross(stones);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}