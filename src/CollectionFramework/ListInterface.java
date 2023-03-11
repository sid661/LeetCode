package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        Collection<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(6);
        arr1.addAll(arr);

        System.out.println(arr1);


        System.out.println("------------------------");
        arr1.forEach(System.out::println);


        Iterator<Integer> r = arr1.listIterator();
        System.out.println("---------------------");
        while(r.hasNext()){
            System.out.println(r.next());
        }




    }


}
