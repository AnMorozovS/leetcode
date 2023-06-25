package com.anmorozov.leetcode.problems.solutions.p1575;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1575. Count All Possible Routes")
class SolutionTest {

    static Stream<Arguments> countRoutes() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("countRoutes")
    @ParameterizedTest(name = "{0}: locations = {1}, start = {2}, finish = {3}, fuel = {4}, output = {5}")
    @MethodSource
    void countRoutes(String message, int[] locations, int start, int finish, int fuel, int output) {
        Solution solution = new MyApproach1();
        int actual = solution.countRoutes(locations, start, finish, fuel);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] locations, int start, int finish, int fuel, int output) {

        public static Arguments getArguments(
                SolutionRecord s) {
            return arguments(s.message, s.locations, s.start, s.finish, s.fuel, s.output);
        }
    }

}