package com.anmorozov.leetcode.problems.solutions.p0271;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCodec1 implements Codec {

    private static final String DELIMITER = "DELIM";

    @Override
    public String encode(List<String> strings) {
        StringBuilder encodedString = new StringBuilder();
        for (String s : strings) {
            encodedString.append(s);
            encodedString.append(DELIMITER);
        }
        return encodedString.toString();
    }

    @Override
    public List<String> decode(String s) {
        String[] decodedStrings = s.split(DELIMITER, -1);
        return new ArrayList<>(Arrays.asList(decodedStrings).subList(0, decodedStrings.length - 1));
    }
}
