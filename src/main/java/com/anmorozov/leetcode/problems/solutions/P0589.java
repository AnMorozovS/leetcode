package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.Node;

import java.util.ArrayList;
import java.util.List;

public class P0589 {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            list.add(root.value());
            addNodeToList(list, root);
        }
        return list;
    }

    public void addNodeToList(List<Integer> list, Node head) {
        for (Node child : head.children()) {
            list.add(child.value());
            addNodeToList(list, child);
        }
    }

}
