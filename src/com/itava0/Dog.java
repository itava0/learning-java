package com.itava0;

public class Dog {

    protected static int count = 0;
    public String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        Dog.count += 1;
        Dog.display();
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I'm " + this.age + " years old");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void display() {
        System.out.println("I am a dog");
    }
}
