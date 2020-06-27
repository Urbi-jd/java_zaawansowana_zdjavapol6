package com.sda.geometry;

public class ShapeApp {
    public static void main(String[] args) {
        FlatShape triangle = new Triangle( 2, 3, 4, 3.5);
        System.out.println(triangle.getArea());
        triangle.printDimensions();

        FlatShape rectangle = new Rectangle(5, 7);
        System.out.println(rectangle.getArea());
        rectangle.printDimensions();
    }
}
