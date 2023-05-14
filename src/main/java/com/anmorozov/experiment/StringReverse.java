package com.anmorozov.experiment;

public class StringReverse {

    public static String reverse(String str) {
        return "\u202E" + str;
    }

    public static void main(String[] args) {

        String str = "Techie Delight";

        str = reverse(str);

        System.out.println("The reverse of the given string is: " + str);

    }
}
