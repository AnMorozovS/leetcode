package com.anmorozov.leetcode.problems.solutions.p0095;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.List;

/**
 * <p><strong>95.</strong> Unique Binary Search Trees II.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>Given an integer {@code n}, return <em>all the structurally unique <strong>BST'</strong>s (binary search
     * trees), which has exactly </em>{@code n}<em> nodes of unique values from</em> {@code 1} <em>to</em> {@code n}.
     * Return the answer in <strong>any order</strong>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     * 	<li>{@code 1 <= n <= 8}</li>
     * </ul>
     *
     * @param n nodes of unique values
     * @return the answer in <strong>any order</strong>
     */
    List<TreeNode> generateTrees(int n);

}
