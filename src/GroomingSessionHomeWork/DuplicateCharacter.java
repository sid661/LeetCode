package GroomingSessionHomeWork;

import java.util.Arrays;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String s = "butter";
        String p = "better";

        char[] str1 = s.toLowerCase().toCharArray();
        char[] str2 = p.toLowerCase().toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i = 0; i < str1.length; i++) {
            int count = 0;
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    count++;
                }
            }
            System.out.println(str1[i]+" "+count);
        }
    }
}
