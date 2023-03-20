package groomingSessionClassWork;

public class recursion {
    public static void main(String[] args) {
        int curr = 0;
        int distance = 0;
        String printer ="XYZ";
        String word = "ZXZZY";
        char[] printerSequence = printer.toCharArray();
        char[] words = word.toCharArray();
        int n = 3;

        for(char x : words){

        }

        for (char c : words) {
            int target = 0;
            for (int i = 0; i < n; i++) {
                if (printerSequence[i] == c) {
                    target = i;
                    break;
                }
            }
            distance += Math.abs(target - curr);
            curr = target;
        }
        System.out.println(distance);
    }
}