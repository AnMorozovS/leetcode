package com.anmorozov.leetcode.problems.easy1480;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class P876Test {

    private static List<SolutionTestDto> testCases;

    static Stream<Arguments> runningSum() {
        return testCases.stream().map(x -> arguments(x.getNums(), x.getOutput()));
    }

    @BeforeAll
    static void init() throws IOException {
        InputStream is = P876Test.class.getResourceAsStream("p1480.json");
        ObjectMapper objectMapper = new ObjectMapper();
        testCases = objectMapper.readValue(is, new TypeReference<>() {
        });

    }

//    @ParameterizedTest(name = "{index} called with: {0}")
//    @MethodSource
//    void runningSum(int[] nums, int[] output) {
//        Solution solution = new Solution();
//        LocalDateTime startTime1 = LocalDateTime.now();
//        long startTime = System.nanoTime();
//        int[] actual = solution.runningSum(nums);
//        long endTime = System.nanoTime();
//        LocalDateTime endTime1 = LocalDateTime.now();
//        assertArrayEquals(output, actual);
//        System.out.printf("Start (%1$tL - %2$tL) for %3$f\n", startTime1, endTime1, (endTime - startTime)/ 1000000000d);
//
//    }
}