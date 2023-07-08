package com.anmorozov.leetcode.problems.solutions.p2024;

/**
 * <p><b>2024.</b> Maximize the Confusion of an Exam.</p>
 */
public interface Solution {

    /**
     * <p>A teacher is writing a test with {@code n} true/false questions, with {@code 'T'} denoting true and {@code
     * 'F'} denoting false. He wants to confuse the students by <strong>maximizing</strong> the number of
     * <strong>consecutive</strong> questions with the <strong>same</strong> answer (multiple trues or multiple false
     * in a row).</p>
     *
     * <p>You are given a string {@code answerKey}, where {@code answerKey[i]} is the original answer to the {@code
     * i}<sup>th</sup> question. In addition, you are given an integer {@code k}, the maximum number of times you may
     * perform the following operation:</p>
     *
     * <ul>
     * <li>Change the answer key for any question to {@code 'T'} or {@code 'F'} (i.e., set {@code answerKey[i]} to {@code 'T'} or {@code 'F'}).</li>
     * </ul>
     *
     * <p>Return <em>the <strong>maximum</strong> number of consecutive</em> {@code 'T'}s or {@code 'F'}s <em>in the answer key after performing the operation at most</em> {@code k} <em>times</em>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code n == answerKey.length}</li>
     * 	<li>{@code 1 <= n <= 5 * 10}<sup>4</sup></li>
     * 	<li>{@code answerKey[i]} is either {@code 'T'} or {@code 'F'}</li>
     * 	<li>{@code 1 <= k <= n}</li>
     * </ul>
     *
     * @param answerKey a
     * @param k k
     * @return 0
     */
    int maxConsecutiveAnswers(String answerKey, int k);
}
