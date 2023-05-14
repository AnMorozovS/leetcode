package com.anmorozov.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RomanToInteger {


    char[] c = new char[] {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    Map<Character, Integer> numberDefinition = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public boolean biggerOrEqual(char first, char second) {
        return numberDefinition.get(second) >= numberDefinition.get(first);
    }

    public List<String> parseByDigits(String s) {
        List<String> numbers = new ArrayList<>();
        numbers.add("");

        char previousChar = 'I';

        for (char currentChar : s.toCharArray()) {
            if (biggerOrEqual(previousChar, currentChar)) {
                String var = numbers.get(numbers.size() - 1);
                var = var + currentChar;
                previousChar = currentChar;
            } else {
//                numbers.add(builder.toString());
//                builder = new StringBuilder().append(currentChar);
            }
        }
        return numbers;
    }

//    public int romanToInt(String s) {
//        int number = 0;
//        for (char c : s.toCharArray()) {
//            int x
//            switch (c) {
//                case 'I':
//            }
//        }
//    }

//    public List<String> parseToNumbers(String s) {
//        List<String> result = new ArrayList<String>();
//
//    }
}
