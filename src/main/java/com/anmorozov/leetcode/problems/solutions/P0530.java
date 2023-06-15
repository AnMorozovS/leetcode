package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class P0530 {

    public int getMinimumDifference(TreeNode root) {
        List<Integer> sortedList = new ArrayList<>();

        passTree(root, sortedList);

        int minDifference = Integer.MAX_VALUE;
        // Find the diff between every two consecutive values in the list.
        for (int i = 1; i < sortedList.size(); i++) {
            minDifference = Math.min(minDifference, sortedList.get(i) - sortedList.get(i - 1));
        }
        return minDifference;
    }

    public void passTree(TreeNode root, List<Integer> list) {
        if (root.left != null) {
            passTree(root.left, list);
        }
        list.add(root.value);
        if (root.right != null) {
            passTree(root.right, list);
        }
    }
}
