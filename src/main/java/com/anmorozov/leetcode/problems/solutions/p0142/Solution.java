package com.anmorozov.leetcode.problems.solutions.p0142;

import com.anmorozov.leetcode.common.ListNode;

/**
 * <p><strong>142.</strong> Linked List Cycle II.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>Given the {@code head} of a linked list, return <em>the node where the cycle begins. If there is no cycle,
     * return </em>{@code null}.</p>
     *
     * <p>There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
     * following the {@code next} pointer. Internally, {@code pos} is used to denote the index of the node that tail's
     * {@code next} pointer is connected to (<strong>0-indexed</strong>). It is {@code -1} if there is no cycle.
     * <strong>Note that</strong> {@code pos} <strong>is not passed as a parameter</strong>.</p>
     *
     * <p><strong>Do not modify</strong> the linked list.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>The number of the nodes in the list is in the range {@code [0, 10}<sup>4</sup>{@code ]}.</li>
     * 	<li>{@code -10}<sup>5</sup>{@code  <= Node.val <= 10}<sup>5</sup></li>
     * 	<li>{@code pos} is {@code -1} or a <strong>valid index</strong> in the linked-list.</li>
     * </ul>
     */
    ListNode detectCycle(ListNode head);

}
