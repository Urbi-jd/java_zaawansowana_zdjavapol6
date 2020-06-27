package com.sda.calc;

public class Addition implements MathematicalOperation{
    @Override
    public double calculate(double x, double y) {
        return x + y;
    }
}
