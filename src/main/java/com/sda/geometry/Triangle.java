package com.sda.geometry;

public class Triangle extends FlatShape{
    double z;
    double h;

    public Triangle(double x, double y, double z, double h) {
        super(x, y);
        this.z = z;
        this.h = h;
    }

    @Override
    double getArea() {
        return x * h / 2;
    }

    @Override
    public void printDimensions() {
        System.out.println(String.format(getClass().getName() +
                " bok a: %s, bok b: %s, bok c: %s, wysokość: %s", x, y, z, h));
    }
}
