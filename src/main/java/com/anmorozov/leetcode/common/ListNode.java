package com.anmorozov.leetcode.common;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode addCycleToEnd(ListNode head, int lastNodeIndex) {
        ListNode savedNode = null;
        ListNode currentNode = head;
        if (currentNode != null) {
            int i = 0;
            while (currentNode.next != null) {
                if (i == lastNodeIndex) {
                    savedNode = currentNode;
                }
                i++;
                currentNode = currentNode.next;
            }
            currentNode.next = savedNode;
        }
        return head;
    }

    public static int getIndex(ListNode head, ListNode neededNode) {
        ListNode currentNode = head;
        int i = 0;
        if (currentNode != null) {
            while (currentNode.next != null) {
                if (neededNode == currentNode) {
                    return i;
                }
                i++;
                currentNode = currentNode.next;
            }
        }
        return -1;
    }

    public static ListNode createFromArray(int[] nums) {
        ListNode prevNode = null;
        ListNode headNode = null;
        for (int i : nums) {
            ListNode tmpNode = new ListNode(i);
            if (headNode == null) {
                headNode = tmpNode;
            }
            if (prevNode != null) {
                prevNode.next = tmpNode;
            }
            prevNode = tmpNode;
        }
        return headNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ListNode listNode = (ListNode) o;

        if (val != listNode.val) {
            return false;
        }
        if (this.next == null && listNode.next == null) {
            return true;
        } else if (this.next == null) {
            return false;
        } else if (listNode.next == null) {
            return false;
        } else {
            return this.next.val == listNode.next.val;
        }
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (next != null ? next.val : 0);
        return result;
    }

    @Override
    public String toString() {
        Set<Integer> set = new HashSet<>();

        return "" + val + (next != null ? ", " + next.val : "");
    }
}
