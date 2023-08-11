package com.anmorozov.leetcode.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ListNodeTest {

    @Test
    void testEquals() {
        assertNotEquals(new ListNode(0), null);
        assertNotEquals(new ListNode(0), new ListNode(1));
    }
}