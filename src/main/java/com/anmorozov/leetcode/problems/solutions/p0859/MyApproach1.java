package com.anmorozov.leetcode.problems.solutions.p0859;

import java.util.HashSet;
import java.util.Set;

public class MyApproach1 implements Solution {

    @Override
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        char[] inputArray = s.toCharArray();
        char[] goalArray = goal.toCharArray();
        Set<Character> useLetters = new HashSet<>();
        boolean useOneLetterTwice = false;
        int difCount = 0;
        char inputChar = 0;
        char goalChar = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (useLetters.contains(inputArray[i])) {
                useOneLetterTwice = true;
            } else {
                useLetters.add(inputArray[i]);
            }
            if (difCount == 0 && inputArray[i] != goalArray[i]) {
                inputChar = inputArray[i];
                goalChar = goalArray[i];
                difCount += 1;
            } else if (difCount == 1 && inputArray[i] != goalArray[i]) {
                if (inputChar != goalArray[i] || goalChar != inputArray[i]) {
                    return false;
                }
                difCount += 1;
            } else if (difCount >= 2 && inputArray[i] != goalArray[i]) {
                return false;
            }
        }
        if (difCount == 2) {
            return true;
        }
        return difCount == 0 && useOneLetterTwice;
    }
}
