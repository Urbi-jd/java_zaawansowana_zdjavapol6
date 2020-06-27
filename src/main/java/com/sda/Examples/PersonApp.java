package com.sda.Examples;

import java.time.LocalDate;

public class PersonApp {

    public static void main(String[] args) {

        Person_Collections person1 = new Person_Collections("Karol", "Koltun", LocalDate.now());
        Person_Collections person2 = new Person_Collections("Karol", "Koltun", LocalDate.now());

        System.out.println(person1.equals(person2));


    }
}
