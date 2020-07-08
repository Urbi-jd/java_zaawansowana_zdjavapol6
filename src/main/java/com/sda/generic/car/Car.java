package com.sda.generic.car;

import java.util.ArrayList;
import java.util.List;

public class Car<D extends Driver, P extends AbstractPerson> {

    D driver;

    List<AbstractPerson> passengerList = new ArrayList<>();


    void setDriver(D newDriver) {
        if (driver == null) {
            driver = newDriver;
            driver.introduceYourself();
            driver.drive();
        } else {
            System.out.print("Driver is already set. ");
            driver.introduceYourself();
        }
    }

    void addPassenger(P persona) {
        if (passengerList.size() < 4) {
            passengerList.add(persona);
            persona.introduceYourself();
        } else
            System.out.println("to many passengers");
    }

//    void addPassenger(String firstName, String lastName){
//        if(passengerList.size() < 4){
//            AbstractPerson person = new AbstractPerson(firstName, lastName) {
//                @Override
//                void introduceYourself() {
//                    System.out.println("Passenger: Name: " + firstName + ", last name: " + lastName);
//                }
//            };
//            passengerList.add(person);
//            person.introduceYourself();
//        }else
//            System.out.println("to many passengers");
//    }

}
