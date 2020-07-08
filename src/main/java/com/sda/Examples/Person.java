package com.sda.Examples;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{
    String firstName;
    String lasName;
    LocalDate dateofBirth;
    int height;

    public String getFirstName() {
        return firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public int getHeight() {
        return height;
    }

    public Person(String firstName, String lasName, LocalDate dateofBirth, int height) {
        this.firstName = firstName;
        this.lasName = lasName;
        this.dateofBirth = dateofBirth;
        this.height = height;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lasName + " " + dateofBirth + " " + height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return height == person.height &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lasName, person.lasName) &&
                Objects.equals(dateofBirth, person.dateofBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lasName, dateofBirth, height);
    }

    @Override
    public int compareTo(Person o) {
        return this.height - o.height;
    }


}
