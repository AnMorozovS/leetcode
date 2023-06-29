package com.anmorozov.leetcode.problems.solutions.p0116;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Node {

    public int value;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int val) {
        this.value = val;
    }

    public Node(int val, Node left, Node right, Node next) {
        this.value = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }

    public static Node parsePerfectTreeFromArray(int[] root) {
        Queue<Node> queueParents = new LinkedList<>();
        Queue<Node> queueChildren = new LinkedList<>();
        for (int val : root) {
            Node node = new Node(val);
            queueParents.add(node);
            queueChildren.add(node);
        }
        Node result = queueChildren.poll();
        while (!queueParents.isEmpty() && !queueChildren.isEmpty()) {
            Node parentNode = queueParents.poll();
            parentNode.left = queueChildren.poll();
            parentNode.right = queueChildren.poll();
        }
        return result;
    }

    public static Node parseConnectedTreeFromArray(Integer[] output) {
        Queue<Node> queueParents = new LinkedList<>();
        Queue<Node> queueChildren = new LinkedList<>();

        Node previousNode = null;
        for (Integer val : output) {
            Node node = null;
            if (val != null) {
                node = new Node(val);
                queueParents.add(node);
                queueChildren.add(node);
            }

            if (previousNode != null && node != null) {
                previousNode.next = node;
            }
            previousNode = node;
        }
        Node result = queueChildren.poll();
        while (!queueParents.isEmpty()) {
            Node parentNode = queueParents.poll();
            parentNode.left = queueChildren.poll();
            parentNode.right = queueChildren.poll();
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Node node = (Node) o;

        if (value != node.value) {
            return false;
        }
        if (!Objects.equals(left, node.left)) {
            return false;
        }
        if (!Objects.equals(right, node.right)) {
            return false;
        }
        return Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
