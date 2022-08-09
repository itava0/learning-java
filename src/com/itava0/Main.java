package com.itava0;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Sets and Lists
        Set<Integer> t = new HashSet<Integer>();
        //Collection of unordered and unique items
        t.add(5);
        t.add(7);
        t.add(6);

       boolean x = t.contains(5);

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.get(0);
        num.set(1, 5);

        System.out.println(num);
    }

}
