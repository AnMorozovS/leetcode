package com.anmorozov.gameram;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 27.07.2023 Interview task
 */
public class Interview {

    /**
     * @param input incoming string of '{', '(', '[','}',')',']','\s'
     * @return are all brackets closed
     */
    public boolean validateString(String input) {
        Deque<Character> stack = new LinkedList<>();
        for (Character character : input.toCharArray()) {
            switch (character) {
                case '{', '(', '[' -> stack.add(character);
                case '}' -> {
                    Character previous = stack.pollLast();
                    if (!(previous != null && previous == '{')) {
                        return false;
                    }
                }
                case ')' -> {
                    Character previous = stack.pollLast();
                    if (!(previous != null && previous == '(')) {
                        return false;
                    }
                }
                case ']' -> {
                    Character previous = stack.pollLast();
                    if (!(previous != null && previous == '[')) {
                        return false;
                    }
                }
                default -> {
                }
            }
        }
        return stack.isEmpty();
    }


}
