package com.anmorozov.leetcode.problems.solutions.p2343;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("2343. Query Kth Smallest Trimmed Number.")
class SolutionTest {

    static Stream<Arguments> smallestTrimmedNumbers() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 : radix sort")
    @ParameterizedTest(name = "{0}: nums = {1}, queries = {2}, output = {3}")
    @MethodSource("smallestTrimmedNumbers")
    void testMyApproach1(String ignoredMessage, String[] nums, int[][] queries, int[] output) {

        Solution solution = new MyApproach1();
        int[] actual = solution.smallestTrimmedNumbers(nums, queries);
        assertArrayEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}