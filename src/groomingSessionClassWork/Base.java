package groomingSessionClassWork;

import java.util.ArrayList;
import java.util.Optional;

public class Base {
    public static int check(int N) {
        ArrayList<Integer> v = new ArrayList<Integer>();
        while (N > 0) {
            int n = N, m = 0, p = 1;
            while (n > 0) {
                if (n % 10 != 0)
                    m = m + p;

                n = n / 10;
                p = p * 10;
            }

            v.add(m);
            N = N - m;
        }
        for (int i = 0; i < v.size(); i++)
            System.out.print(" " + v.get(i));

        return 0;
    }

    public static void main(String[] args) {
        check(32);
    }


}