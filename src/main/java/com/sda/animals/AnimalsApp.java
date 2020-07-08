package com.sda.animals;

public class AnimalsApp {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Person person = new Person();

        person.setAnimal(dog);
        person.showAnimal();

        person.setAnimal(cat);
        person.showAnimal();
    }
}
