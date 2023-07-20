package com.anmorozov.leetcode.problems.solutions.p0429;

import com.anmorozov.leetcode.common.Node;
import java.util.List;

/**
 * <p><b>429.</b> N-ary Tree Level Order Traversal.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given an n-ary tree, return the <em>level order</em> traversal of its nodes' values.</p>
     *
     * <p><em>Nary-Tree input serialization is represented in their level order traversal, each group of children is
     * separated by the null value (See examples).</em></p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>The height of the n-ary tree is less than or equal to {@code 1000}</li>
     * 	<li>The total number of nodes is between {@code [0, 10}<sup>4</sup>]</li>
     * </ul>
     */
    List<List<Integer>> levelOrder(Node root);

}
