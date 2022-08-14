package com.itava0;

public class Dog {
    public String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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
}