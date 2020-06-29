package com.sda.Examples;

public class Greeter {
    public static void main(String[] args) {

        greet();

        greet("Łukasz");

        greet("Siema!", "Mati");


    }

    static void greet() {
        greet("World");
    }

    static void greet(String name) {
        greet("Hello", name);
    }

    static void greet(String greeting, String name) {
        String message = String.format("%s, %s!", greeting, name);
        System.out.println(message);
    }
}
