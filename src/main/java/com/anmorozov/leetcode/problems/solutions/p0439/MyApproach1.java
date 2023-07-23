package com.anmorozov.leetcode.problems.solutions.p0439;

public class MyApproach1 implements Solution {

    private char[] expression;

    @Override
    public String parseTernary(String expression) {
        this.expression = expression.toCharArray();
        int[] result = readExpression(0);
        return "" + this.expression[result[1]];
    }

    private int[] readExpression(int index) {
        char currentChar = expression[index];
        if ((currentChar >= '0' && currentChar <= '9') || index == expression.length - 1) {
            return new int[] {index, index};
        }
        if (expression[index + 1] == ':') {
            return new int[] {index, index};
        } else {
            int[] result1 = readExpression(index + 2);
            int endIndex1 = result1[0];
            int charIndex1 = result1[1];

            int[] result2 = readExpression(endIndex1 + 2);
            int endIndex2 = result2[0];
            int charIndex2 = result2[1];
            if (currentChar == 'T') {
                return new int[] {endIndex2, charIndex1};
            } else {
                return new int[] {endIndex2, charIndex2};
            }
        }
    }
}
