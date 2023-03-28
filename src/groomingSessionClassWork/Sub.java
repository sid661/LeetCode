package groomingSessionClassWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Sub {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        containsDuplicate(arr);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (arr.containsKey(nums[i])) {
                int x = arr.get(nums[i]);
                arr.put(nums[i], x + 1);
            } else {
                arr.put(nums[i], 1);
            }
        }
        boolean result = false;
        for (Integer x : arr.values()){
            if(x>1){
                result=true;
            }
        }
        return result;
    }

}
