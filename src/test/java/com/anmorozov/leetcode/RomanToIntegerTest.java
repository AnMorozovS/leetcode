package com.anmorozov.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RomanToIntegerTest {

    @Test
    void biggerOrEqual() {

        RomanToInteger parser = new RomanToInteger();
        assertTrue(parser.biggerOrEqual('I', 'I'));
        assertTrue(parser.biggerOrEqual('I', 'V'));
        assertTrue(parser.biggerOrEqual('V', 'V'));
        assertTrue(parser.biggerOrEqual('I', 'X'));
        assertTrue(parser.biggerOrEqual('X', 'X'));

        assertTrue(parser.biggerOrEqual('X', 'L'));
        assertTrue(parser.biggerOrEqual('X', 'C'));

        assertTrue(parser.biggerOrEqual('C', 'C'));
        assertTrue(parser.biggerOrEqual('C', 'D'));
        assertTrue(parser.biggerOrEqual('C', 'M'));

        assertFalse(parser.biggerOrEqual('V', 'I'));

        assertFalse(parser.biggerOrEqual('X', 'I'));
        assertFalse(parser.biggerOrEqual('X', 'V'));

        assertFalse(parser.biggerOrEqual('L', 'I'));
        assertFalse(parser.biggerOrEqual('L', 'V'));
        assertFalse(parser.biggerOrEqual('L', 'X'));

        assertFalse(parser.biggerOrEqual('C', 'I'));
        assertFalse(parser.biggerOrEqual('C', 'V'));
        assertFalse(parser.biggerOrEqual('C', 'X'));
        assertFalse(parser.biggerOrEqual('C', 'L'));

        assertFalse(parser.biggerOrEqual('D', 'I'));
        assertFalse(parser.biggerOrEqual('D', 'V'));
        assertFalse(parser.biggerOrEqual('D', 'X'));
        assertFalse(parser.biggerOrEqual('D', 'L'));
        assertFalse(parser.biggerOrEqual('D', 'C'));

        assertFalse(parser.biggerOrEqual('M', 'I'));
        assertFalse(parser.biggerOrEqual('M', 'V'));
        assertFalse(parser.biggerOrEqual('M', 'X'));
        assertFalse(parser.biggerOrEqual('M', 'L'));
        assertFalse(parser.biggerOrEqual('M', 'C'));
        assertFalse(parser.biggerOrEqual('M', 'D'));
    }
}