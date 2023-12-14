package com.anmorozov.leetcode.problems.solutions.p0095;

import com.anmorozov.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Approach 1: Recursive Dynamic Programming.
 */
public class Approach1 implements Solution {

    private List<TreeNode> allPossibleBST(int start, int end, Map<Pair, List<TreeNode>> memo) {
        List<TreeNode> res = new ArrayList<>();
        if (start > end) {
            res.add(null);
            return res;
        }
        if (memo.containsKey(new Pair(start, end))) {
            return memo.get(new Pair(start, end));
        }
        // Iterate through all values from start to end to construct left and right subtree recursively.
        for (int i = start; i <= end; ++i) {
            List<TreeNode> leftSubTrees = allPossibleBST(start, i - 1, memo);
            List<TreeNode> rightSubTrees = allPossibleBST(i + 1, end, memo);

            // Loop through all left and right subtrees and connect them to ith root.
            for (TreeNode left : leftSubTrees) {
                for (TreeNode right : rightSubTrees) {
                    TreeNode root = new TreeNode(i, left, right);
                    res.add(root);
                }
            }
        }
        memo.put(new Pair(start, end), res);
        return res;
    }

    @Override
    public List<TreeNode> generateTrees(int n) {
        Map<Pair, List<TreeNode>> memo = new HashMap<>();
        return allPossibleBST(1, n, memo);
    }

    record Pair(Integer key, Integer value) {
    }
}
