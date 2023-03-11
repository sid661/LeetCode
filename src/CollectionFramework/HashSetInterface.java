package CollectionFramework;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class HashSetInterface {
    public static void main(String[] args) {
        Set<Integer> a1 = new HashSet<>();
        Set<Integer> a2 = new HashSet<>();
        a1.add(1);a1.add(2);a1.add(3);a1.add(4);
        a2.add(5);a2.add(6);a2.add(7);a2.add(1);

        for(int x : a1){
            for(int y: a2){
                if(x==y){
                    System.out.println(x);
                }
            }
        }

      TreeSet<Integer> a3 = new TreeSet<>();
        a3.addAll(a1);


        System.out.println(a3.pollFirst());

        Integer y =a3.pollLast();
        System.out.println(y);
        System.out.println(a3);


    }
}
