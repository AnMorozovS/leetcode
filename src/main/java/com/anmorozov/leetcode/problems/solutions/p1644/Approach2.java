package com.anmorozov.leetcode.problems.solutions.p1644;

import com.anmorozov.leetcode.common.TreeNode;

/**
 * Approach 2: Depth First Search - 2/3 Conditions
 */
public class Approach2 implements Solution {

    boolean nodesFound = false;

    @Override
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode ans = deapFirstSearch(root, p, q);
        return nodesFound ? ans : null;

    }

    private TreeNode deapFirstSearch(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return null;
        }
        TreeNode left = deapFirstSearch(node.left, p, q);
        TreeNode right = deapFirstSearch(node.right, p, q);
        int conditions = 0;
        if (node == p || node == q) {
            conditions++;
        }
        if (left != null) {
            conditions++;
        }
        if (right != null) {
            conditions++;
        }
        if (conditions == 2) {
            nodesFound = true;
        }

        if ((left != null && right != null) || node == p || node == q) {
            return node;
        }
        return left != null ? left : right;
    }
}
