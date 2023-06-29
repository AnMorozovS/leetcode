package com.anmorozov.leetcode.problems.solutions.p0116;

/**
 * <p><b>116.</b> Populating Next Right Pointers in Each Node</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>You are given a <strong>perfect binary tree</strong> where all leaves are on the same level, and every parent
     * has two children. The binary tree has the following definition:</p>
     *
     * <pre>struct Node {
     *   int val;
     *   Node *left;
     *   Node *right;
     *   Node *next;
     * }
     * </pre>
     *
     * <p>Populate each next pointer to point to its next right node. If there is no next right node, the next pointer
     * should be set to {@code NULL}.</p>
     *
     * <p>Initially, all next pointers are set to {@code NULL}.</p>
     *
     * <p>&nbsp;</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * <li>The number of nodes in the tree is in the range {@code [0, 2}<sup>12</sup>{@code  - 1]}.</li>
     * <li>{@code -1000 <= Node.val <= 1000}</li>
     * </ul>
     *
     * <p>&nbsp;</p>
     * <p><strong>Follow-up:</strong></p>
     *
     * <ul>
     * <li>You may only use constant extra space.</li>
     * <li>The recursive approach is fine. You may assume implicit stack space does not count as extra space for this problem.</li>
     * </ul>
     *
     * @param root <strong>perfect binary tree</strong> where all leaves are on the same level, and every parent has two
     * children
     * @return root connected horizontally
     */
    Node connect(Node root);
}
