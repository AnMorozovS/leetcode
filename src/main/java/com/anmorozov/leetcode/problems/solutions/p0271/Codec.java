package com.anmorozov.leetcode.problems.solutions.p0271;

import java.util.List;

public interface Codec {

    // Encodes a list of strings to a single string.
    String encode(List<String> strings);

    // Decodes a single string to a list of strings.
    List<String> decode(String s);
}
