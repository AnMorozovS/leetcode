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

@DisplayName("1230. Toss Strange Coins.")
class P1230Test {

    static Stream<Arguments> probabilityOfHeads() throws IOException {
        BaseTest<P1230Test, SolutionRecord> baseTest = new BaseTest<>(P1230Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("probabilityOfHeads")
    @ParameterizedTest(name = "{0}: prob = {1}, target = {2}, output = {3}")
    @MethodSource
    void probabilityOfHeads(String message, double[] prob, int target, double output) {
        P1230 p1230 = new P1230();
        double actual = p1230.probabilityOfHeads(prob, target);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, double[] prob, int target, double output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.prob, s.target, s.output);
        }
    }

}