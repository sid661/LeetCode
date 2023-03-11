package GroomingSessionHomeWork;

import java.util.Arrays;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "This Is Exapmle Of StringInJava";

        System.out.println(str);
        String k =longest(str);
        System.out.println(k+"--is the longest substring");

    }
    public static String longest(String str){
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length-1; i++) {
             if(arr[i].length()>arr[i+1].length()){
                 String temp = arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
             }

        }
        return arr[arr.length-1];
    }
}
