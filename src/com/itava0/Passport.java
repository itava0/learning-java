package com.itava0;

import java.time.LocalDate;

public class Passport {
    String number;
    LocalDate expireDate;

    Passport(String number, LocalDate expireDate) {
        this.number = number;
        this.expireDate = expireDate;
    }
}
