package com.anmorozov.leetcode.problems.solutions;

import java.util.HashMap;
import java.util.Map;

public class P0409 {

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int val = map.get(c) + 1;
                map.put(c, val);
            } else {
                map.put(c, 1);
            }
        }
        int hasMiddle = 0;
        int palindromeMaxLength = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if ((count % 2) == 0) {
                palindromeMaxLength = (palindromeMaxLength + count);
            } else {
                palindromeMaxLength = (palindromeMaxLength + count - 1);
                hasMiddle = 1;
            }
        }

        return palindromeMaxLength + hasMiddle;
    }
}

