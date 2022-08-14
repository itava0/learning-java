package com.itava0;

public class Cat extends Dog {

    private int food;
    //Need a constructor to inherent properties
    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    public void speak() {
        System.out.println("Meow my name is " + this.name + " and I get fed " + this.food);
    }
}
