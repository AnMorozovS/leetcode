package com.anmorozov.leetcode.problems.solutions.p0063;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("63. Unique Paths II.")
class SolutionTest {

    static Stream<Arguments> uniquePathsWithObstacles() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1:")
    @ParameterizedTest(name = "{0}, obstacleGrid = {1}, output = {2}")
    @MethodSource("uniquePathsWithObstacles")
    void testMyApproach1(String ignoredMessage, int[][] obstacleGrid, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}