package com.anmorozov.leetcode.problems.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class P0438 {

    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        char[] sArray = s.toCharArray();
        Map<Character, Queue<Character>> map = stringToCharMap(p);
        Queue<Character> currentAnagram = new LinkedList<>();
        for (int i = 0; i < sArray.length; i++) {

            Character character = sArray[i];

            if (!currentAnagram.isEmpty() && currentAnagram.size() >= p.length()) {
                Character character1 = currentAnagram.remove();
                Queue<Character> currentQueue1 = map.get(character1);
                currentQueue1.add(character1);
            }
            if (map.containsKey(character) && !map.get(character).isEmpty()) {
                Queue<Character> currentQueue = map.get(character);
                Character removedChar = currentQueue.poll();
                currentAnagram.add(removedChar);
                if (currentAnagram.size() == p.length()) {
                    result.add(i + 1 - p.length());
                }
            } else {
                while (!currentAnagram.isEmpty()) {
                    if (currentAnagram.element().equals(character)) {
                        Character removedChar = currentAnagram.remove();
                        currentAnagram.add(removedChar);
                        break;
                    } else {
                        Character character1 = currentAnagram.remove();
                        Queue<Character> currentQueue = map.get(character1);
                        currentQueue.add(character1);
                    }
                }
            }
        }
        return result;
    }

    public Map<Character, Queue<Character>> stringToCharMap(String p) {
        Map<Character, Queue<Character>> localMap = new HashMap<>();
        for (Character c : p.toCharArray()) {
            if (localMap.containsKey(c)) {
                Queue<Character> characterQueue = localMap.get(c);
                characterQueue.add(c);
            } else {
                Queue<Character> characterQueue = new LinkedList<>();
                characterQueue.add(c);
                localMap.put(c, characterQueue);
            }
        }
        return localMap;
    }
}
