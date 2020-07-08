package com.sda.triangles;

public class CannotBuildTriangleException extends RuntimeException{
    double a;
    double b;
    double c;

    public CannotBuildTriangleException( double a, double b, double c) {
        super("Error when making triangle: longest side cant't be longer then sum of shorter sides");
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
