package com.anmorozov.leetcode.problems.solutions.p0894;

import com.anmorozov.leetcode.common.Cache;
import com.anmorozov.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class MyApproach1 implements Solution {

    private final Cache<Integer, List<TreeNode>> cache = new Cache<>();

    @Override
    public List<TreeNode> allPossibleFBT(int n) {
        if (n == 1) {
            return List.of(new TreeNode());
        }

        List<TreeNode> result = new ArrayList<>();
        for (int i = 1; i < n; i += 2) {
            for (TreeNode left : cache.useCache(i, this::allPossibleFBT)) {
                for (TreeNode right : cache.useCache(n - i - 1, this::allPossibleFBT)) {
                    result.add(new TreeNode(0, left, right));
                }
            }
        }
        return result;
    }

}
