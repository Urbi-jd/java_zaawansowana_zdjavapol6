package com.sda.Examples;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;

import static java.time.LocalDate.now;

public class PersonApp {

    public static void main(String[] args) {

        Person person1 = new Person("Karol", "Koltun", now(), 184);
        Person person2 = new Person("Karol", "Nowak", now(), 175);
        Person person3 = new Person("Ala", "Nowak", now().minusYears(1), 165);
        Person person4 = new Person("Ala", "Nowak", now().minusYears(1), 172);

        System.out.println(person1.equals(person2));

        System.out.println("----------- HashSet -----------");

        Set<Person> people = new HashSet<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);


        System.out.println(people);

        System.out.println();
        people.remove(person1);

        System.out.println(people);

        System.out.println("------- iterator -----------");

        Iterator<Person> iterator1 = people.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("------- iterator 2 -----------");
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);
        peopleList.add(person4);

        Iterator<Person> iterator2 = peopleList.iterator();

        while (iterator2.hasNext()) {
            print(iterator2.next());
        }

        System.out.println("--------------- consumer 1 ---------");
        Consumer<Person> consumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                print(person);
            }
        };
        peopleList.forEach(consumer);


        System.out.println("--------------- consumer 2 ----------");

        Consumer<Person> consumer1 = el -> print(el);
        peopleList.forEach(consumer1);

        // sortowanie 1 tablica liczb
        int[] numbersTab = {17, 80, -12, 15};
        for (int number : numbersTab) {
            System.out.print(number + ", ");
        }
        System.out.println();
        Arrays.sort(numbersTab);
        for (int number : numbersTab) {
            System.out.print(number + ", ");
        }
        System.out.println();

        List<String> texts = new ArrayList<>();
        texts.add("1Ala");
        texts.add("10Karol");
        texts.add("Maria");
        System.out.println(texts);
        texts.sort(null);
        System.out.println(texts);

        // Sortowanie po wzroście bo w Person jest compareTo i Person implements Comparable<Person>
        List<Person> people1 = Arrays.asList(person1, person2, person3, person4);
        System.out.println(people1); // wyświetl nieposortowaną
        Collections.sort(people1);  // sortowanie
        System.out.println(people1);


        Optional<Person> optionalHighest = getHighestBornIn(people1, now());
            if(optionalHighest.isPresent()){
                Person person = optionalHighest.get();
                System.out.println(person);
            }
        }
//        System.out.println(getHighestBornIn(people1, now().minusDays(1)));




    private static Optional<Person> getHighestBornIn(List<Person> people, LocalDate dayOfBirth) {
        List<Person> personsWithDate = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).dateofBirth.equals(dayOfBirth)) {
                personsWithDate.add(people.get(i));
            }
        }
        if(personsWithDate.isEmpty()){
            return Optional.empty();
        }

        personsWithDate.sort(Comparator.reverseOrder());
        return Optional.of(personsWithDate.get(0));
    }



    private static void print(Person person) {
        System.out.println(person);
    }


}
