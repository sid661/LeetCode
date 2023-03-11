package leetcodeproblems;

import java.util.Scanner;

    /*
         Rahul is playing a game,wherein he has multiple colored wooden blocks,stacked one above
        the other,his task is to remove all the wooden blocks from the stack,without
        letting them fall and in the minimum number of steps.He can remove one block
        of color at a time,but he can remove multiple blocks of the same color together
        .Determine the minimum number of steps in which he can perform this task
        Sample Input = 4
        red
        white
        white
        red
        Sample Output = 2
        Explanation
        Remove [white, white] first
        The array will be [red, red]
        The remaining numbers can be removed in one strap*/

public class BlockCoding {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        String[] arr = new String[]{"red","white","white","red"};
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.next();
//        }
        int white = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("white")) {
                flag = true;

            } else {
                white++;
                flag = false;
            }

        }
        System.out.println(white + 1);
    }
}
