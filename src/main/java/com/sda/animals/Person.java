package com.sda.animals;

public class Person {

        private Animal animal;

        void showAnimal() {
            animal.introduce();
            animal.makeSound();
            animal.makeTrick();
        }

        void setAnimal (Animal animal){
            this.animal = animal;
        }

}
