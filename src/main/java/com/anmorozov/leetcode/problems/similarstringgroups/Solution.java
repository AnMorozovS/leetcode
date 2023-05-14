package com.anmorozov.leetcode.problems.similarstringgroups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {


    public int numSimilarGroups(String[] strs) {
        LinkedList<String> unCheckedList = new LinkedList<>(Arrays.asList(strs));
        int count = 0;

        while (!unCheckedList.isEmpty()) {
            count++;
            cleanByFistElement(unCheckedList);
        }

        return count;
    }

    public void cleanByFistElement(LinkedList<String> unCheckedList) {
        boolean flag = true;
        int checker = 0;
        List<String> groupList = new ArrayList<>();
        groupList.add(unCheckedList.get(0));
        unCheckedList.remove(groupList.get(0));
        while (flag) {
            flag = false;
            System.out.println("groupList " + groupList.size());
            for (String value : groupList) {
                System.out.println("value " + value);
                System.out.println("unCheckedList " + unCheckedList.size());
                for (String temp : unCheckedList) {
                    System.out.println("temp " + temp);
                    System.out.println(checker++);
                    if (checker > 100) {
                        throw new RuntimeException();
                    }
                    if (isOnlyTwoLetterWrap(value.toCharArray(), temp.toCharArray())) {
                        flag = true;
                        groupList.add(temp);
                        unCheckedList.remove(temp);
                        System.out.println("temp break ");
                        break;
                    }
                }
                if (flag) {
                    System.out.println("value break ");
                    break;
                }
            }
        }
    }

    public boolean isOnlyTwoLetterWrap(char[] first, char[] second) {
        int difCount = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                difCount++;
            }
        }
        return difCount == 2 || difCount == 0;
    }
}