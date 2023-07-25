package com.anmorozov.leetcode.problems.solutions.p0269;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class MyApproach1 implements Solution {

    @Override
    public String alienOrder(String[] words) {
        Map<Character, Set<Character>> letterBeforeLetters = new HashMap<>();
        Map<Character, Set<Character>> letterAfterLetters = new HashMap<>();
        Set<Character> allLetters = new HashSet<>();
        if (words.length == 1) {
            for (Character c : words[0].toCharArray()) {
                allLetters.add(c);
            }
        }
        for (int i = 1; i < words.length; i++) {
            char[] wordBefore = words[i - 1].toCharArray();
            char[] wordAfter = words[i].toCharArray();
            boolean mapsUnChanged = true;
            for (int j = 0; j < Math.max(wordBefore.length, wordAfter.length); j++) {
                Character letterBefore = null;
                Character letterAfter = null;
                if (j < wordBefore.length) {
                    letterBefore = wordBefore[j];
                    allLetters.add(letterBefore);
                }
                if (j < wordAfter.length) {
                    letterAfter = wordAfter[j];
                    allLetters.add(letterAfter);
                }
                if (mapsUnChanged && letterBefore != null && letterAfter == null) {
                    return "";
                }
                if (mapsUnChanged && letterBefore != null && letterBefore != letterAfter) {
                    letterBeforeLetters.computeIfAbsent(letterBefore, HashSet::new).add(letterAfter);
                    letterAfterLetters.computeIfAbsent(letterAfter, HashSet::new).add(letterBefore);
                    mapsUnChanged = false;
                }
            }
        }
        Queue<Character> actualLetters = new PriorityQueue<>();
        for (Character letter : allLetters) {
            if (!letterAfterLetters.containsKey(letter)) {
                actualLetters.add(letter);
            }
        }
        List<Character> result = new ArrayList<>();
        Set<Character> alreadyAddedLetters = new HashSet<>();
        while (!actualLetters.isEmpty()) {
            Character letter = actualLetters.poll();
            alreadyAddedLetters.add(letter);
            result.add(letter);
            for (Character nextLetter : letterBeforeLetters.getOrDefault(letter, new HashSet<>())) {
                Set<Character> neededLetters = letterAfterLetters.getOrDefault(nextLetter, new HashSet<>());
                if (alreadyAddedLetters.containsAll(neededLetters)) {
                    actualLetters.add(nextLetter);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : result) {
            stringBuilder.append(c);
        }
        String alphabet = stringBuilder.toString();
        return alphabet.length() != allLetters.size() ? "" : alphabet;
    }
}
