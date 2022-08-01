package com.itava0;

public class Main {
    public static void main(String[] args) {
        // Arrays
        String[] names = {"Anna", "Ali", "Bob", "Mike"};

        for (String name : names) {
            if (name.equals("Mike")) {
                break;
            }
            System.out.println(name);
        }
    }
}
