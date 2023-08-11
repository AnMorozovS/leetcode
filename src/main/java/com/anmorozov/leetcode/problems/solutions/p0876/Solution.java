package com.anmorozov.leetcode.problems.solutions.p0876;

import com.anmorozov.leetcode.common.ListNode;

/**
 * <p><strong>876.</strong> Middle of the Linked List.</p>
 * <em>Easy</em>
 */
public interface Solution {

    /**
     * <p>Given the {@code head} of a singly linked list, return <em>the middle node of the linked list</em>.</p>
     *
     * <p>If there are two middle nodes, return <strong>the second middle</strong> node.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>The number of nodes in the list is in the range {@code [1, 100]}.</li>
     * 	<li>{@code 1 <= Node.val <= 100}</li>
     * </ul>
     *
     * @param head a singly linked list
     * @return <em>the middle node of the linked list</em>
     */
    ListNode middleNode(ListNode head);
}
