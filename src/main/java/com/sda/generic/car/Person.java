package com.sda.generic.car;

public class Person extends AbstractPerson{

    public Person(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    void introduceYourself() {
        System.out.println("Person: Name: " + firstName + ", last name: " + lastName);
    }
}
