package com.anmorozov.leetcode.problems.solutions.p0215;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("215. Kth Largest Element in an Array.")
class SolutionTest {

    static Stream<Arguments> findKthLargest() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 :")
    @ParameterizedTest(name = "{0}: nums = {1}, k = {2}, output = {3}")
    @MethodSource("findKthLargest")
    void testMyApproach1(String ignoredMessage, int[] nums, int k, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.findKthLargest(nums, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}