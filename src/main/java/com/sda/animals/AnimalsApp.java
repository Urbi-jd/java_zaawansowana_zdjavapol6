package com.sda.animals;

public class AnimalsApp {
    public static void main(String[] args) {
        Animal dog = new Dog();

        Person person = new Person();

        person.setAnimal(dog);
    }
}
