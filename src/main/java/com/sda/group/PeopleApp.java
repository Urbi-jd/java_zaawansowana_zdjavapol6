package com.sda.group;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class PeopleApp {
    public static void main (String [] args) {

        Person person1 = new Person("Bartek", "Nowak", LocalDate.of(1990,1, 5));
        Person person2 = new Person("Michał", "Nowak", LocalDate.of(1991,3, 5));
        Person person3 = new Person("Anna", "Nowak",LocalDate.of(1985,1, 5));
        Person person4 = new Person("Bartek", "Nowak", LocalDate.of(2001,7, 7));
        Person person5 = new Person("Justyna", "Nowak", LocalDate.of(1990,1, 4));

        Set<Person> people = new HashSet<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        System.out.println(people);

        Group group = new Group();
        group.groupPeople.addAll(people);

        group.searchByName("Justyna");
        group.searchByLastName("Nowak");
        group.searchByDate(LocalDate.of(1990,1, 4));
        group.todayBirthday();
        System.out.println();
        group.sortFromYangest();


        Map<Integer, Person> newMap = group.setMap();
        System.out.println(newMap.get(3));



    }


}
