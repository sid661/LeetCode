package GroomingSessionHomeWork;

import java.util.Arrays;

public class PreservePositionSpace {
    public static void main(String[] args) {
        String s = "I am Not String";
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        char[] arr2 = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                arr2[i] = ' ';
            }else{
                arr2[i]='@';
            }

        }
        System.out.println(Arrays.toString(arr2));
        for (int i = 0, k = arr.length - 1; i < arr.length; i++) {
             if(arr2[i]!=' '){
                 if(arr[k]==' '){
                     k--;
                 }
                 arr2[i]=arr[k];
                 k--;
             }


        }
        System.out.println(Arrays.toString(arr2));
    }
}
