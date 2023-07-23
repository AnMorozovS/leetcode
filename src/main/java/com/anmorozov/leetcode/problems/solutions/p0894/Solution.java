package com.anmorozov.leetcode.problems.solutions.p0894;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.List;

/**
 * 894. All Possible Full Binary Trees.
 */
public interface Solution {

    /**
     * <p>Given an integer {@code n}, return <em>a list of all possible <strong>full binary trees</strong> with</em>
     * {@code n} <em>nodes</em>. Each node of each tree in the answer must have {@code Node.val == 0}.</p>
     *
     * <p>Each element of the answer is the root node of one possible tree. You may return the final list of trees in
     * <strong>any order</strong>.</p>
     *
     * <p>A <strong>full binary tree</strong> is a binary tree where each node has exactly {@code 0} or {@code 2}
     * children.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= n <= 20}</li>
     * </ul>
     *
     * @param n number of nodes
     * @return list of possible tree
     */
    List<TreeNode> allPossibleFBT(int n);

}
