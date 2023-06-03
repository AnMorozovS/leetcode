package com.anmorozov.leetcode.problems.solutions;

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

@DisplayName("1376. Time Needed to Inform All Employees.")
class P1376Test {

    static Stream<Arguments> numOfMinutes() throws IOException {
        BaseTest<P1376Test, SolutionRecord> baseTest = new BaseTest<>(P1376Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("numOfMinutes")
    @ParameterizedTest(name = "{0}: n = {1}, headID = {2}, manager = {3}, informTime = {4}")
    @MethodSource
    void numOfMinutes(String message, int n, int headID, int[] manager, int[] informTime, int output) {
        P1376 p1376 = new P1376();
        int actual = p1376.numOfMinutes(n, headID, manager, informTime);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int n, int headID, int[] manager, int[] informTime, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.n, s.headID, s.manager, s.informTime, s.output);
        }
    }

}