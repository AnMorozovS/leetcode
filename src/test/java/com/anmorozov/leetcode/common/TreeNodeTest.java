package com.anmorozov.leetcode.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TreeNodeTest {

    @Test
    void testEquals() {
        assertNotEquals(new TreeNode(0), null);
        assertNotEquals(new TreeNode(0, new TreeNode(1), null), new TreeNode(0, new TreeNode(2), null));
    }
}