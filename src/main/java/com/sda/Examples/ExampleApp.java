package com.sda.Examples;

import java.time.LocalDate;

public class ExampleApp {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.getClass().getCanonicalName());
        Object ob = new Object();
        System.out.println(ex.toString());

        Person person = new Person("Łukasz", "Kowalski", LocalDate.now(),187);

        System.out.println(person.toString());
    }
}
