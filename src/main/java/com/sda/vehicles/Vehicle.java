package com.sda.vehicles;

public class Vehicle {
    Vehicle(){
        System.out.println("Empty vehicle constructor");
    }

    public void run(double velocity){
        System.out.println("Vehicle running at speed " + velocity);
    }



    @Override
    public String toString() {
        return "Vehicle{}";
    }
}
