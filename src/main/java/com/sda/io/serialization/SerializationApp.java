package com.sda.io.serialization;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class SerializationApp {
    public static void main(String[] args) throws IOException {

        try(FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutput objectOutput = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInput objectInput = new ObjectInputStream(fis)) {
            Person person1 = new Person("Lukasz", "Koński", LocalDate.of(2000,01,25),160);
            Person person2 = new Person("Mariusz", "Koński", LocalDate.of(2000,01,25),160);

//            List<Person> people = List.of(person1, person2);
//            ObjectOutput.writeObject(people);
//
//            Object object = objectInput.readObject();
//            List<Person> inputPeople =
//
//            dkończyć
        }


    }
}
