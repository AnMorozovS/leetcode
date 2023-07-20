package com.anmorozov.leetcode.problems.solutions.p1644;

import com.anmorozov.leetcode.common.TreeNode;

/**
 * Approach 1: Depth First Search - Modify LCA Solution
 */
public class Approach1 implements Solution {

    @Override
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = lowestCommonAncestorUniversal(root, p, q);
        if (ans == p) // check if q is in the subtree of p
        {
            return deapFirstSearch(p, q) ? p : null;
        } else if (ans == q) // check if p is in the subtree of q
        {
            return deapFirstSearch(q, p) ? q : null;
        }
        return ans;
    }

    public TreeNode lowestCommonAncestorUniversal(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null || node == p || node == q) {
            return node;
        }
        TreeNode left = lowestCommonAncestorUniversal(node.left, p, q);
        TreeNode right = lowestCommonAncestorUniversal(node.right, p, q);
        if (left != null && right != null) {
            return node;
        } else if (left != null) {
            return left;
        } else {
            return right;
        }
    }

    public boolean deapFirstSearch(TreeNode node, TreeNode target) {
        if (node == target) {
            return true;
        }
        if (node == null) {
            return false;
        }
        return deapFirstSearch(node.left, target) || deapFirstSearch(node.right, target);
    }
}
