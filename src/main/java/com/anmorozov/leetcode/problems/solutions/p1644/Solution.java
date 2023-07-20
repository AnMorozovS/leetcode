package com.anmorozov.leetcode.problems.solutions.p1644;

import com.anmorozov.leetcode.common.TreeNode;

/**
 * <p><b>1644.</b> Lowest Common Ancestor of a Binary Tree II</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given the {@code root} of a binary tree, return <em>the lowest common ancestor (LCA) of two given nodes,
     * </em>{@code p}<em> and </em>{@code q}. If either node {@code p} or {@code q} <strong>does not exist</strong> in
     * the tree, return {@code null}. All values of the nodes in the tree are <strong>unique</strong>.</p>
     *
     * <p>According to the <strong><a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor"
     * target="_blank">definition of LCA on Wikipedia</a></strong>: "The lowest common ancestor of two nodes {@code p}
     * and {@code q} in a binary tree {@code T} is the lowest node that has both {@code p} and {@code q} as
     * <strong>descendants</strong> (where we allow <b>a node to be a descendant of itself</b>)". A
     * <strong>descendant</strong> of a node {@code x} is a node {@code y} that is on the path from node {@code x} to
     * some leaf node.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>The number of nodes in the tree is in the range {@code [1, 10}<sup>4</sup>{@code ]}.</li>
     * 	<li>{@code -10}<sup>9</sup>{@code  <= Node.val <= 10}<sup>9</sup></li>
     * 	<li>All {@code Node.val} are <strong>unique</strong>.</li>
     * 	<li>{@code p != q}</li>
     * </ul>
     *
     * @param root of a binary tree
     * @param p first node
     * @param q second node
     * @return the lowest common ancestor (LCA)
     */
    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q);
}
