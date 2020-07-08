package com.sda.generic.car;

public abstract class AbstractPerson {
    protected String firstName;
    protected String lastName;

    public AbstractPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    abstract void introduceYourself();
}
