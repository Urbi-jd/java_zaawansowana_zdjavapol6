package com.sda.geometry;

import java.awt.*;

public class Rectangle extends FlatShape {

    Rectangle(double x, double y){
        super(x,y);
    }

    @Override
    double getArea() {
        return x*y;
    }
}
