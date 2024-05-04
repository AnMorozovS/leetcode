package com.anmorozov.leetcode.problems.solutions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1569 {

    private BigInteger[][] table;

    public int numOfWays(int[] nums) {
        int m = nums.length;

        table = new BigInteger[m][m];
        for (int i = 0; i < m; ++i) {
            table[i][0] = table[i][i] = BigInteger.ONE;
        }
        for (int i = 2; i < m; i++) {
            for (int j = 1; j < i; j++) {
                table[i][j] = (table[i - 1][j - 1].add(table[i - 1][j]));
            }
        }
        List<Integer> arrList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        long mod = (long) 1e9 + 7;
        return depthFirstSearch(arrList).add(BigInteger.valueOf(-1)).mod(BigInteger.valueOf(mod)).intValue();
    }

    private BigInteger depthFirstSearch(List<Integer> nums) {
        int m = nums.size();
        if (m < 3) {
            return BigInteger.ONE;
        }

        List<Integer> leftNodes = new ArrayList<>();
        List<Integer> rightNodes = new ArrayList<>();
        for (int i = 1; i < m; ++i) {
            if (nums.get(i) < nums.getFirst()) {
                leftNodes.add(nums.get(i));
            } else {
                rightNodes.add(nums.get(i));
            }
        }
        BigInteger leftWays = depthFirstSearch(leftNodes);
        BigInteger rightWays = depthFirstSearch(rightNodes);

        return leftWays.multiply(rightWays).multiply(table[m - 1][leftNodes.size()]);
    }
}
