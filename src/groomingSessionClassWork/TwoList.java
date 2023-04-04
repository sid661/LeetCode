package groomingSessionClassWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>();


        for (int i = 0; i < rows; i++) {
            List<Integer> sublist = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                System.out.println("add number");
                int p = scanner.nextInt();
                sublist.add(p);
            }
            list.add(sublist);
        }
        System.out.println(list);
        System.out.println("please enter the number you want to search");
        int num = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(list.get(i).get(j)==num){
                    System.out.println(i+" "+j);
                }

            }
        }
       System.out.println(list.indexOf(num));

    }
}
