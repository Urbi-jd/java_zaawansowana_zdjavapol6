package com.sda.animals;

public class Cat extends Animal{
    @Override
    public void introduce() {
        System.out.println("I'm cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void makeTrick() {
        System.out.println("chase the ball");
    }
}
