package leetcodeproblems;

public class PalindromicNumber {
    public static void main(String[] args) {
        int x =125;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
    public static boolean isPalindrome(int x) {
        int temp = x;
        int digit =0;
        int remainder =0;
        while (x>0){
          remainder =x%10;
          digit= digit*10+remainder;
            x=x/10;

        }
        if(digit==temp){
            return true;
        }else return false;
    }
}
