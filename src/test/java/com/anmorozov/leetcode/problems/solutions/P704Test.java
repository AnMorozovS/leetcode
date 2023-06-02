package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P704Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P704Test, SolutionRecord> baseTest = new BaseTest<>(P704Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> search() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "nums = {1}, target = {2}")
    @MethodSource
    void search(String message, int[] nums, int target, int output) {
        P704 p704 = new P704();
        int actual = p704.search(nums, target);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] nums, int target, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.nums, s.target, s.output);
        }
    }
}