package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.problems.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class P102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root != null) {

            addNodeToList(list, root, 0);
        }
        return list;
    }

    public void addNodeToList(List<List<Integer>> finalList, TreeNode head, int level) {
        if (head == null) {
            return;
        }
        List<Integer> list;
        if (level >= finalList.size()) {
            list = new ArrayList<>();
            finalList.add(list);
        } else {
            list = finalList.get(level);
        }
        list.add(head.val);
        int nextLevel = level + 1;
        if (head.left != null) {
            addNodeToList(finalList, head.left, nextLevel);
        }
        if (head.right != null) {
            addNodeToList(finalList, head.right, nextLevel);
        }

    }
}
