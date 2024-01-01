package com.anmorozov.leetcode.problems.solutions.p1066;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1066. Campus Bikes II.")
class SolutionTest {

    static Stream<Arguments> assignBikes() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 :")
    @ParameterizedTest(name = "{0}: workers = {1}, bikes = {2}, output = {3}")
    @MethodSource("assignBikes")
    void testMyApproach1(String ignoredMessage, int[][] workers, int[][] bikes, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.assignBikes(workers, bikes);
        assertEquals(output, actual);
    }

    @DisplayName("Approach 1 : Greedy Backtracking")
    @ParameterizedTest(name = "{0}: workers = {1}, bikes = {2}, output = {3}")
    @MethodSource("assignBikes")
    void testApproach1(String ignoredMessage, int[][] workers, int[][] bikes, int output) {
        Solution solution = new Approach1();
        int actual = solution.assignBikes(workers, bikes);
        assertEquals(output, actual);
    }

    @DisplayName("Approach 2 : Top-Down Dynamic Programming + BitMasking")
    @ParameterizedTest(name = "{0}: workers = {1}, bikes = {2}, output = {3}")
    @MethodSource("assignBikes")
    void testApproach2(String ignoredMessage, int[][] workers, int[][] bikes, int output) {
        Solution solution = new Approach2();
        int actual = solution.assignBikes(workers, bikes);
        assertEquals(output, actual);
    }
}