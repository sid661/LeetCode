package leetcodeproblems;

import java.util.List;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean result = isValid(s);
        System.out.println(result);
    }
    public static boolean isValid(String s) {
        //Stack<Character> ss = new Stack<>();

        for(int i =0;i<s.length()-1;i+=2){
            System.out.println(s.charAt(i)+"  "+s.charAt(i+1));
            if(s.charAt(i)!=s.charAt(i+1)){
                return false;
            }
        }
       // System.out.println(ss);
     return true;
    }
}
