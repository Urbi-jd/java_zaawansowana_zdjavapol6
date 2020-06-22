package com.sda.Examples;

public class Greeter {
   public static void main(String[] args) {

       greet("Cześć", "Michał");

    }

    static void greet() {
        System.out.println("Hello World!");
    }

    static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    static void greet(String greeting, String name) {
       String message = String.format("%s, %s!", greeting, name);
        System.out.println(message);
    }
}
