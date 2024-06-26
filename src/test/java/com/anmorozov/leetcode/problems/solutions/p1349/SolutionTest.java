package com.anmorozov.leetcode.problems.solutions.p1349;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1349. Maximum Students Taking Exam.")
class SolutionTest {

    static Stream<Arguments> maxStudents() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: ")
    @ParameterizedTest(name = "{0}, s = {1}, output = {3}")
    @MethodSource("maxStudents")
    void testMyApproach1(String ignoredMessage, char[][] seats, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.maxStudents(seats);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}