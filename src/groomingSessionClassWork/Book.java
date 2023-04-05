package groomingSessionClassWork;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter L");
        int l = sc.nextInt();
        System.out.println("please enter R");
        int r = sc.nextInt();
        System.out.println("please enter K");
        int k = sc.nextInt();
        int count=0;
        for (int i = l; i <=r; i++) {

            if(i%k==0){
                count++;
            }

        }
        System.out.println(count);


    }


}
