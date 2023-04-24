package groomingSessionClassWork;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {


    public static void main(String[] args) {
        Map<Integer, String> m = new LinkedHashMap<Integer, String>();
        m.put(11, "audi");
        m.put(null, null);
        m.put(11, "bmw");
        m.put(null, "fer");
        System.out.println(m.size());
        System.out.println(m);


    }


}