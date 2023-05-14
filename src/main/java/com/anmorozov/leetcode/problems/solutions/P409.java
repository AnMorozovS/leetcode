package com.anmorozov.leetcode.problems.solutions;

import java.util.HashMap;
import java.util.Map;

public class P409 {

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
        System.out.printf("Map<Character, Integer> map [%1$s]\n", map);
        int hasMiddle = 0;
        int palindromeMaxLength = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if ((count % 2) == 0) {
                System.out.printf("[%1$s] ,palindromeMaxLength = %2$d , count = %3$d\n", entry, palindromeMaxLength,
                        count);
                palindromeMaxLength = (palindromeMaxLength + count);
            } else {
                palindromeMaxLength = (palindromeMaxLength + count - 1);
                hasMiddle = 1;
            }
        }

        return palindromeMaxLength + hasMiddle;
    }
}

