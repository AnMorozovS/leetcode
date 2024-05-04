package com.anmorozov.leetcode.problems.solutions.p0429;

import com.anmorozov.leetcode.common.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyApproach1 implements Solution {

    @Override
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> parentsNodes = new LinkedList<>();
        if (root == null) {
            return result;
        }
        parentsNodes.add(root);
        while (true) {
            Queue<Node> childNodes = new LinkedList<>();
            List<Integer> levelNodes = new ArrayList<>();
            for (Node parent : parentsNodes) {
                childNodes.addAll(parent.children());
                levelNodes.add(parent.value());
            }
            result.add(levelNodes);
            parentsNodes = childNodes;
            if (childNodes.isEmpty()) {
                break;
            }
        }
        return result;
    }
}
