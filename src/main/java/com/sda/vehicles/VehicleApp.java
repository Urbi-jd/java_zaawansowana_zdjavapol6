package com.sda.vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.run(130);
        System.out.println(vehicle1);

        System.out.println();

        Car car = new Car();
        car.addPassenger();
        car.run(112.5);
        System.out.println(car);
        System.out.println();

        System.out.println();

        Vehicle truck = new Truck();
        truck.run(120);
        System.out.println(truck);
        ((Truck) truck).addPackages();
        System.out.println(truck);

        StyledCar styledCar = new StyledCar();

        Car car2 = new Car(car);
        System.out.println("Oryginalny samochód: " + car);
        System.out.println("Skopiowany samochód: " + car2);
        Car car3 = new Car(6);
        System.out.println("Car with number of passengers: " + car3);

        System.out.println();


        car.addPassenger();
        car.addPassenger();
        car.addPassenger();
        car.addPassenger();
        car.addPassenger();

        System.out.println(car);
        car.removePassenger();
        System.out.println(car);


        car.run(120);

        ConvertibleCar convCar = new ConvertibleCar();
        convCar.openRoof();
        convCar.openRoof();
        convCar.closeRoof();
        convCar.closeRoof();

    }
}
