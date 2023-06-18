package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("163. Missing Ranges.")
class P0163Test {

    static Stream<Arguments> findMissingRanges() throws IOException {
        BaseTest<P0163Test, SolutionRecord> baseTest = new BaseTest<>(P0163Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("findMissingRanges")
    @ParameterizedTest(name = "{0}: nums = {1}, lower = {2}, upper = {3}, output = {4} ")
    @MethodSource
    void findMissingRanges(String message, int[] nums, int lower, int upper, List<List<Integer>> output) {
        P0163 p0163 = new P0163();
        List<List<Integer>> actual = p0163.findMissingRanges(nums, lower, upper);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] nums, int lower, int upper, List<List<Integer>> output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.nums, s.lower, s.upper, s.output);
        }
    }

}