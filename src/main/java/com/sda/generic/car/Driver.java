package com.sda.generic.car;

public class Driver extends Person{

    String drivingStyle;

    public Driver(String firstName, String lastName, String drivingStyle) {
        super(firstName, lastName);
        this.drivingStyle = drivingStyle;
    }

    @Override
    void introduceYourself() {
        System.out.println("Driver: Name: " + firstName + ", last name: " + lastName +
                " driving style: " + drivingStyle);
    }

    void drive (){
        System.out.println("Drive !");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingStyle='" + drivingStyle + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "} ";
    }
}
