package com.sda.vehicles;

public class ConvertibleCar extends Car{
    boolean roofOpened;

    ConvertibleCar(){
        super.velocity = 0;
        roofOpened = false;
        System.out.println("Empty ConeribleCar constructor");
    }

    void openRoof(){
        if(!roofOpened) {
            roofOpened = true;
            System.out.println("otwieram dach");
        } else
            System.out.println("dach już otwarty");
    }

    void closeRoof(){
        if(roofOpened) {
            roofOpened = false;
            System.out.println("zamykam dach");
        }else
            System.out.println("dach już zamknięty");
    }

}
