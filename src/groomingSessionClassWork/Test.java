package groomingSessionClassWork;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2, 3, 4, 4, 5, 6, 6, 7, 2};
        Arrays.sort(arr);
        frr(arr);
    }
    public static void frr(int[] arr) {
        int i, j, count;
        for (i = 0; i < arr.length; i++) {
            count = 1;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                } else {
                    break;
                }

            }
            i = j - 1;// to set up the comapred element to i to the last element
          if(count>1) {
              System.out.println(arr[i] + "  " + count);
          }

        }


    }
}
