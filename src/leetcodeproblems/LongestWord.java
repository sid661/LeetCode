package leetcodeproblems;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        lengthOfLastWord("    fly me   to   the moon  ");
    }
    public static int lengthOfLastWord(String s) {
         String [] arr = s.split("\\s+");
         String str = arr[arr.length-1];
        System.out.println(str);
        return 1;

    }
}
