package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0704Test {

    static Stream<Arguments> search() throws IOException {
        BaseTest<P0704Test, SolutionRecord> baseTest = new BaseTest<>(P0704Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "nums = {1}, target = {2}")
    @MethodSource
    void search(String message, int[] nums, int target, int output) {
        P0704 p0704 = new P0704();
        int actual = p0704.search(nums, target);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] nums, int target, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.nums, s.target, s.output);
        }
    }
}