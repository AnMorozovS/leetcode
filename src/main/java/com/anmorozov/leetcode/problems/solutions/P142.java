package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.problems.common.ListNode;

public class P142 {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                while (fast != head) {
                    fast = fast.next;
                    head = head.next;
                }
                return fast;
            }

        }

        if (fast == null) {
            return null;
        }

        return fast.next;
    }
}
