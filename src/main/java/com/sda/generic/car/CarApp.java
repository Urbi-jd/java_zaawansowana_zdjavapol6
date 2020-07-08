package com.sda.generic.car;

public class CarApp {
    public static void main(String[] args) {

        Car<Driver, AbstractPerson> car = new Car<>();
        car.setDriver(new Driver("Lukasz", "Nowak", "fast"));
        car.setDriver(new Driver("Mateusz", "Nowak", "fast"));
        System.out.println();

        car.addPassenger(new AbstractPerson("Mati", "Kovalsky") {
            @Override
            void introduceYourself() {
                System.out.println("Passenger: Name: " + firstName + ", last name: " + lastName);
            }
        });

        car.addPassenger(new AbstractPerson("Marti", "Kovalsky") {
            @Override
            void introduceYourself() {
                System.out.println("Passenger: Name: " + firstName + ", last name: " + lastName);
            }
        });

        Driver driver = new Driver("Max", "Belka", "Slow");
        car.addPassenger(driver);

        car.addPassenger(new AbstractPerson("Miki", "Novak") {
            @Override
            void introduceYourself() {
                System.out.println("Passenger: Name: " + firstName + ", last name: " + lastName);
            }
        });

        car.addPassenger(new AbstractPerson("Aga", "Kovalsky") {
            @Override
            void introduceYourself() {
                System.out.println("Passenger: Name: " + firstName + ", last name: " + lastName);
            }
        });

        car.addPassenger(new AbstractPerson("Nika", "Kovalsky") {
            @Override
            void introduceYourself() {
                System.out.println("Passenger: Name: " + firstName + ", last name: " + lastName);
            }
        });


//        car.addPassenger("Mati", "Kovalsky");
//        car.addPassenger("Marti", "Kovalsky");
//        car.addPassenger("Miki", "Novak");
//        car.addPassenger("Aga", "Kovalsky");
//        car.addPassenger("Nika", "Kovalsky");


    }
}
