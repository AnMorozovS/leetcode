package com.anmorozov.leetcode.problems.solutions.p1192;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1192. Critical Connections in a Network.")
class SolutionTest {

    static Stream<Arguments> criticalConnections() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1")
    @ParameterizedTest(name = "{0}, n = {1}, connections = {2}, output = {3}")
    @MethodSource("criticalConnections")
    void testMyApproach1(String ignoredMessage, int n, List<List<Integer>> connections, List<List<Integer>> output) {
        Solution solution = new MyApproach1();
        List<List<Integer>> actual = solution.criticalConnections(n, connections);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}