package com.sda.Examples;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PersonApp {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person person1 = new Person("Karol", "Koltun", LocalDate.now(), 184);
        Person person2 = new Person("Karol", "Nowak", LocalDate.now(), 165);
        Person person3 = new Person("Ala", "Nowak", LocalDate.now(), 198);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        System.out.println(people);

        System.out.println(person1.equals(person2));

        System.out.println();

        List<Person> people2 = List.of(new Person("Karol", "Koltun", LocalDate.now(), 184),
                new Person("Karol", "Nowak", LocalDate.now(), 165),
        new Person("Ala", "Nowak", LocalDate.now(), 198));

        for (int i = 0; i < people2.size(); i++) {
            print(people2.get(i));
        }

        for (Person person : people2) {
            print(person);
        }

        Iterator<Person> iterator = people2.iterator();
        while (iterator.hasNext()){
            print(iterator.next());
        }

        /// dokończyć

        System.out.println(people2);
//        Collections.sort(people2);


    }

    private static void print(Person person){
        System.out.println(person);
    }
//
//    private static Person getHighestBornIn(List<Person> people, LocalDate date){
//        List<Person>;
//    }


}
