package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class P1161 {

    SortedMap<Integer, Integer> levelBySum;

    public int maxLevelSum(TreeNode root) {
        levelBySum = new TreeMap<>();
        levelSum(List.of(root), 1);
        return levelBySum.get(levelBySum.lastKey());
    }

    public void levelSum(List<TreeNode> list, int level) {
        int sum = 0;
        List<TreeNode> nexLevelNodes = new ArrayList<>();
        for (TreeNode node : list) {
            if (node != null) {
                sum = sum + node.value;
                if (node.right != null) {
                    nexLevelNodes.add(node.right);
                }
                if (node.left != null) {
                    nexLevelNodes.add(node.left);
                }
            }
        }
        if (!levelBySum.containsKey(sum)) {
            levelBySum.put(sum, level);
        }
        if (!nexLevelNodes.isEmpty()) {
            levelSum(nexLevelNodes, level + 1);
        }
    }
}
