package com.sda.io.serialization;

import java.util.ArrayList;
import java.util.List;

public class Group {

    List<Person> listOfPersons = new ArrayList<>();

    void addPerson(Person person){
        listOfPersons.add(person);
    }

    void delPerson(Person person) {
        listOfPersons.remove(person);
    }


}
