package com.anmorozov.leetcode.problems.solutions.p2483;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2483. Minimum Penalty for a Shop.")
class SolutionTest {

    static Stream<Arguments> bestClosingTime() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1.bestClosingTime")
    @ParameterizedTest(name = "{0}: customers = {1}, output = {2}")
    @MethodSource("bestClosingTime")
    void testMyApproach1(String ignoredMessage, String customers, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.bestClosingTime(customers);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}