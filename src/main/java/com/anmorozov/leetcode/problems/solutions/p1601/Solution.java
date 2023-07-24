package com.anmorozov.leetcode.problems.solutions.p1601;

/**
 * <p><b>1601.</b> Maximum Number of Achievable Transfer Requests.</p>
 * <i>Hard</i>
 */
public interface Solution {

    /**
     * <p>We have {@code n} buildings numbered from {@code 0} to {@code n - 1}. Each building has a number of
     * employees.
     * It's transfer season, and some employees want to change the building they reside in.</p>
     *
     * <p>You are given an array {@code requests} where {@code requests[i] = [from}<sub>i</sub>{@code ,
     * to}<sub>i</sub>]
     * represents an employee's request to transfer from building {@code from}<sub>i</sub> to building {@code
     * to}<sub>i</sub>.</p>
     *
     * <p><strong>All buildings are full</strong>, so a list of requests is achievable only if for each building, the
     * <strong>net change in employee transfers is zero</strong>. This means the number of employees
     * <strong>leaving</strong> is <strong>equal</strong> to the number of employees <strong>moving in</strong>. For
     * example if {@code n = 3} and two employees are leaving building {@code 0}, one is leaving building {@code 1}, and
     * one is leaving building {@code 2}, there should be two employees moving to building {@code 0}, one employee
     * moving to building {@code 1}, and one employee moving to building {@code 2}.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= n <= 20}</li>
     * 	<li>{@code 1 <= requests.length <= 16}</li>
     * 	<li>{@code requests[i].length == 2}</li>
     * 	<li>{@code 0 <= from}<sub>i</sub>{@code , to}<sub>i</sub>{@code  < n}</li>
     * </ul>
     *
     * @param n buildings numbered from {@code 0} to {@code n - 1}
     * @param requests an array {@code requests} where {@code requests[i] = [from}<sub>i</sub>{@code , to}<sub>i</sub>]
     * represents an employee's request to transfer from building {@code from}<sub>i</sub> to building {@code
     * to}<sub>i</sub>
     * @return <em>the maximum number of achievable requests</em>
     */
    int maximumRequests(int n, int[][] requests);
}
