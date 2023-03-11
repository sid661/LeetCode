package leetcodeproblems;


import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = new int[]{9,9,9,9,9,9};
        int[] result = plusOne(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {

       int carry = 1;
        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]<9){
                digits[i]=0;
            }

        }


        return new int[]{};
    }
}
