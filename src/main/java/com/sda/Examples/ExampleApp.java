package com.sda.Examples;

public class ExampleApp {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.getClass().getCanonicalName());
        Object ob = new Object();
        System.out.println(ex.toString());

        Person person = new Person("Łukasz", "Kowalski");

        System.out.println(person.toString());
    }
}
