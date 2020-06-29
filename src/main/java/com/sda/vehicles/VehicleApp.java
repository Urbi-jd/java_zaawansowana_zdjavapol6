package com.sda.vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run(100);
        System.out.println(vehicle);

        vehicle = new Car();

        System.out.println(vehicle);


    }
}
