package com.sda.animals;

public class Dog extends Animal {


    @Override
    public void introduce() {
        System.out.println("I'm dog");
    }

    @Override
    public void makeSound() {
        System.out.println("hau, hau");
    }

    @Override
    public void makeTrick() {
        System.out.println("aport");
    }
}
