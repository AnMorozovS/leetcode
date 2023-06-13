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

@DisplayName("228. Summary Ranges.")
class P0228Test {

    static Stream<Arguments> summaryRanges() throws IOException {
        BaseTest<P0228Test, SolutionRecord> baseTest = new BaseTest<>(P0228Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("summaryRanges")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2} ")
    @MethodSource
    void summaryRanges(String message, int[] nums, List<String> output) {
        P0228 p0133 = new P0228();
        List<String> actual = p0133.summaryRanges(nums);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] nums, List<String> output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.nums, s.output);
        }
    }

}