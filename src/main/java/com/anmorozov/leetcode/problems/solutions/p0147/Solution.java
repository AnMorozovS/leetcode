package com.anmorozov.leetcode.problems.solutions.p0147;

import com.anmorozov.leetcode.common.ListNode;

/**
 * <p><strong>147.</strong> Insertion Sort List.</p>
 * <em>Medium</em>
 */
public interface Solution {

    /**
     * <p>Given the {@code head} of a singly linked list, sort the list using <strong>insertion sort</strong>, and
     * return <em>the sorted list's head</em>.</p>
     *
     * <p>The steps of the <strong>insertion sort</strong> algorithm:</p>
     *
     * <ol>
     * 	<li>Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.</li>
     * 	<li>At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.</li>
     * 	<li>It repeats until no input elements remain.</li>
     * </ol>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>The number of nodes in the list is in the range {@code [1, 5000]}.</li>
     * 	<li>{@code -5000 <= Node.val <= 5000}</li>
     * </ul>
     *
     * @param head a singly linked list
     * @return <em>the sorted list's head</em>
     */
    ListNode insertionSortList(ListNode head);
}
