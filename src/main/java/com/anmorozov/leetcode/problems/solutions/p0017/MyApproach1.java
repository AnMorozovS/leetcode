package com.anmorozov.leetcode.problems.solutions.p0017;

import java.util.ArrayList;
import java.util.List;

public class MyApproach1 implements Solution {

    private List<Integer> digits;

    @Override
    public List<String> letterCombinations(String digits) {
        this.digits = new ArrayList<>();
        for (char ch : digits.toCharArray()) {
            this.digits.add(ch - '0');
        }
        List<String> result = new ArrayList<>();
        addLetter(0, new StringBuffer(), result);
        return result;
    }

    private void addLetter(int index, StringBuffer buffer, List<String> result) {
        if (index >= digits.size()) {
            if (!buffer.isEmpty()) {
                result.add(buffer.toString());
            }
            return;
        }
        for (char ch : getLettersByNumber(this.digits.get(index))) {
            buffer.append(ch);
            addLetter(index + 1, buffer, result);
            buffer.deleteCharAt(buffer.length() - 1);
        }
    }


}
