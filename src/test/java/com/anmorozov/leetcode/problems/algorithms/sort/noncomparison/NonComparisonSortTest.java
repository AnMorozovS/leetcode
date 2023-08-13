package com.anmorozov.leetcode.problems.algorithms.sort.noncomparison;

import com.anmorozov.leetcode.common.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Non-Comparison based sorts.")
class NonComparisonSortTest {

    static Stream<Arguments> sort() throws IOException {
        BaseTest<NonComparisonSortTest, IntegerArrayRecord> baseTestInteger = new BaseTest<>(
                NonComparisonSortTest.class,
                new TypeReference<>() {
                }, IntegerArrayRecord::getArguments);
        return baseTestInteger.prepare().stream();
    }

    @DisplayName("Counting sort")
    @ParameterizedTest(name = "{0}, input = {1}, output = {2}")
    @MethodSource("sort")
    public void testSelectionSort(String ignoredMessage, int[] input, int[] output) {
        NonComparisonSort nonComparisonSort = new CountingSort();
        nonComparisonSort.sort(input);
        assertArrayEquals(output, input);
    }

    @DisplayName("Radix sort")
    @ParameterizedTest(name = "{0}, input = {1}, output = {2}")
    @MethodSource("sort")
    public void testRadixSort(String ignoredMessage, int[] input, int[] output) {
        NonComparisonSort nonComparisonSort = new RadixSort();
        nonComparisonSort.sort(input);
        assertArrayEquals(output, input);
    }

    @DisplayName("Bucket sort")
    @ParameterizedTest(name = "{0}, input = {1}, output = {2}")
    @MethodSource("sort")
    public void testBucketSort(String ignoredMessage, int[] input, int[] output) {
        NonComparisonSort nonComparisonSort = new BucketSort(5);
        nonComparisonSort.sort(input);
        assertArrayEquals(output, input);
    }


}