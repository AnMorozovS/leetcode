package com.anmorozov.yandex.context;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P001B {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String arraySize = bufferedReader.readLine();
        int n = Integer.parseInt(arraySize);
        int currentResult = 0;
        int maxResult = 0;
        for (int i = 0; i < n; i++) {
            String arrayValue = bufferedReader.readLine();
            int number = Integer.parseInt(arrayValue);
            if (number == 1) {
                currentResult++;
            } else {
                currentResult = 0;
            }
            if (maxResult < currentResult) {
                maxResult = currentResult;
            }
        }

        System.out.println(maxResult);
    }
}
