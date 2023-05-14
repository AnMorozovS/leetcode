package com.anmorozov.leetcode.problems.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P876Test {

    @Test
    void search() {

        Solution solution = new Solution();
        assertEquals(4, solution.search(new int[] {-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, solution.search(new int[] {-1, 0, 3, 5, 9, 12}, 2));
        assertEquals(1, solution.search(new int[] {2, 5}, 5));


    }
}