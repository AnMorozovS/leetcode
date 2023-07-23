package com.anmorozov.leetcode.common;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static TreeNode convertFromArray(List<Integer> array) {
        if (array.size() <= 0) {
            return null;
        }
        List<TreeNode> parents = new ArrayList<>();
        List<TreeNode> children = new ArrayList<>();
        TreeNode head = new TreeNode(array.get(0));
        TreeNode parent = head;
        parents.add(parent);
        TreeNode child;
        int parentIndex = 0;
        for (int i = 1; i < array.size(); i++) {
            if (parentIndex >= parents.size() * 2) {
                parents = children;
                parentIndex = 0;
                children = new ArrayList<>();
            }
            if (array.get(i) != null) {
                child = new TreeNode(array.get(i));
                children.add(child);
                parent = parents.get(parentIndex / 2);
                if (parentIndex % 2 == 0) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
            }
            parentIndex++;

        }
        return head;
    }

    public TreeNode findByNumber(int nodeNumber) {
        int val = this.value;
        if (val == nodeNumber) {
            return this;
        }
        TreeNode result = null;
        if (this.right != null) {
            result = this.right.findByNumber(nodeNumber);
        }
        if (result != null) {
            return result;
        }
        if (this.left != null) {
            result = this.left.findByNumber(nodeNumber);
        }
        return result;
    }
}
