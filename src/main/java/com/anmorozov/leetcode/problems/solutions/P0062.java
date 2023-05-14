package com.anmorozov.leetcode.problems.solutions;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class P0062 {

    final Map<Integer, BigInteger> cashMap = new HashMap<>();

    public int uniquePaths(int m, int n) {
        return faqt(m - 1 + n - 1).divide(faqt(m - 1)).divide(faqt(n - 1)).intValue();
    }

    public BigInteger faqt(int x) {
        if (x <= 1) {
            return BigInteger.ONE;
        } else {
            BigInteger res;
            if (!cashMap.containsKey(x)) {
                res = faqt(x - 1).multiply(BigInteger.valueOf(x));
                cashMap.put(x, res);
            } else {
                res = cashMap.get(x);
            }
            return res;
        }
    }
}
