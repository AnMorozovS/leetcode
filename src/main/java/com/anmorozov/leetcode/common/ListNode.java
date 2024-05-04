package com.anmorozov.leetcode.common;

import java.util.Objects;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

    public final int value;
    public ListNode next;

    public ListNode(int val) {
        this.value = val;
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

    /**
     * <p>Use to create List node with all children from int array</p>
     *
     * @param nums array of children
     * @return root ListNode
     */
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

    public ListNode getByIndex(int index) {
        int i = 0;
        ListNode result = this;

        do {
            if (index == i) {
                return result;
            }
            i++;
            result = result.next;
        } while (this.next != null || i < index);
        return null;

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

        if (value != listNode.value) {
            return false;
        }
        return Objects.equals(next, listNode.next);
    }
}
