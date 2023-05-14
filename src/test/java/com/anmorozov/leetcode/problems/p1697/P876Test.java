package com.anmorozov.leetcode.problems.p1697;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class P876Test {

    private static List<SolutionTestDto> testCases;

    static Stream<Arguments> distanceLimitedPathsExist() {
        return testCases.stream().map(x -> arguments(x.getNumber(), x.getExpected(), x.getEdges(), x.getQueries()));
    }

    @BeforeAll
    static void init() throws IOException {
        InputStream is = P876Test.class.getResourceAsStream("p1697.json");
        ObjectMapper objectMapper = new ObjectMapper();
        testCases = objectMapper.readValue(is, new TypeReference<>() {
        });

    }

    @ParameterizedTest(name = "{index} called with: {0}")
    @MethodSource
    void distanceLimitedPathsExist(int n, boolean[] expected, int[][] edgeCase, int[][] queryCase) {
        Solution solution = new Solution();
        LocalDateTime startTime1 = LocalDateTime.now();
        long startTime = System.nanoTime();
        boolean[] actual = solution.distanceLimitedPathsExist(n, edgeCase, queryCase);
        long endTime = System.nanoTime();
        LocalDateTime endTime1 = LocalDateTime.now();
//        assertArrayEquals(expected, actual);
        System.out.printf("Start (%1$tL - %2$tL) for %3$f\n", startTime1, endTime1,
                (endTime - startTime) / 1000000000d);
    }
}