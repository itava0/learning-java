package com.itava0;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sets and Lists
        Set<Integer> t = new HashSet<>();
        //Collection of unordered and unique items
        t.add(5);
        t.add(7);
        t.add(6);

        System.out.println("Sets " + t);

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.set(1, 5);

        System.out.println("ArrayList " + num);


        //Maps and HashMaps

        //Similar to Dictionary in python, it stores data values in key:value pairs.
        Map m = new HashMap();
        m.put("tim", 5);
        m.put("joe", 6);
        m.put("bob", 7);


        System.out.println("Map " + m);
    }

}
