package com.sda.io.serialization;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private String firstName;
    private String lasName;
    private LocalDate dateofBirth;
    private int height;

    public Person(String firstName, String lasName, LocalDate dateofBirth, int height) {
        this.firstName = firstName;
        this.lasName = lasName;
        this.dateofBirth = dateofBirth;
        this.height = height;
    }

}
