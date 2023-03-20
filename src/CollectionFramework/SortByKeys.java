package CollectionFramework;

import java.util.*;
import java.util.stream.Collectors;

public class SortByKeys {
    public static void main(String[] args) {
        HashMap<String,Integer> ddr = new HashMap<>();

        ddr.put("Jayant", 80);
        ddr.put("Abhishek", 90);
        ddr.put("Anushka", 80);
        ddr.put("Amit", 75);
        ddr.put("Danish", 40);



      ddr.entrySet().stream().sorted((x,y)->x.getKey().compareTo(y.getKey()))
              .collect(Collectors.toMap(
                      Map.Entry :: getKey,
                      Map.Entry :: getValue,
                      (e1,e2)->e1, LinkedHashMap::new
              ));

        System.out.println(ddr);
    }
}
