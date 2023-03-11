package leetcodeproblems;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String[] str = new String[]{"dog", "racer", "car"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);

    }

    public static String longestCommonPrefix(String[] words) {
        Arrays.sort(words);
        String ans = "";
        for (int i = 0; i < words[0].length(); i++) {
            boolean match = true;
            char ch = words[0].charAt(i);
            for (int j = 1; j < words.length; j++) {
                if (words[j].length() < i || ch != words[j].charAt(i)) {
                    match = false;
                    break;
                }
            }
            if (match == false) {
                break;
            } else {
                ans = ans + ch;
            }
        }

        return ans;
    }

}
