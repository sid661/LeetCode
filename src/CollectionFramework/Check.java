package CollectionFramework;

import java.util.HashSet;

public class Check {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("Red");
        hset.add("Green");
        hset.add("Black");
        hset.add("White");

        HashSet<String> hset2 = new HashSet<String>();
        hset2.add("Red");
        hset2.add("Green");
        hset2.add("Black");
        hset2.add("White");

        if (hset.size() == hset2.size()) {
            boolean ddr = true;
            for (String element : hset) {

              ddr = hset2.contains(element);
                if(ddr==false){
                    System.out.println("not equal");
                    break;
                }
            }
            if(ddr==true){
                System.out.println("equal");
            }
        } else {
            System.out.println("sets are not equal");
        }

    }

}

