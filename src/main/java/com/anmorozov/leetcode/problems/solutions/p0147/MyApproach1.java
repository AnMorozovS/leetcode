package com.anmorozov.leetcode.problems.solutions.p0147;

import com.anmorozov.leetcode.common.ListNode;

/**
 * My Approach 1 : Insertion Sort
 */
public class MyApproach1 implements Solution {

    @Override
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {
            // At each iteration, we insert an element into the resulting list.
            ListNode prev = dummy;

            // find the position to insert the current node
            while (prev.next != null && prev.next.value <= curr.value) {
                prev = prev.next;
            }

            ListNode next = curr.next;
            // insert the current node to the new list
            curr.next = prev.next;
            prev.next = curr;

            // moving on to the next iteration
            curr = next;
        }

        return dummy.next;
    }
}
