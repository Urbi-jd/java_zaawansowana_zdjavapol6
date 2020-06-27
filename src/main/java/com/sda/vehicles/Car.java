package com.sda.vehicles;

public class Car extends Vehicle {

    int passengers;


    Car(){
        super.velocity = 0;
        System.out.println("Empty Car constructor");
    }

    Car(Car anotherCar){
        passengers = anotherCar.passengers;
        super.velocity = anotherCar.velocity;
    }

    Car(int passengers){
        if(passengers > 4){
            System.out.println("Max passengers 4");
            this.passengers = 4;

        } else
        this.passengers = passengers;
    }






    public void addPassenger(){
        if(passengers < 4) {
            ++passengers;
            System.out.println("Added passangers. Current number " + passengers);
        } else
            System.out.println("Max passangers number reached. Can't add");
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
                ", volocity=" + velocity +
                "} ";
    }

    @Override
    public double run(double velocity) {
        System.out.println("Car running at speed " + velocity);
        return this.velocity = velocity;
    }
}
