package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.problems.common.ListNode;

public class P876 {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
