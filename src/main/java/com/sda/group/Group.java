package com.sda.group;


import java.time.LocalDate;

import java.util.*;

import static java.time.LocalDate.*;

public class Group {

    List<Person> groupPeople = new ArrayList<>();


    public void searchByName(String name) {
        System.out.println("-- searching by name --");

        for (Person person : groupPeople) {
            if (person.getFirstName().equals(name)) {
                System.out.println(person);
            }
        }
    }

    public void searchByName2(String name) {
        System.out.println("-- searching by name2 --");

        for (Person person : groupPeople) {
            if (person.getFirstName().startsWith(name)) {
                System.out.println(person);
            }
        }
    }

    public void searchByLastName(String lastName) {
        System.out.println("-- searching by last name --");

        for (Person groupPerson : groupPeople) {
            if (groupPerson.getLastName().equals(lastName)) {
                System.out.println(groupPerson);
            }
        }
    }

    public void searchByDate(LocalDate date) {
        System.out.println("-- searching by date --");
        for (Person groupPerson : groupPeople) {
            if (groupPerson.getDateOfBirth().equals(date)) {
                System.out.println(groupPerson);
            }
        }
    }

    public void todayBirthday() {
        System.out.println("-- who have birthday --");
        for (Person groupPerson : groupPeople) {
            if (groupPerson.getDateOfBirth().getDayOfMonth() == now().getDayOfMonth() &&
                    groupPerson.getDateOfBirth().getMonthValue() == now().getMonthValue()) {
                System.out.println(groupPerson);
            }
        }
    }

    void sortFromYangest() {
        System.out.println("-- sotred from yangest --");
        groupPeople.sort(new ComparatorByDateOfBirth().reversed());
        System.out.println(groupPeople);
    }

    Map<Integer, Person> birthdayByMonth2 = new HashMap<>();

    public Map<Integer, Person> setMap() {
        System.out.println("-- making map --");
        Map<Integer, Person> birthdayByMonth = new HashMap<>();
        for (Person groupPerson : groupPeople) {
            birthdayByMonth.put(groupPerson.getDateOfBirth().getMonthValue(),
                    groupPerson);
        }
        return birthdayByMonth;
    }




}
