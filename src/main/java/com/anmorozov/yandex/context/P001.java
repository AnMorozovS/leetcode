package com.anmorozov.yandex.context;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.stream.Collectors;

public class P001 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String jewelString = bufferedReader.readLine();
        String stoneString = bufferedReader.readLine();
        Set<Character> jewels = jewelString.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        int result = 0;
        for (Character ch : stoneString.toCharArray()) {
            if (jewels.contains(ch)) {
                result++;
            }
        }
        System.out.println(result);
    }

}
