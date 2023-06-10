package com.anmorozov.leetcode.common;

import java.util.ArrayList;
import java.util.List;

public class Node {

    public int value;
    public List<Node> children;

    public Node(int value, List<Node> children) {
        this.value = value;
        this.children = children;
    }

    public static Node convertNodeArray(int[] array) {
        List<Node> parents = new ArrayList<>();
        List<Node> children = new ArrayList<>();
        Node head = null;
        Node parent = null;
        Node child;
        int parentIndex = 0;
        for (int j : array) {
            if (j == 0) {
                if (parentIndex < (parents.size() - 1)) {
                    parentIndex++;
                    parent = parents.get(parentIndex);
                } else {
                    parents = children;
                    parentIndex = 0;
                    parent = children.get(0);
                    children = new ArrayList<>();

                }
            } else {
                child = new Node(j, new ArrayList<>());
                if (head == null) {
                    head = child;
                }
                children.add(child);
                if (parent != null) {
                    parent.children.add(child);
                }
            }
        }
        return head;
    }

}
