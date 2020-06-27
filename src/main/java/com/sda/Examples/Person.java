package com.sda.Examples;

public class Person {
    String authorFirstName;
    String authorLasName;

    public Person(String authorFirstName, String authorLasName) {
        this.authorFirstName = authorFirstName;
        this.authorLasName = authorLasName;
    }

    @Override
    public String toString() {
        return "autor: " + authorFirstName + ' ' + authorLasName;
    }
}
