package com.anmorozov.leetcode.problems.solutions.p0116;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Approach 1: Level Order Traversal
 */
public class Approach1 implements Solution {

    @Override
    public Node connect(Node root) {

        if (root == null) {
            return null;
        }

        // Initialize a queue data structure which contains
        // just the root of the tree
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Outer while loop which iterates over
        // each level
        while (queue.size() > 0) {

            // Note the size of the queue
            int size = queue.size();

            // Iterate over all the nodes on the current level
            for (int i = 0; i < size; i++) {

                // Pop a node from the front of the queue
                Node node = queue.poll();
                assert node != null;
                // This check is important. We don't want to
                // establish any wrong connections. The queue will
                // contain nodes from 2 levels at most at any
                // point in time. This check ensures we only
                // don't establish next pointers beyond the end
                // of a level
                if (i < size - 1) {
                    node.next = queue.peek();
                }

                // Add the children, if any, to the back of
                // the queue
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        // Since the tree has now been modified, return the root node
        return root;
    }
}
