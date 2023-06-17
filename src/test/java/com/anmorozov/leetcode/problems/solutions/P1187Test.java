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

@DisplayName("1187. Make Array Strictly Increasing.")
class P1187Test {

    static Stream<Arguments> makeArrayIncreasing() throws IOException {
        BaseTest<P1187Test, SolutionRecord> baseTest = new BaseTest<>(P1187Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("makeArrayIncreasing")
    @ParameterizedTest(name = "{0}: arr1 = {1}, arr2 = {2}, output = {3} ")
    @MethodSource
    void makeArrayIncreasing(String message, int[] arr1, int[] arr2, int output) {
        P1187 p1187 = new P1187();
        int actual = p1187.makeArrayIncreasing(arr1, arr2);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, int[] arr1, int[] arr2, int output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.arr1, s.arr2, s.output);
        }
    }

}