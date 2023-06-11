package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0438Test {

    static Stream<Arguments> findAnagrams() throws IOException {
        BaseTest<P0438Test, SolutionRecord> baseTest = new BaseTest<>(P0438Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @ParameterizedTest(name = "{0} s = {1} p = {2} ")
    @MethodSource
    void findAnagrams(String message, String s, String p, List<Integer> output) {
        P0438 p0438 = new P0438();
        List<Integer> actual = p0438.findAnagrams(s, p);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, String s, String p, int[] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.s, s.p, Arrays.stream(s.output).boxed().collect(Collectors.toList()));
        }
    }
}