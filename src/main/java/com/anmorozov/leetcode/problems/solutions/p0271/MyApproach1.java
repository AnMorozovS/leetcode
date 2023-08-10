package com.anmorozov.leetcode.problems.solutions.p0271;

public class MyApproach1 implements Solution {

    private final Codec codec = new MyCodec1();

    @Override
    public Codec getCodec() {
        return codec;
    }
}
