package com.anmorozov.yandex.context;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P001D {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String arraySize = bufferedReader.readLine();
        short n = Short.parseShort(arraySize);
        char[] array = new char[n * 2];
        printBrackets(array, n, (short) 0, (short) 0, (short) 0);
    }


    public static void printBrackets(char[] array, short n, short leftBracket, short rightBracket, short index) {
        if (leftBracket == n && rightBracket == n) {
            System.out.println(String.valueOf(array));
            return;
        }
        if (leftBracket < n) {
            array[index] = '(';
            printBrackets(array, n, (short) (leftBracket + 1), rightBracket, (short) (index + 1));
        }
        if (leftBracket > rightBracket) {
            array[index] = ')';
            printBrackets(array, n, leftBracket, (short) (rightBracket + 1), (short) (index + 1));
        }
    }
}
