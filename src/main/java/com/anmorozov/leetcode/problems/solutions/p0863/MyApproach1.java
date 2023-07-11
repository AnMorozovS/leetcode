package com.anmorozov.leetcode.problems.solutions.p0863;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * My Approach 1: Cash parents then use Breadth-First Search algorithm
 */
public class MyApproach1 implements Solution {

    @Override
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if (k == 0) {
            return List.of(target.value);
        }
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> parents = getParents(root, target);
        if (parents == null) {
            parents = new LinkedList<>();
        }
        Queue<TreeNode> nextNodes = new LinkedList<>();
        if (target.left != null) {
            nextNodes.add(target.left);
        }
        if (target.right != null) {
            nextNodes.add(target.right);
        }
        TreeNode previousParent = target;
        for (int i = 0; i < k; i++) {
            Queue<TreeNode> tmpNodes = new LinkedList<>();
            while (!nextNodes.isEmpty()) {
                TreeNode currentNode = nextNodes.poll();
                if (i == k - 1) {
                    result.add(currentNode.value);
                }
                if (currentNode.left != null) {
                    tmpNodes.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    tmpNodes.add(currentNode.right);
                }
            }
            TreeNode currentParentNode = parents.poll();
            if (currentParentNode != null) {
                if (i == k - 1) {
                    result.add(currentParentNode.value);
                }
                if (currentParentNode.left != null && !currentParentNode.left.equals(previousParent)) {
                    tmpNodes.add(currentParentNode.left);
                }
                if (currentParentNode.right != null && !currentParentNode.right.equals(previousParent)) {
                    tmpNodes.add(currentParentNode.right);
                }
                previousParent = currentParentNode;
            }
            nextNodes = tmpNodes;
        }
        return result;
    }

    private Queue<TreeNode> getParents(TreeNode root, TreeNode target) {
        if (root.equals(target)) {
            return new LinkedList<>();
        }
        Queue<TreeNode> result;
        if (root.left != null) {
            result = getParents(root.left, target);
            if (result != null) {
                result.add(root);
                return result;
            }
        }
        if (root.right != null) {
            result = getParents(root.right, target);
            if (result != null) {
                result.add(root);
                return result;
            }
        }
        return null;
    }
}
