package com.anmorozov.leetcode.problems.solutions.p0235;

import com.anmorozov.leetcode.common.TreeNode;

/**
 * 235. Lowest Common Ancestor of a Binary Search Tree
 */
public interface Solution {

    /**
     * <p>Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the
     * BST.</p>
     *
     * <p>According to the <a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor" target="_blank">definition of
     * LCA on Wikipedia</a>: “The lowest common ancestor is defined between two nodes <code>p</code> and <code>q</code>
     * as the lowest node in <code>T</code> that has both <code>p</code> and <code>q</code> as descendants (where we
     * allow <strong>a node to be a descendant of itself</strong>).”</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>The number of nodes in the tree is in the range <code>[2, 10<sup>5</sup>]</code>.</li>
     * 	<li><code>-10<sup>9</sup> <= Node.val <= 10<sup>9</sup></code></li>
     * 	<li>All <code>Node.val</code> are <strong>unique</strong>.</li>
     * 	<li><code>p != q</code></li>
     * 	<li><code>p</code> and <code>q</code> will exist in the BST.</li>
     * </ul>
     *
     * @param root a binary search tree (BST)
     * @param p first node
     * @param q second node
     * @return lowest common ancestor (LCA)
     */
    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q);

}
