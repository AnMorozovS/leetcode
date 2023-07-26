package com.anmorozov.leetcode.problems.solutions.p0841;

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

@DisplayName("841. Keys and Rooms.")
class SolutionTest {

    static Stream<Arguments> canVisitAllRooms() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: Brute force with cash result.")
    @ParameterizedTest(name = "{0}: rooms = {1}, output = {2}")
    @MethodSource("canVisitAllRooms")
    void testMyApproach1(String message, List<List<Integer>> rooms, boolean output) {

        Solution solution = new MyApproach1();
        boolean actual = solution.canVisitAllRooms(rooms);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach #1: Depth-First Search [Accepted]")
    @ParameterizedTest(name = "{0}: rooms = {1}, output = {2}")
    @MethodSource("canVisitAllRooms")
    void testApproach1(String message, List<List<Integer>> rooms, boolean output) {

        Solution solution = new Approach1();
        boolean actual = solution.canVisitAllRooms(rooms);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}