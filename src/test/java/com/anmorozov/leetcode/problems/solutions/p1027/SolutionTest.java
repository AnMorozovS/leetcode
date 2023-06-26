package com.anmorozov.leetcode.problems.solutions.p1027;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1027. Longest Arithmetic Subsequence.")
class SolutionTest {

    @SuppressWarnings("SpellCheckingInspection")
    static Stream<Arguments> longestArithSeqLength() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("longestArithSeqLength")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource
    @SuppressWarnings("SpellCheckingInspection")
    void longestArithSeqLength(String message, int[] nums, int output) {
        Solution solution = new Approach1();
        int actual = solution.longestArithSeqLength(nums);
        assertEquals(output, actual);
    }

}