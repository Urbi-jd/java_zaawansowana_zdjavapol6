package com.sda.calc;

public class Multiplication implements MathematicalOperation{
    @Override
    public double calculate(double x, double y) {
        return x * y;
    }
}
