package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1569. Number of Ways to Reorder Array to Get Same BST.")
class P1569Test {

    static Stream<Arguments> numOfWays() throws IOException {
        BaseTest<P1569Test, SolutionRecord> baseTest = new BaseTest<>(P1569Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("numOfWays")
    @ParameterizedTest(name = "{0}: grid = {1}, output = {2} ")
    @MethodSource
    void numOfWays(String message, int[] nums, int output) {
        P1569 p1569 = new P1569();
        int actual = p1569.numOfWays(nums);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] nums, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.nums, s.output);
        }
    }

}