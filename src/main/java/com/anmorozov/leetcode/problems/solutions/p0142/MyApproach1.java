package com.anmorozov.leetcode.problems.solutions.p0142;

import com.anmorozov.leetcode.common.ListNode;

public class MyApproach1 implements Solution {

    @Override
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
        return null;
    }
}
