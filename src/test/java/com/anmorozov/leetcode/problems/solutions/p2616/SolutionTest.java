package com.anmorozov.leetcode.problems.solutions.p2616;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2616. Minimize the Maximum Difference of Pairs.")
class SolutionTest {

    static Stream<Arguments> minimizeMax() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.minimizeMax")
    @ParameterizedTest(name = "{0}: nums = {1}, p = {2}, output = {3}")
    @MethodSource("minimizeMax")
    void testMyApproach1(String ignoredMessage, int[] nums, int p, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.minimizeMax(nums, p);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}