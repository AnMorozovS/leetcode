package com.anmorozov.leetcode.problems.solutions.p0095;

import com.anmorozov.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Approach 3: Dynamic Programming with Space Optimization
 */
public class Approach3 implements Solution {

    @Override
    public List<TreeNode> generateTrees(int n) {
        List<List<TreeNode>> dp = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            dp.add(new ArrayList<>());
        }
        dp.getFirst().add(null);

        for (int numberOfNodes = 1; numberOfNodes <= n; numberOfNodes++) {
            for (int i = 1; i <= numberOfNodes; i++) {
                int j = numberOfNodes - i;
                for (TreeNode left : dp.get(i - 1)) {
                    for (TreeNode right : dp.get(j)) {
                        TreeNode root = new TreeNode(i, left, clone(right, i));
                        dp.get(numberOfNodes).add(root);
                    }
                }
            }
        }
        return dp.get(n);
    }

    private TreeNode clone(TreeNode node, int offset) {
        if (node == null) {
            return null;
        }
        TreeNode clonedNode = new TreeNode(node.value + offset);
        clonedNode.left = clone(node.left, offset);
        clonedNode.right = clone(node.right, offset);
        return clonedNode;
    }
}
