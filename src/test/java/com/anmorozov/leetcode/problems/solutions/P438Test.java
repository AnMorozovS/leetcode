package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.problems.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P438Test {

    private static List<Arguments> testCases;

    @BeforeAll
    static void beforeAll() throws IOException {
        BaseTest<P438Test, SolutionRecord> baseTest = new BaseTest<>(P438Test.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        testCases = baseTest.prepare();

    }

    static Stream<Arguments> findAnagrams() {
        return testCases.stream();
    }

    @ParameterizedTest(name = "{0} s = {1} p = {2} ")
    @MethodSource
    void findAnagrams(String message, String s, String p, List<Integer> output) {
        P438 p438 = new P438();
        List<Integer> actual = p438.findAnagrams(s, p);
        assertEquals(output, actual);
    }

    record SolutionRecord(String message, String s, String p, int[] output) {

        public static Arguments getArguments(SolutionRecord s) {
            return arguments(s.message, s.s, s.p, Arrays.stream(s.output).boxed().collect(Collectors.toList()));
        }
    }
}