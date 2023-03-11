package leetcodeproblems;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int [] result = findTwoSum(nums,target);
        System.out.println(Arrays.toString(result));

    }
    public static int [] findTwoSum(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                return new int[]{i,j};
                }
            }
        }return new int[-1];
    }
}