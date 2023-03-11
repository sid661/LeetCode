package GroomingSessionHomeWork;

import java.util.HashMap;
import java.util.Map;

public class Occurence {
    public static void main(String[] args) {
        int array[] = new int[]{20, 40, 50, 40, 50, 20,30, 30, 30, 50, 20, 40, 40, 20};
        int result = findOccurence(array, array.length);
        findHashOccurence(array,array.length);

    }

    public static int findOccurence(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }

    public static void findHashOccurence(int [] arr , int n) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hmap.containsKey(arr[i])) {
                int val = hmap.get(arr[i]);

                hmap.put(arr[i], val + 1);
            } else
                hmap.put(arr[i], 1);
        }
        System.out.println(hmap);
        for (Map.Entry<Integer,Integer> a : hmap.entrySet()) {
            if (a.getValue()%2!=0){
                System.out.println(a.getKey()+" "+a.getValue());
            }

        }


    }
}
