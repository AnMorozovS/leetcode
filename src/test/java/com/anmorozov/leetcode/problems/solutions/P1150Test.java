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

@DisplayName("1150. Check If a Number Is Majority Element in a Sorted Array.")
class P1150Test {

    static Stream<Arguments> isMajorityElement() throws IOException {
        BaseTest<P1150Test, SolutionRecord> baseTest = new BaseTest<>(P1150Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("isMajorityElement")
    @ParameterizedTest(name = "{0}: nums = {1}, target = {2}, output = {3}")
    @MethodSource
    void isMajorityElement(String message, int[] nums, int target, boolean output) {
        P1150 p1150 = new P1150();
        boolean actual = p1150.isMajorityElement(nums, target);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] nums, int target, boolean output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.nums, s.target, s.output);
        }
    }

}