package com.anmorozov.leetcode.problems.similarstringgroups;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P876Test {

    @Test
    void numSimilarGroups() {
        Solution solution = new Solution();
        assertEquals(2, solution.numSimilarGroups(new String[] {"tars", "rats", "arts", "star"}));

        assertEquals(1, solution.numSimilarGroups(new String[] {"abc", "abc"}));

    }

    @Test
    void isOnlyTwoLetterWrap() {
        String[] str = {"tars", "rats", "arts", "star"};
        Solution solution = new Solution();
        assertTrue(solution.isOnlyTwoLetterWrap("tars".toCharArray(), "rats".toCharArray()));
        assertFalse(solution.isOnlyTwoLetterWrap("tars".toCharArray(), "star".toCharArray()));

    }
}