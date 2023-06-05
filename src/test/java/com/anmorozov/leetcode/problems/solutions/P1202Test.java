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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1202. Smallest String With Swaps.")
class P1202Test {

    static Stream<Arguments> smallestStringWithSwaps() throws IOException {
        BaseTest<P1202Test, SolutionRecord> baseTest = new BaseTest<>(P1202Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("smallestStringWithSwaps")
    @ParameterizedTest(name = "{0}: s = {1}, pairs = {2}, output = {3}")
    @MethodSource
    void smallestStringWithSwaps(String message, String s, List<List<Integer>> pairs, String output) {
        P1202 p1202 = new P1202();
        String actual = p1202.smallestStringWithSwaps(s, pairs);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, String s, int[][] pairs, String output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.s,
                    Stream.of(s.pairs).map(x -> List.of(x[0], x[1])).collect(Collectors.toList()), s.output);
        }
    }

}