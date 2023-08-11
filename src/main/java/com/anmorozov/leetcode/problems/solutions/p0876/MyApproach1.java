package com.anmorozov.leetcode.problems.solutions.p0876;

import com.anmorozov.leetcode.common.ListNode;

public class MyApproach1 implements Solution {

    @Override
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
