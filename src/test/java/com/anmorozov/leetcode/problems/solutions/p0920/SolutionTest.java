package com.anmorozov.leetcode.problems.solutions.p0920;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("920. Number of Music Playlists.")
class SolutionTest {

    static Stream<Arguments> numMusicPlaylists() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1: ")
    @ParameterizedTest(name = "{0}: n = {1}, goal = {2}, k = {3}, output = {4}")
    @MethodSource("numMusicPlaylists")
    void testMyApproach1(String ignoredMessage, int n, int goal, int k, int output) {

        Solution solution = new MyApproach1();
        int actual = solution.numMusicPlaylists(n, goal, k);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

}