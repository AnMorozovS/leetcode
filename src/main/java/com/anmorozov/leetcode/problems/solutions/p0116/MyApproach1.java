package com.anmorozov.leetcode.problems.solutions.p0116;

import java.util.LinkedList;
import java.util.Queue;

public class MyApproach1 implements Solution {

    @Override
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> parentQueue = new LinkedList<>();
        Queue<Node> childQueue = new LinkedList<>();
        parentQueue.add(root);
        while (true) {
            Queue<Node> tmp = new LinkedList<>();
            while (!parentQueue.isEmpty()) {
                Node parent = parentQueue.poll();
                if (parent.left != null) {
                    childQueue.add(parent.left);
                    tmp.add(parent.left);
                }
                if (parent.right != null) {
                    childQueue.add(parent.right);
                    tmp.add(parent.right);
                }
            }
            if (childQueue.isEmpty()) {
                break;
            }
            Node previous = childQueue.poll();
            while (!childQueue.isEmpty()) {
                Node poll = childQueue.poll();
                previous.next = poll;
                previous = poll;
            }
            parentQueue = tmp;
        }
        return root;
    }
}
