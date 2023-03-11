package groomingSessionClassWork;

import java.util.Arrays;
public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 7, 11, 9, 13, 8, 12};
        int target = 20;
        int[] result = sum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int [] sum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[-1];
    }
}

