package com.sda.group;

import java.util.Comparator;

public class ComparatorByDateOfBirth implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        int number;
        if((o1.getDateOfBirth().getYear() - o2.getDateOfBirth().getYear()) !=0){
            number = o1.getDateOfBirth().getYear() - o2.getDateOfBirth().getYear();
        } else
            number = 0;
        return number;
    }
}
