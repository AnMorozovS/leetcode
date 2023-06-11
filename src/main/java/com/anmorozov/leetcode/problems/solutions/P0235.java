package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class P0235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pList = new ArrayList<>();
        if (!getParentNodes(root, p, pList)) {
            return null;
        }

        List<TreeNode> qList = new ArrayList<>();
        if (!getParentNodes(root, q, qList)) {
            return null;
        }

        TreeNode result = null;
        int i = 0;
        while (i < pList.size() && i < qList.size()) {
            if (pList.get(i) == qList.get(i)) {
                result = pList.get(i);
            } else {
                break;
            }
            i++;
        }
        return result;
    }

    public boolean getParentNodes(TreeNode root, TreeNode node, List<TreeNode> pList) {
        if (root == null) {
            return false;
        }
        pList.add(root);
        if (root.value == node.value) {
            return true;
        } else {
            if (root.value <= node.value) {
                return getParentNodes(root.right, node, pList);
            }
            return getParentNodes(root.left, node, pList);
        }
    }
}
