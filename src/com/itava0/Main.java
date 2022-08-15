package com.itava0;

public class Main {
    public static void main(String[] args) {

        Dog shadow = new Dog("Shadow", 5);
        shadow.speak();
        shadow.setAge(3);
        System.out.println(shadow.getAge());


        Dog bill = new Dog("Bill", 4);
        bill.speak();

        Dog tim = new Dog("Tim", 9);
        System.out.println(Dog.count);

        Cat sheila = new Cat("Sheila", 2, 1);
        sheila.speak();

    }

}
