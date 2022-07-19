package com.company;

import java.util.Arrays;

public class Anagram {

    static boolean anagramFunction(String stringOne, String stringTwo) {

        stringOne = stringOne.replaceAll("\\s+", "");
        stringTwo=stringTwo.replaceAll("\\s+", "");

        stringOne=stringOne.toLowerCase();
        stringTwo=stringTwo.toLowerCase();
        boolean result = false;
        if (stringOne.length() != stringTwo.length())
            result= false;

        char[] arrayOne = stringOne.toCharArray();
        char[] arrayTwo = stringTwo.toCharArray();

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

         result = Arrays.equals(arrayOne, arrayTwo);

        return result;
    }

    public static void main(String[] args) {
        {

            String firststring = "Desperation";
            String secondString = "A Rope Ends It";

            if (anagramFunction(firststring, secondString))
                System.out.println("The two strings are anagram of each other");
            else
                System.out.println("The two strings are NOT anagram of each other");
        }
    }
}
