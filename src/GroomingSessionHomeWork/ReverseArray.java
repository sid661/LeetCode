package GroomingSessionHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your length of array");
        int length = sc.nextInt();
        int [] arr = new int[length];
        for(int i =0; i<length;i++){
            System.out.println("plese enter the next number");
            arr[i]=sc.nextInt();
        }
        System.out.println("your final array-->"+Arrays.toString(arr));
        reverse(arr);
    }
    public static void reverse(int[] arr){
        for (int i = 0,j=arr.length-1; i < j ; i++,j--) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
