package com.sda.vehicles;

public class Motorcycle extends Vehicle{

    @Override
    public double run(double velocity) {
        System.out.println("Motorcycle running: " + velocity);
        return super.run(velocity);

    }
}
