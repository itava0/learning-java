package com.itava0;
public class Main {
    public static void main(String[] args) {
        // Classes and Objects
        Lens lensOne = new Lens("sony", "85mm", true);

        System.out.println(lensOne.brand);
    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        //Constructor
        Lens(String brand, String focalLength, boolean isPrime) {
                this.brand = brand;
                this.focalLength = focalLength;
                this.isPrime = isPrime;
        }

    }
}
