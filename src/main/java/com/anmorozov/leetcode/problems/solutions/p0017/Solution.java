package com.anmorozov.leetcode.problems.solutions.p0017;

import java.util.List;

/**
 * <p><strong>17.</strong> Letter Combinations of a Phone Number.</p>
 * <em>Medium</em>
 */
public interface Solution {

    default List<Character> getLettersByNumber(int number) {
        List<Character> result;
        switch (number) {
            case 2 -> result = List.of('a', 'b', 'c');
            case 3 -> result = List.of('d', 'e', 'f');
            case 4 -> result = List.of('g', 'h', 'i');
            case 5 -> result = List.of('j', 'k', 'l');
            case 6 -> result = List.of('m', 'n', 'o');
            case 7 -> result = List.of('p', 'q', 'r', 's');
            case 8 -> result = List.of('t', 'u', 'v');
            case 9 -> result = List.of('w', 'x', 'y', 'z');
            default -> result = List.of();
        }
        return result;
    }

    /**
     * <p>Given a string containing digits from {@code 2-9} inclusive, return all possible letter combinations that the
     * number could represent. Return the answer in <strong>any order</strong>.</p>
     *
     * <p>A mapping of digits to letters (just like on the telephone buttons) is given in
     * {@link #getLettersByNumber(int) getLettersByNumber} method.. Note that 1 does not map to any letters.</p>
     *
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li>{@code 0 <= digits.length <= 4}</li>
     * 	<li>{@code digits[i]} is a digit in the range {@code ['2', '9']}.</li>
     * </ul>
     *
     * @param digits incoming
     * @return all possible letter combinations that the number could represent
     */
    List<String> letterCombinations(String digits);

}
