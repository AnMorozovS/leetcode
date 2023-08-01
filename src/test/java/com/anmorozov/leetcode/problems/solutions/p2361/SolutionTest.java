package com.anmorozov.leetcode.problems.solutions.p2361;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("2361. Minimum Costs Using the Train Line.")
class SolutionTest {

    static Stream<Arguments> minimumCosts() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.minimumCosts")
    @ParameterizedTest(name = "{0}: regular = {1}, express = {2}, expressCost = {3}, output = {4}")
    @MethodSource("minimumCosts")
    void testMyApproach1(String ignoredMessage, int[] regular, int[] express, int expressCost, long[] output) {
        Solution solution = new MyApproach1();
        long[] actual = solution.minimumCosts(regular, express, expressCost);
        assertArrayEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}