package GroomingSessionHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first word");
        String firstWord = sc.next();
        System.out.println("please enter the second word");
        String secondWord = sc.next();
        check(firstWord, secondWord);
    }

    public static void check(String firstWord, String secondWord) {
        firstWord.toLowerCase();
        secondWord.toLowerCase();
        boolean result = true;
        if (firstWord.length() == secondWord.length()) {
            char[] first = firstWord.toCharArray();
            char[] second = secondWord.toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);
           // boolean finalresult= Arrays.equals(first,second);
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    result = false;
                } else {
                    result = true;
                }

            }
        } else {
            result = false;
        }
        if (result == true) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}