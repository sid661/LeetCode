package leetcodeproblems;

public class ReverseTheString {
    public static void main(String[] args) {
        int result = reverse(2147483412);
        System.out.println(result);
    }
    public static int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;


        int reverse=0;
        int remainder =0;
        while(x!=0){
            remainder = x%10;
            reverse = remainder+reverse*10;
            x= x/10;
        }
        if(reverse > Math.pow(2, 31)-1 || reverse < -(Math.pow(2, 31))){
            return 0;
        }

        int check =(int)reverse;
        return check;
    }
}
