package com.anmorozov.leetcode.problems.solutions.p0863;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.List;

/**
 * <p><b>863.</b> All Nodes Distance K in Binary Tree.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given the {@code root} of a binary tree, the value of a target node {@code target}, and an integer {@code k},
     * return <em>an array of the values of all nodes that have a distance </em>{@code k}<em> from the target
     * node.</em></p>
     *
     * <p>You can return the answer in <strong>any order</strong>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>The number of nodes in the tree is in the range {@code [1, 500]}.</li>
     * 	<li>{@code 0 <= Node.val <= 500}</li>
     * 	<li>All the values {@code Node.val} are <strong>unique</strong>.</li>
     * 	<li>{@code target} is the value of one of the nodes in the tree.</li>
     * 	<li>{@code 0 <= k <= 1000}</li>
     * </ul>
     *
     * @param root root of a binary tree
     * @param target a target node
     * @param k a distance
     * @return <em>an array of the values of all nodes that have a distance {@code k} from the target node.</em>
     */
    List<Integer> distanceK(TreeNode root, TreeNode target, int k);
}
