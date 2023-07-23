package com.anmorozov.leetcode.problems.solutions.p0439;

/**
 * Approach 4: Binary Tree
 */
public class Approach4 implements Solution {


    private int index = 0;

    @Override
    public String parseTernary(String expression) {

        // Construct Binary Tree
        TreeNode<Character> root = constructTree(expression);

        // Parse the binary tree till we reach the leaf node
        while (root.left != null && root.right != null) {
            if (root.value == 'T') {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return String.valueOf(root.value);
    }

    private TreeNode<Character> constructTree(String expression) {

        // Storing current character of expression
        TreeNode<Character> root = new TreeNode<>(expression.charAt(index));

        // If last character of expression, return
        if (index == expression.length() - 1) {
            return root;
        }

        // Check next character
        index++;
        if (expression.charAt(index) == '?') {
            index++;
            root.left = constructTree(expression);
            index++;
            root.right = constructTree(expression);
        }

        return root;
    }

    static class TreeNode<T> {

        T value;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T value) {
            this.value = value;
        }
    }
}
