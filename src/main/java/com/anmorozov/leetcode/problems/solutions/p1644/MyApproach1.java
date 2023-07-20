package com.anmorozov.leetcode.problems.solutions.p1644;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyApproach1 implements Solution {

    @Override
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> parentsP = getParents(root, p);
        List<TreeNode> parentsQ = getParents(root, q);
        if (parentsP == null || parentsQ == null) {
            return null;
        }
        Set<TreeNode> smallestRow;
        List<TreeNode> biggestRow;
        if (parentsP.size() >= parentsQ.size()) {
            smallestRow = new HashSet<>(parentsQ);
            biggestRow = parentsP;
        } else {
            smallestRow = new HashSet<>(parentsP);
            biggestRow = parentsQ;
        }
        for (TreeNode treeNode : biggestRow) {
            if (smallestRow.contains(treeNode)) {
                return treeNode;
            }
        }
        return null;
    }

    private List<TreeNode> getParents(TreeNode root, TreeNode nodeToFind) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        List<TreeNode> result;
        if (root.equals(nodeToFind)) {
            result = new ArrayList<>();
            result.add(root);
            return result;
        }
        if (left == null && right == null) {
            return null;
        }
        if (left != null) {
            result = getParents(left, nodeToFind);
            if (result != null) {
                result.add(root);
                return result;
            }
        }
        if (right != null) {
            result = getParents(right, nodeToFind);
            if (result != null) {
                result.add(root);
                return result;
            }
        }
        return null;
    }
}
