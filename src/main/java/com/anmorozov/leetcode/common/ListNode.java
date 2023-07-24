package com.anmorozov.leetcode.common;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

    public int value;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.value = val;
    }

    public ListNode(int val, ListNode next) {
        this.value = val;
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
        if (this.next == null && listNode.next == null) {
            return true;
        } else if (this.next == null) {
            return false;
        } else if (listNode.next == null) {
            return false;
        } else {
            return this.next.value == listNode.next.value;
        }
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (next != null ? next.value : 0);
        return result;
    }

    @Override
    public String toString() {

        return "" + value + (next != null ? ", " + next.value : "");
    }
}
