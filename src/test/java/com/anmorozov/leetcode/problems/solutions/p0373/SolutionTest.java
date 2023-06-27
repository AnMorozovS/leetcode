package com.anmorozov.leetcode.problems.solutions.p0373;

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

@DisplayName("373. Find K Pairs with Smallest Sums.")
class SolutionTest {

    static Stream<Arguments> kSmallestPairs() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("Approach1.kSmallestPairs")
    @ParameterizedTest(name = "{0}: nums1 = {1}, nums2 = {2}, k = {3}, output = {4}")
    @MethodSource("kSmallestPairs")
    void testMyApproach1(String message, int[] nums1, int[] nums2, int k, List<List<Integer>> output) {
        Solution solution = new Approach1();
        List<List<Integer>> actual = solution.kSmallestPairs(nums1, nums2, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}