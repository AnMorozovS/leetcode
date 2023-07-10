package com.anmorozov.leetcode.problems.solutions.p0111;

import com.anmorozov.leetcode.common.TreeNode;

/**
 * <p><b>111.</b> Minimum Depth of Binary Tree.</p>
 */
public interface Solution {

    /**
     * <p>Given a binary tree, find its minimum depth.</p>
     *
     * <p>The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf
     * node.</p>
     *
     * <p><strong>Note:</strong> A leaf is a node with no children.</p>
     *
     * <p>&nbsp;</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>The number of nodes in the tree is in the range {@code [0, 10}<sup>5</sup>].</li>
     * 	<li>{@code -1000 <= Node.val <= 1000}</li>
     * </ul>
     *
     * @param root a binary tree root node
     * @return minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf
     * node.
     */
    int minDepth(TreeNode root);

}
