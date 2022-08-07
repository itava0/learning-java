package com.itava0;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Classes and Objects
        Lens lensOne = new Lens("sony", "85mm", true);

        System.out.println(lensOne.brand);

        Passport usPassport = new Passport("1254", LocalDate.of(2025, 1, 16));
        System.out.println("US Passport");
        System.out.println(usPassport.number);
        System.out.println(usPassport.expireDate);
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
