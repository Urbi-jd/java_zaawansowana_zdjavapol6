package com.sda.vehicles;

public class Car extends Vehicle {

    int passengers;

    Car(){
        System.out.println("Empty Car constructor");
    }

    void addPassenger(){
        ++passengers;
        System.out.println("Added passangers. Current number " + passengers);
    }
    void removePassenger() {
        if (passengers < 1) {
            return;
        }
        --passengers;
        System.out.println("Removed passenger. Current number " + passengers);

    }

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + passengers +
                '}';
    }

    @Override
    public void run(double velocity) {
        System.out.println("Car running at speed " + velocity);;
    }
}
