package com.anmorozov.leetcode.problems.solutions.p0465;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p><b>465.</b> Optimal Account Balancing.</p>
 * <i>Hard</i>
 */
public interface Solution {

    /**
     * <p>You are given an array of transactions {@code transactions} where {@code transactions[i] =
     * [from}<sub>i</sub>{@code , to}<sub>i</sub>{@code , amount}<sub>i</sub>{@code ]} indicates that the person with
     * {@code ID = from}<sub>i</sub> gave {@code amount}<sub>i</sub>{@code  $} to the person with {@code ID =
     * to}<sub>i</sub>.</p>
     *
     * <p>Return <em>the minimum number of transactions required to settle the debt</em>.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 1 <= transactions.length <= 8}</li>
     * 	<li>{@code transactions[i].length == 3}</li>
     * 	<li>{@code 0 <= from}<sub>i</sub>{@code , to}<sub>i</sub>{@code  < 12}</li>
     * 	<li>{@code from}<sub>i</sub>{@code  != to}<sub>i</sub></li>
     * 	<li>{@code 1 <= amount}<sub>i</sub>{@code  <= 100}</li>
     * </ul>
     *
     * @param transactions an array of transactions
     * @return <em>the minimum number of transactions required to settle the debt</em>
     */
    int minTransfers(int[][] transactions);

    default List<Integer> getCreditList(int[][] transactions) {
        Map<Integer, Integer> creditMap = new HashMap<>();
        for (int[] t : transactions) {
            creditMap.put(t[0], creditMap.getOrDefault(t[0], 0) + t[2]);
            creditMap.put(t[1], creditMap.getOrDefault(t[1], 0) - t[2]);
        }

        List<Integer> creditList = new ArrayList<>();
        for (int amount : creditMap.values()) {
            if (amount != 0) {
                creditList.add(amount);
            }
        }
        return creditList;
    }
}
