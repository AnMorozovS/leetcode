package com.anmorozov.leetcode.problems.solutions.p1051;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1051. Height Checker.")
class SolutionTest {

    static Stream<Arguments> heightChecker() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 :")
    @ParameterizedTest(name = "{0}: heights = {1}, output = {2}")
    @MethodSource("heightChecker")
    void testApproach1(String ignoredMessage, int[] heights, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.heightChecker(heights);
        assertEquals(output, actual);
    }
}