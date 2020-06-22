package com.sda.vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();

        vehicle1.run(100.0);
        vehicle1 = new Car();
        vehicle1.run(50);

        System.out.println();
        System.out.println();

        Car car = new Car();

        car.addPassenger();
        car.addPassenger();

        System.out.println(car);
        car.removePassenger();
        System.out.println(car);


        car.run(120);

    }
}
