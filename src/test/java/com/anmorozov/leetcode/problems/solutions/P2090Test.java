package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("2090. K Radius Subarray Averages.")
class P2090Test {

    static Stream<Arguments> getAverages() throws IOException {
        BaseTest<P2090Test, SolutionRecord> baseTest = new BaseTest<>(P2090Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("getAverages")
    @ParameterizedTest(name = "{0}: nums = {1}, k = {2}, output = {3}")
    @MethodSource
    void getAverages(String message, int[] nums, int k, int[] output) {
        P2090 p2090 = new P2090();
        int[] actual = p2090.getAverages(nums, k);
        assertArrayEquals(output, actual);
    }

    record SolutionRecord(String message, int[] nums, int k, int[] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.nums, s.k, s.output);
        }
    }

}