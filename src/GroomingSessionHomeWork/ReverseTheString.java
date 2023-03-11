package GroomingSessionHomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String str = sc.next();
        System.out.println(str);
        reverse(str);
    }
    public static void reverse(String s ){
     char[] str = s.toLowerCase().toCharArray();
        for (int i = 0,j= str.length-1; i <j ; i++,j--) {
            char temp = str[i];
            str[i]= str[j];
            str[j]=temp;

        }
        System.out.println(Arrays.toString(str));
    }
}
