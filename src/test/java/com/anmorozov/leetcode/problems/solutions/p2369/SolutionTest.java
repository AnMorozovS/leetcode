package com.anmorozov.leetcode.problems.solutions.p2369;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2369. Check if There is a Valid Partition For The Array.")
class SolutionTest {

    static Stream<Arguments> validPartition() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1")
    @ParameterizedTest(name = "{0}: nums = {1}, output = {2}")
    @MethodSource("validPartition")
    void testMyApproach1(String ignoredMessage, int[] nums, boolean output) {
        Solution solution = new MyApproach1();
        boolean actual = solution.validPartition(nums);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}