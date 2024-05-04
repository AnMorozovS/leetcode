package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class P0098 {

    private final Deque<TreeNode> stack = new LinkedList<>();
    private final Deque<Integer> upperLimits = new LinkedList<>();
    private final Deque<Integer> lowerLimits = new LinkedList<>();

    public void update(TreeNode root, Integer low, Integer high) {
        stack.add(root);
        lowerLimits.add(low);
        upperLimits.add(high);
    }

    public boolean isValidBST(TreeNode root) {
        Integer low;
        Integer high;
        Integer val;
        update(root, null, null);

        while (!stack.isEmpty()) {
            root = stack.poll();
            low = lowerLimits.poll();
            high = upperLimits.poll();

            if (root == null) {
                continue;
            }
            val = root.value;
            if (low != null && val <= low) {
                return false;
            }
            if (high != null && val >= high) {
                return false;
            }
            update(root.right, val, high);
            update(root.left, low, val);
        }
        return true;
    }

}
