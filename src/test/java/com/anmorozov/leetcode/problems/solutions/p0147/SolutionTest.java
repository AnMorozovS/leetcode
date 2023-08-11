package com.anmorozov.leetcode.problems.solutions.p0147;

import com.anmorozov.leetcode.common.BaseTest;
import com.anmorozov.leetcode.common.ListNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("147. Insertion Sort List.")
class SolutionTest {

    static Stream<Arguments> insertionSortList() throws IOException {
        BaseTest<SolutionTest, SolutionRecord> baseTest = new BaseTest<>(SolutionTest.class, new TypeReference<>() {
        }, SolutionRecord::getArguments);
        return baseTest.prepare().stream();
    }

    @DisplayName("My Approach 1 : Insertion Sort")
    @ParameterizedTest(name = "{0}")
    @MethodSource("insertionSortList")
    void testMyApproach1(String message, ListNode head, ListNode output) {
        Solution solution = new MyApproach1();
        ListNode actual = solution.insertionSortList(head);
        assertEquals(output, actual, "Problem in " + solution.getClass().getSimpleName());
    }
}