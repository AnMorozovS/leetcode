package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("399. Evaluate Division.")
class P0399Test {

    static Stream<Arguments> calcEquation() throws IOException {
        BaseTest<P0399Test, SolutionRecord> baseTest = new BaseTest<>(P0399Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("calcEquation")
    @ParameterizedTest(name = "{0}: equations = {1}, values = {2}, queries = {3}, output = {4}")
    @MethodSource
    void calcEquation(String message, List<List<String>> equations, double[] values, List<List<String>> queries,
                      double[] output) {
        P0399 p0399 = new P0399();
        double[] actual = p0399.calcEquation(equations, values, queries);
        assertArrayEquals(output, actual);
    }

    record SolutionRecord(String message, String[][] equations, double[] values, String[][] queries,
                          double[] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message,
                    Stream.of(s.equations).map(x -> List.of(x[0], x[1])).collect(Collectors.toList()), s.values,
                    Stream.of(s.queries).map(x -> List.of(x[0], x[1])).collect(Collectors.toList()), s.output);
        }
    }

}