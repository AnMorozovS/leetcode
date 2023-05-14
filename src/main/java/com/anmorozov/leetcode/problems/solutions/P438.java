package com.anmorozov.leetcode.problems.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class P438 {

    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        char[] sArray = s.toCharArray();
        Map<Character, Queue<Character>> map = stringToCharMap(p);
        Queue<Character> currentAnagram = new LinkedList<>();
        for (int i = 0; i < sArray.length; i++) {

            Character character = sArray[i];
//            System.out.printf("[%1$d] =%2$s\t-\t%3$s\n", i, character, currentAnagram);

            if (!currentAnagram.isEmpty() && currentAnagram.size() >= p.length()) {
                Character character1 = currentAnagram.remove();
//                System.out.printf("[%1$d] =%2$s\t-\t%3$s\t\tremoved %4$s\n", i, character, currentAnagram, character1);
                Queue<Character> currentQueue1 = map.get(character1);
                currentQueue1.add(character1);
            }
            if (map.containsKey(character) && !map.get(character).isEmpty()) {
                Queue<Character> currentQueue = map.get(character);
                Character removedChar = currentQueue.poll();
                currentAnagram.add(removedChar);
//                System.out.printf("[%1$d] =%2$s\t-\t%3$s\t\tadded %4$s\n", i, character, currentAnagram, removedChar);
                if (currentAnagram.size() == p.length()) {
//                    System.out.printf("[%1$d] =%2$s\t-\t%3$s\t\tmatch\n", i, character, currentAnagram);
                    result.add(i + 1 - p.length());
                }
            } else {
                while (!currentAnagram.isEmpty()) {
                    if (currentAnagram.element().equals(character)) {
                        Character removedChar = currentAnagram.remove();
//                        System.out.printf("[%1$d] =%2$s\t-\t%3$s\t\tremoved while %4$s\n", i, character, currentAnagram,
//                                removedChar);
                        currentAnagram.add(removedChar);
//                        System.out.printf("[%1$d] =%2$s\t-\t%3$s\t\tadded while %4$s\n", i, character, currentAnagram,
//                                removedChar);
                        break;
                    } else {
                        Character character1 = currentAnagram.remove();
//                        System.out.printf("[%1$d] =%2$s\t-\t%3$s\t\tremoved while %4$s\n", i, character, currentAnagram,
//                                character1);
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
