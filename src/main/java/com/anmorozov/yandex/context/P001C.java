package com.anmorozov.yandex.context;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P001C {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String arraySize = bufferedReader.readLine();
        int n = Integer.parseInt(arraySize);
        List<Integer> list = new ArrayList<>();
        int previousNumber = 0;
        for (int i = 0; i < n; i++) {
            String arrayValue = bufferedReader.readLine();
            int number = Integer.parseInt(arrayValue);
            if (i == 0 || number != previousNumber) {
                list.add(number);
                previousNumber = number;
            }
        }
        for (int i : list) {
            System.out.println(i);
        }
    }
}

