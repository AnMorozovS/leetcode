package com.anmorozov.leetcode.problems.solutions.p0146;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("146. LRU Cache.")
class SolutionTest {

    static Stream<Arguments> useLRUCache() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(
                SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("MyApproach1: default java LinkedHashMap realisation ")
    @ParameterizedTest(name = "{0}: capacity ={1}, methods = {2}, parameters = {3}, output = {4}")
    @MethodSource("useLRUCache")
    void testMyApproach1(String message, int capacity, String[] methods, int[][] parameters, Integer[] output) {

        LRUCache cache = new MyLRUCache(capacity);
        Solution<?> solution = () -> cache;
        Integer[] actual = solution.useLRUCache(methods, parameters);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(output, actual, "Problem in " + cache.getClass().getSimpleName());
    }

    @DisplayName("Approach 1: Doubly Linked List")
    @ParameterizedTest(name = "{0}: capacity ={1}, methods = {2}, parameters = {3}, output = {4}")
    @MethodSource("useLRUCache")
    void testApproach1(String message, int capacity, String[] methods, int[][] parameters, Integer[] output) {

        LRUCache cache = new Approach1LRUCache(capacity);
        Solution<?> solution = () -> cache;
        Integer[] actual = solution.useLRUCache(methods, parameters);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(output, actual, "Problem in " + cache.getClass().getSimpleName());
    }
}