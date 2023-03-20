package groomingSessionClassWork;

import java.util.Arrays;

public class ArmStrong {
    public static void main(String[] args) {
        int curr = 0;
        int distance = 0;
        String printer = "XYZ";
        String word = "ZXZZY";
        char[] printerSequence = printer.toCharArray();
        char[] words = word.toCharArray();
        int n = 3;
        for(int i = 0 ;i<words.length-1; i++) {
            char c1 = word.charAt(i);
            char c2 = word.charAt(i+1);
            int index1 = Arrays.binarySearch(printerSequence, c1);
            int index2 = Arrays.binarySearch(printerSequence, c2);
            distance =  distance +(Math.abs(index1 - index2));
        }
        System.out.println(distance);
    }
}


