package com.anmorozov.leetcode.problems.solutions.p0735;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("735. Asteroid Collision.")
class SolutionTest {

    static Stream<Arguments> asteroidCollision() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My approach : use Deque")
    @ParameterizedTest(name = "{0}: asteroids = {1}, output = {2}")
    @MethodSource("asteroidCollision")
    void testMyApproach1(String message, int[] asteroids, int[] output) {

        Solution solution = new MyApproach1();
        int[] actual = solution.asteroidCollision(asteroids);
        assertArrayEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }

    @DisplayName("Approach 1 : use Stack.")
    @ParameterizedTest(name = "{0}: asteroids = {1}, output = {2}")
    @MethodSource("asteroidCollision")
    void testApproach1(String message, int[] asteroids, int[] output) {

        Solution solution = new Approach1();
        int[] actual = solution.asteroidCollision(asteroids);
        assertArrayEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}