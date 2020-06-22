package com.sda.geometry;

public abstract class FlatShape {
    protected double x;
    protected double y;

    public FlatShape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printDimensions(){
        System.out.println(
                String.format(getClass().getName() + "width: %s, height: %s", x, y)
        );
    }

    abstract double getArea();
}
