package leetcodeproblems;

public class LongestSubstringWithout {
    public static void main(String[] args) {
       String s = "abcd";
        for (int i = 0; i < s.length() ; i++) {
            for (int j = i+1; j <= s.length(); j++) {
                  String sub = s.substring(i,j);//(0,1)-(0,2)-(0,3)
                  System.out.println(sub);
            }
        }

    }
}
