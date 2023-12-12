package com.anmorozov.leetcode.common;

import java.util.*;

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
        if (array.isEmpty()) {
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

    public static List<Integer> convertToArray(TreeNode root) {
        List<Integer> array = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                queue.add(current.left);
                queue.add(current.right);
                array.add(current.value);
            } else {
                array.add(null);
            }
        }
        int lastNotNull = 0;
        for (int i = array.size() - 1; i >= 0; i--) {
            if (array.get(i) != null) {
                lastNotNull = i + 1;
                break;
            }
        }
        return array.subList(0, lastNotNull);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TreeNode treeNode = (TreeNode) o;

        if (value != treeNode.value) {
            return false;
        }
        if (!Objects.equals(left, treeNode.left)) {
            return false;
        }
        return Objects.equals(right, treeNode.right);
    }

}
