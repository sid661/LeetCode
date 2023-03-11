package groomingSessionClassWork;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 4, 4, 5, 6, 6, 7, 2};
        count(a);
    }

    public  static void count(int []a){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int c = map.get(a[i]);
                map.replace(a[i], c + 1);
            } else
                map.put(a[i], 1);
        }
        System.out.println("number  count");
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            System.out.println("  " + i.getKey() + "          " + i.getValue());
        }
    }
}

