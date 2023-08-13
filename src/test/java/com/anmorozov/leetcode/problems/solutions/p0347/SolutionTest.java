package com.anmorozov.leetcode.problems.solutions.p0347;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("310. Minimum Height Trees")
public class SolutionTest {

    static Stream<Arguments> topKFrequent() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1")
    @ParameterizedTest(name = "{0}: nums = {1}, k = {2}, output = {3}")
    @MethodSource("topKFrequent")
    void testMyApproach1(String ignoredMessage, int[] nums, int k, int[] output) {
        Solution solution = new MyApproach1();
        int[] actual = solution.topKFrequent(nums, k);
        assertArrayEquals(output, actual);
    }
}