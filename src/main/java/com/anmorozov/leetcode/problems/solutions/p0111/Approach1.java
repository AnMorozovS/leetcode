package com.anmorozov.leetcode.problems.solutions.p0111;

import com.anmorozov.leetcode.common.TreeNode;

/**
 * Approach 1: Depth-First Search (DFS)
 */
public class Approach1 implements Solution {

    private int depthFirstSearch(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // If only one of child is non-null, then go into that recursion.
        if (root.left == null) {
            return 1 + depthFirstSearch(root.right);
        } else if (root.right == null) {
            return 1 + depthFirstSearch(root.left);
        }

        // Both children are non-null, hence call for both childs.
        return 1 + Math.min(depthFirstSearch(root.left), depthFirstSearch(root.right));
    }

    @Override
    public int minDepth(TreeNode root) {
        return depthFirstSearch(root);
    }
}
