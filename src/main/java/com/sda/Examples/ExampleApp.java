package com.sda.Examples;

public class  ExampleApp {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.getClass().getCanonicalName());
        System.out.println(ex.toString());
        System.out.println(ex);
    }
}
