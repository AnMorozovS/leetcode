package com.anmorozov.leetcode.problems.solutions.p0111;

import com.anmorozov.leetcode.common.TreeNode;

/**
 * My Approach: Depth-First Search (DFS) with recursion
 */
public class MyApproach1 implements Solution {

    /**
     * Empty instance no storage values
     */
    public MyApproach1() {
    }

    @Override
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else {
            int leftMin = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
            int rightMin = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;
            return Math.min(leftMin, rightMin) + 1;
        }
    }

}
