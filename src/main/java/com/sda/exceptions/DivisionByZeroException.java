package com.sda.exceptions;

public class DivisionByZeroException extends RuntimeException{
    double a;
    double b;

    public DivisionByZeroException(double a, double b) {
        super("Error when dividing " + a + " by " + b + ". Division by zero is forbidden.");
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
