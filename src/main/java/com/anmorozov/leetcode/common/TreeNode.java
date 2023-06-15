package com.anmorozov.leetcode.common;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

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
        } else if (val < nodeNumber) {
            if (this.right == null) {
                return null;
            } else {
                return this.right.findByNumber(nodeNumber);
            }
        } else {
            if (this.left == null) {
                return null;
            } else {
                return this.left.findByNumber(nodeNumber);
            }
        }
    }

    @Override
    public String toString() {
        List<SortedMap<Integer, String>> finalList = new ArrayList<>();

        addNodeToList(finalList, this, 0, 0);

        StringBuilder buffer = new StringBuilder();

        int maxLevel = finalList.size() - 1;

        int maxLevelSize = ((Float) Math.scalb(1, maxLevel)).intValue();
        for (int i = 0; i < finalList.size(); i++) {
            buffer.append(" ".repeat(Math.max(0, maxLevel - i)));
            SortedMap<Integer, String> map = finalList.get(i);
            int currentPower = ((Float) Math.scalb(1, maxLevel - i)).intValue();
            for (int j = 0; j < maxLevelSize; j++) {
                int currentIndex = j / currentPower;
                int mod = j % currentPower;
                if (mod == 0) {
                    buffer.append(map.getOrDefault(currentIndex, " "));
                } else {
                    buffer.append(" ");
                }
                buffer.append(" ");
            }
            buffer.append('\n');
        }
        return buffer.toString();
    }

    public void addNodeToList(List<SortedMap<Integer, String>> finalList, TreeNode head, int level, int number) {

        SortedMap<Integer, String> map;
        if (level >= finalList.size()) {
            map = new TreeMap<>();
            finalList.add(map);
        } else {
            map = finalList.get(level);
        }
        map.put(number, String.valueOf(head.value));
        int nextLevel = level + 1;
        if (head.left != null) {
            int nextLevelNumber = number * 2;
            addNodeToList(finalList, head.left, nextLevel, nextLevelNumber);
        }
        if (head.right != null) {
            int nextLevelNumber = number * 2 + 1;
            addNodeToList(finalList, head.right, nextLevel, nextLevelNumber);
        }

    }


}
