package com.anmorozov.leetcode.studyplan.common.one.p1480;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    private static List<Arguments> testcases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments, "runningSum");
        testcases = baseTest.prepare();

    }

    static Stream<Arguments> runningSum() {
        return testcases.stream();
    }

    @ParameterizedTest(name = "{index} {0}")
    @MethodSource
    void runningSum(String message, int[] nums, int[] output) {
        Solution solution = new Solution();
        int[] actual = solution.runningSum(nums);
        assertArrayEquals(output, actual);

    }

    record SolutionRecord(String message, int[] nums, int[] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.nums, s.output);
        }
    }
}