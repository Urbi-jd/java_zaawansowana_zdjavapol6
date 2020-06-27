package com.sda.vehicles;

public class Vehicle {
    double velocity;

    Vehicle() {
        velocity = 0;
        System.out.println("Empty vehicle constructor");
    }

    public double run(double velocity) {
        System.out.println("Vehicle running at speed " + velocity);
        return this.velocity = velocity;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "volocity=" + velocity +
                '}';
    }
}
