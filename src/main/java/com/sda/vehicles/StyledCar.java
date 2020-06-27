package com.sda.vehicles;

public class StyledCar extends Car{
    String nameOfStyle;

    public StyledCar() {
        super.velocity = 0;
        super.passengers = 0;
        nameOfStyle = "style1";
        System.out.println("Empty StyledCar constructor");
    }

}
