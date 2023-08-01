package com.anmorozov.leetcode.problems.solutions.p0077;

import java.util.ArrayList;
import java.util.List;

/**
 * Approach: Backtracking
 */
public class Approach1 implements Solution {

    private int range;
    private int count;

    @Override
    public List<List<Integer>> combine(int n, int k) {
        this.range = n;
        this.count = k;
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(new ArrayList<>(), 1, ans);
        return ans;
    }

    public void backtrack(List<Integer> curr, int firstNum, List<List<Integer>> ans) {
        if (curr.size() == count) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        int need = count - curr.size();
        int remain = range - firstNum + 1;
        int available = remain - need;

        for (int num = firstNum; num <= firstNum + available; num++) {
            curr.add(num);
            backtrack(curr, num + 1, ans);
            curr.remove(curr.size() - 1);
        }

    }
}
