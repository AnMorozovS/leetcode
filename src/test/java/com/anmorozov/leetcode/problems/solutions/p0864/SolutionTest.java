package com.anmorozov.leetcode.problems.solutions.p0864;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("864. Shortest Path to Get All Keys.")
class SolutionTest {

    static Stream<Arguments> shortestPathAllKeys() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("Approach: Breadth-First Search")
    @ParameterizedTest(name = "{0}: grid = {1}, output = {2}")
    @MethodSource("shortestPathAllKeys")
    void testApproach1(String message, String[] grid, int output) {
        Solution solution = new Approach1();
        int actual = solution.shortestPathAllKeys(grid);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}