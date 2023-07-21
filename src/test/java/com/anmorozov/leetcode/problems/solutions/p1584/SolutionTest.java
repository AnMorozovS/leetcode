package com.anmorozov.leetcode.problems.solutions.p1584;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1584. Min Cost to Connect All Points.")
class SolutionTest {

    static Stream<Arguments> minCostConnectPoints() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.minCostConnectPoints")
    @ParameterizedTest(name = "{0}: points = {1}, output = {2}")
    @MethodSource("minCostConnectPoints")
    void testMyApproach2(String message, int[][] points, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.minCostConnectPoints(points);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}