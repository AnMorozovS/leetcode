package com.anmorozov.leetcode.problems.solutions.p0439;

/**
 * <p><b>439.</b> Ternary Expression Parser.</p>
 * <i>Medium</i>
 */
public interface Solution {

    /**
     * <p>Given a string {@code expression} representing arbitrarily nested ternary expressions, evaluate the
     * expression, and return <em>the result of it</em>.</p>
     *
     * <p>You can always assume that the given expression is valid and only contains digits, {@code '?'}, {@code ':'},
     * {@code 'T'}, and {@code 'F'} where {@code 'T'} is true and {@code 'F'} is false. All the numbers in the
     * expression are <strong>one-digit</strong> numbers (i.e., in the range {@code [0, 9]}).</p>
     *
     * <p>The conditional expressions group right-to-left (as usual in most languages), and the result of the
     * expression
     * will always evaluate to either a digit, {@code 'T'} or {@code 'F'}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 5 <= expression.length <= 10}<sup>4</sup></li>
     * 	<li>{@code expression} consists of digits, {@code 'T'}, {@code 'F'}, {@code '?'}, and {@code ':'}.</li>
     * 	<li>It is <strong>guaranteed</strong> that {@code expression} is a valid ternary expression and that each number is a <strong>one-digit number</strong>.</li>
     * </ul>
     *
     * @param expression a string representing arbitrarily nested ternary expressions
     * @return <em>the result of expression</em>
     */
    String parseTernary(String expression);
}
