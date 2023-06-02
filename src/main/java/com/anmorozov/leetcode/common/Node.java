package com.anmorozov.leetcode.common;

import java.util.ArrayList;
import java.util.List;

public class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public static Node convertNodeArray(int[] array) {
        List<Node> parents = new ArrayList<>();
        List<Node> children = new ArrayList<>();
        Node head = null;
        Node parent = null;
        Node child;
        int parentIndex = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%1$d] = %2$d group %3$d in %4$d\n", i, array[i], parentIndex, parents.size());
            if (array[i] == 0) {
                if (parentIndex < (parents.size() - 1)) {
                    System.out.println("group change");
                    parentIndex++;
                    parent = parents.get(parentIndex);
                } else {
                    System.out.println("level change");
                    parents = children;
                    parentIndex = 0;
                    parent = children.get(0);
                    children = new ArrayList<>();

                }
            } else {
                System.out.println("child change");
                child = new Node(array[i], new ArrayList<>());
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
