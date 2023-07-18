package com.anmorozov.leetcode.problems.solutions.p0146;

import java.util.HashMap;
import java.util.Map;

/**
 * Approach 1: Doubly Linked List
 */
public class Approach1LRUCache extends LRUCache {

    int capacity;
    Map<Integer, ListNode> dictionary;
    ListNode head;
    ListNode tail;

    public Approach1LRUCache(int capacity) {
        this.capacity = capacity;
        dictionary = new HashMap<>();
        head = new ListNode(-1, -1);
        tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    @Override
    @SuppressWarnings("NewMethodNamingConvention")
    public int get(int key) {
        if (!dictionary.containsKey(key)) {
            return -1;
        }

        ListNode node = dictionary.get(key);
        remove(node);
        add(node);
        return node.val;
    }

    @Override
    @SuppressWarnings("NewMethodNamingConvention")
    public void put(int key, int value) {
        if (dictionary.containsKey(key)) {
            ListNode oldNode = dictionary.get(key);
            remove(oldNode);
        }

        ListNode node = new ListNode(key, value);
        dictionary.put(key, node);
        add(node);

        if (dictionary.size() > capacity) {
            ListNode nodeToDelete = head.next;
            remove(nodeToDelete);
            dictionary.remove(nodeToDelete.key);
        }
    }

    @SuppressWarnings("NewMethodNamingConvention")
    public void add(ListNode node) {
        ListNode previousEnd = tail.prev;
        previousEnd.next = node;
        node.prev = previousEnd;
        node.next = tail;
        tail.prev = node;
    }

    public void remove(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    static class ListNode {

        /**
         * @noinspection FieldNamingConvention
         */
        int key;
        /**
         * @noinspection FieldNamingConvention
         */
        int val;
        ListNode next;
        ListNode prev;

        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}

