package com.anmorozov.leetcode.problems.solutions.p0250;

import com.anmorozov.leetcode.common.TreeNode;

/**
 * <p>250. Count Uni-value Subtrees.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given the {@code root} of a binary tree, return <em>the number of <strong>uni-value</strong>
     * subtrees</em>.</p>
     *
     * <p>A <strong>uni-value subtree</strong> means all nodes of the subtree have the same value.</p>
     * <p>&nbsp;</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>The number of the node in the tree will be in the range {@code [0, 1000]}.</li>
     * 	<li>{@code -1000 <= Node.val <= 1000}</li>
     * </ul>
     *
     * @param root binary tree
     * @return <em>the number of <strong>uni-value</strong> subtrees</em>
     */
    int countUnivalSubtrees(TreeNode root);
}
